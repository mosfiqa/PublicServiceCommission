package ela.logistics_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.*;
import java.util.ArrayList;

public class InventoryTrackingController {

    @javafx.fxml.FXML
    private TextField itemField;
    @javafx.fxml.FXML
    private TextField qtyField;
    @javafx.fxml.FXML
    private TextArea displayArea;

    ArrayList<InventoryItem> inventoryList;

    @javafx.fxml.FXML
    public void initialize() {
        inventoryList = new ArrayList<InventoryItem>();
    }

    @javafx.fxml.FXML
    public void addItemOnAction(ActionEvent actionEvent) {
        InventoryItem newItem = new InventoryItem(itemField.getText(), Integer.parseInt(qtyField.getText()));
        inventoryList.add(newItem);
        displayArea.appendText("Added: " + newItem.toString() + "\n");
        itemField.clear();
        qtyField.clear();
    }

    @javafx.fxml.FXML
    public void saveBinaryOnAction(ActionEvent actionEvent) {
        try {

            File f = new File("InventoryData.bin");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(inventoryList);
            oos.close();

            Alert i = new Alert(Alert.AlertType.INFORMATION);
            i.setContentText("Inventory list saved to binary file.");
            i.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void loadBinaryOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("InventoryData.bin");
            if(f.exists()){
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);


                inventoryList = (ArrayList<InventoryItem>) ois.readObject();

                displayArea.setText("--- LOADED FROM BINARY FILE ---\n");
                for(InventoryItem item : inventoryList){
                    displayArea.appendText(item.toString() + "\n");
                }
                ois.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}