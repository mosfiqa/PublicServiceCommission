package ela.accounts_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;

public class PaymentVerificationController {

    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TextArea feedbackTextArea;
    @javafx.fxml.FXML
    private TableView<Payment> paymentTableView;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> transactionIdTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> applicantIdTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, Integer> amountTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> statusTablecolumn;

    ArrayList<Payment> paymentList;

    @javafx.fxml.FXML
    public void initialize() {
        paymentList = new ArrayList<Payment>();


        transactionIdTablecolumn.setCellValueFactory(new PropertyValueFactory<Payment, String>("transactionId"));
        applicantIdTablecolumn.setCellValueFactory(new PropertyValueFactory<Payment, String>("applicantId"));
        amountTablecolumn.setCellValueFactory(new PropertyValueFactory<Payment, Integer>("amount"));
        statusTablecolumn.setCellValueFactory(new PropertyValueFactory<Payment, String>("status"));

        Payment p1 = new Payment("TXN-101", "APP-5001", 500, "Pending");
        Payment p2 = new Payment("TXN-102", "APP-5002", 500, "Pending");
        Payment p3 = new Payment("TXN-103", "APP-5003", 0, "Invalid");

        paymentList.add(p1);
        paymentList.add(p2);
        paymentList.add(p3);


        for(Payment p : paymentList){
            paymentTableView.getItems().add(p);
        }
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
        paymentTableView.getItems().clear();
        String query = searchTextField.getText();

        for (Payment p : paymentList) {
            if (p.getTransactionId().contains(query) || p.getApplicantId().contains(query)) {
                paymentTableView.getItems().add(p);
            }
        }
    }

    @javafx.fxml.FXML
    public void verifyButtonOnAction(ActionEvent actionEvent) {
        Payment selectedPayment = paymentTableView.getSelectionModel().getSelectedItem();

        if (selectedPayment == null) {
            Alert e = new Alert(Alert.AlertType.ERROR);
            e.setContentText("Please select a row from the table first.");
            e.show();
        }
        else if (selectedPayment.getAmount() <= 0) {
            feedbackTextArea.setText("Validation Failed: Invalid Amount.");
            Alert e = new Alert(Alert.AlertType.ERROR);
            e.setContentText("Payment amount must be positive.");
            e.show();
        }
        else {
            if (selectedPayment.getStatus().equals("Verified")) {
                feedbackTextArea.setText("Note: This payment is already verified.");
            } else {
                Alert c = new Alert(Alert.AlertType.CONFIRMATION);
                c.setContentText("Are you sure you want to verify?");
                c.showAndWait().ifPresent(response -> {
                    if (response == ButtonType.OK) {
                        selectedPayment.setStatus("Verified");
                        feedbackTextArea.setText("Success: Payment verified.");
                        paymentTableView.refresh();
                    }
                });
            }
        }
    }
}