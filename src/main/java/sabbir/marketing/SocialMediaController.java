package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SocialMediaController {

    @FXML private ComboBox<String> platformComboBox;
    @FXML private TextArea postContentTextArea;
    @FXML private TextField mediaUrlField;
    @FXML private DatePicker scheduleDatePicker;
    @FXML private TextField scheduleTimeField;
    @FXML private TextArea scheduledPostsDisplay;

    @FXML private Label previewContentLabel;
    @FXML private ImageView previewImageView;
    @FXML private Label clicksLabel;
    @FXML private Label reachLabel;
    @FXML private Label engagementLabel;
    @FXML private LineChart<?, ?> performancechart;


    @FXML
    private void handlePreviewPost(ActionEvent event) {
        previewContentLabel.setText(postContentTextArea.getText());
    }

    @FXML
    private void handleSchedulePost(ActionEvent event) {
        String platform = platformComboBox.getValue();
        String content = postContentTextArea.getText();

        System.out.println("Post scheduled for " + platform);
    }

    @FXML
    private void handleCancel(ActionEvent event) throws IOException {
        String fxmlFile = "sabbir/MarketingOfficerDashboard.fxml";
        String title = "Marketing Officer Dashboard";

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/" + fxmlFile));
        Parent root = loader.load();

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

    @FXML
    private void initialize() {
        platformComboBox.getItems().addAll("Facebook", "LinkedIn", "Instagram", "Twitter/X");
        clicksLabel.setText("1.5K");
        reachLabel.setText("50K");
        engagementLabel.setText("4%");
    }
}