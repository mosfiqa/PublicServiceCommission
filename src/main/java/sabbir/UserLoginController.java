package sabbir;

import com.example.myfinalproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserLoginController {
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private Label notificationLabel;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private Button loginbuttononaction;

    @javafx.fxml.FXML
    public void LoginButtonOnAction(ActionEvent actionEvent) {
        String userID = userIDTF.getText();
        String password = passwordTF.getText();

        if (userID.equals("1") && password.equals("1")){
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/sabbir/marketing/marketingofficerdashboardview.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage nextStage = new Stage();
                nextStage.setTitle("Marketing Officer Dashboard");
                nextStage.setScene(scene);
                nextStage.show();

                ((Stage) loginbuttononaction.getScene().getWindow()).close();

            }
            catch (Exception e){
                //
            }
        }
        else if (userID.equals("2") && password.equals("2")) {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/sabbir/chearmen/chearmendashboardview.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage nextStage = new Stage();
                nextStage.setTitle("Chairman Dashboard");
                nextStage.setScene(scene);
                nextStage.show();
                ((Stage) loginbuttononaction.getScene().getWindow()).close();
            }
            catch (Exception e){
                //
            }
        }
        else {
            notificationLabel.setText("Invalid User ID or Password.");
        }
    }
}