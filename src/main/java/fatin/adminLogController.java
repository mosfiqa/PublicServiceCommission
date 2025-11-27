package fatin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Connection;
import java.sql.ResultSet;

public class AdminLogController
{
    @FXML
    private TableColumn<Log, Integer> colLogId;

    @FXML
    private TableColumn<Log, String> colActivity, colDate, colUser;

    @FXML
    private TextArea txtLogDetails;
    @FXML
    private TableColumn activityTableColumn;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @FXML
    private TableView<Log> tblLogs;
    ObservableList<Log> logs = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        colLogId.setCellValueFactory(f -> f.getValue().logIdProperty().asObject());
        colActivity.setCellValueFactory(f -> f.getValue().activityProperty());
        colDate.setCellValueFactory(f -> f.getValue().dateProperty());
        colUser.setCellValueFactory(f -> f.getValue().userProperty());

        loadLogs();
    }

    private void loadLogs() {
        logs.clear();
        try {
            Connection con = DBConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM logs");

            while (rs.next()) {
                logs.add(new Log(
                        rs.getInt("id"),
                        rs.getString("activity"),
                        rs.getString("date"),
                        rs.getString("user"),
                        rs.getString("details")
                ));
            }

            tblLogs.setItems(logs);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void ViewDetails() {
        Log log = tblLogs.getSelectionModel().getSelectedItem();
        if (log != null) {
            txtLogDetails.setText(log.getDetails());
        }
    }


    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }

}