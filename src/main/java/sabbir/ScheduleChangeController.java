package sabbir;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ScheduleChangeController
{
    @javafx.fxml.FXML
    private Label selectedRequestLabel;
    @javafx.fxml.FXML
    private TextArea requestDetailsArea;
    @javafx.fxml.FXML
    private TableView pendingRequestsTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleRejectChange(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApproveChange(ActionEvent actionEvent) {
    }
}