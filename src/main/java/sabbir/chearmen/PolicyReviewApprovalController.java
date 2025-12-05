package sabbir.chearmen;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class PolicyReviewApprovalController
{
    @javafx.fxml.FXML
    private TextArea policyDocumentArea;
    @javafx.fxml.FXML
    private Label policyTitleLabel;
    @javafx.fxml.FXML
    private TextArea chairmanCommentsArea;
    @javafx.fxml.FXML
    private ListView pendingPolicyList;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleApprovePolicy(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRejectPolicy(ActionEvent actionEvent) {
    }
}