package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private TableColumn statustablecoloum;
    @javafx.fxml.FXML
    private TableColumn amounttablecoloum;
    @javafx.fxml.FXML
    private TableColumn typetablecoloum;
    @javafx.fxml.FXML
    private TableColumn datetablecoloum;
    @javafx.fxml.FXML
    private TableColumn targettablecoloum;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleAllocateBudget(ActionEvent actionEvent) {
    }
}