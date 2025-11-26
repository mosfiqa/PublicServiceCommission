package sabbir;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BudgetController
{
    @javafx.fxml.FXML
    private TableView transactionTableView;
    @javafx.fxml.FXML
    private Label remainingBudgetLabel;
    @javafx.fxml.FXML
    private Label consumptionRateLabel;
    @javafx.fxml.FXML
    private ComboBox targetComboBox;
    @javafx.fxml.FXML
    private Label totalAllocatedLabel;
    @javafx.fxml.FXML
    private Label totalSpentLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleAllocateBudget(ActionEvent actionEvent) {
    }
}