package ela.accounts_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReceiptGeneratorController {

    @javafx.fxml.FXML
    private TextField txnIdField;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private TextArea receiptArea;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReceiptOnAction(ActionEvent actionEvent) {
        // Simple preview logic
        String receipt = "--- PAYMENT RECEIPT ---\n" +
                "Txn ID: " + txnIdField.getText() + "\n" +
                "Amount: " + amountField.getText() + " BDT\n" +
                "Date: " + java.time.LocalDate.now() + "\n" +
                "Status: VERIFIED\n" +
                "-----------------------";
        receiptArea.setText(receipt);
    }

    @javafx.fxml.FXML
    public void saveToTextFileOnAction(ActionEvent actionEvent) {
        try {
            // Teacher Style: Create File and FileWriter
            File f = new File("Receipts_Log.txt");
            FileWriter fw;

            if(f.exists()) fw = new FileWriter(f, true);
            else fw = new FileWriter(f);

            fw.write(receiptArea.getText() + "\n\n");
            fw.close(); // Important to close!

            statusLabel.setText("Saved to Receipts_Log.txt");

            Alert i = new Alert(Alert.AlertType.INFORMATION);
            i.setContentText("Receipt saved successfully!");
            i.show();

        } catch (IOException e) {
            statusLabel.setText("Error saving file.");
        }
    }
}