package sabbir.chearmen;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UserAccessControlController
{
    @javafx.fxml.FXML
    private TextField selectedUserIdField;
    @javafx.fxml.FXML
    private Label accessUpdateStatusLabel;
    @javafx.fxml.FXML
    private TableView userAccessTable;
    @javafx.fxml.FXML
    private ComboBox newAccessLevelComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGrantSpecialAccess(ActionEvent actionEvent) {
    }
}