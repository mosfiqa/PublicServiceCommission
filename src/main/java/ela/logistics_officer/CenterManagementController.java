package ela.logistics_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;

public class CenterManagementController {

    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private Button searchButton;
    @javafx.fxml.FXML
    private TableView<ExamCenter> centerTableview;
    @javafx.fxml.FXML
    private TableColumn<ExamCenter, String> centerIdTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ExamCenter, String> centerNameTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ExamCenter, Integer> capacityTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ExamCenter, String> statusTablecolumn;
    @javafx.fxml.FXML
    private Button allocateButton;
    @javafx.fxml.FXML
    private Label statusLabel;

    ArrayList<ExamCenter> centerList;

    @javafx.fxml.FXML
    public void initialize() {
        centerList = new ArrayList<ExamCenter>();

        centerIdTablecolumn.setCellValueFactory(new PropertyValueFactory<ExamCenter, String>("centerId"));
        centerNameTablecolumn.setCellValueFactory(new PropertyValueFactory<ExamCenter, String>("centerName"));
        capacityTablecolumn.setCellValueFactory(new PropertyValueFactory<ExamCenter, Integer>("capacity"));
        statusTablecolumn.setCellValueFactory(new PropertyValueFactory<ExamCenter, String>("allocationStatus"));

        ExamCenter c1 = new ExamCenter("CEN-101", "Dhaka City College", 1500, "Available");
        ExamCenter c2 = new ExamCenter("CEN-102", "North South University", 2000, "Allocated");
        ExamCenter c3 = new ExamCenter("CEN-103", "Brac University", 1200, "Available");
        ExamCenter c4 = new ExamCenter("CEN-104", "Tejgaon College", 800, "Available");

        centerList.add(c1);
        centerList.add(c2);
        centerList.add(c3);
        centerList.add(c4);

        for (ExamCenter c : centerList) {
            centerTableview.getItems().add(c);
        }
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
        centerTableview.getItems().clear();
        String query = searchTextField.getText();

        for (ExamCenter c : centerList) {
            if (c.getCenterName().contains(query) || c.getCenterId().contains(query)) {
                centerTableview.getItems().add(c);
            }
        }
    }

    @javafx.fxml.FXML
    public void allocateButtonOnAction(ActionEvent actionEvent) {
        ExamCenter selectedCenter = centerTableview.getSelectionModel().getSelectedItem();

        if (selectedCenter == null) {
            statusLabel.setText("System Status: Error");
            Alert e1 = new Alert(Alert.AlertType.ERROR);
            e1.setContentText("Please select a center from the table first.");
            e1.show();
        }

        else if (selectedCenter.getAllocationStatus().equals("Allocated")) {
            statusLabel.setText("System Status: Center Already Full");
            Alert e2 = new Alert(Alert.AlertType.WARNING);
            e2.setContentText("This center is already allocated. Please choose an available center.");
            e2.show();
        }
        else {
            Alert c = new Alert(Alert.AlertType.CONFIRMATION);
            c.setContentText("Are you sure you want to allocate this center?");

            c.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    selectedCenter.setAllocationStatus("Allocated");

                    statusLabel.setText("System Status: Allocation Successful");
                    centerTableview.refresh();

                    Alert i = new Alert(Alert.AlertType.INFORMATION);
                    i.setContentText("Center allocated successfully.");
                    i.show();
                }
            });
        }
    }
}