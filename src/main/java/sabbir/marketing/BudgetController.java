package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

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
    ArrayList<marketingdata> budgetpage;
    @javafx.fxml.FXML
    public void initialize() {
    budgetpage = new ArrayList<>();
    statustablecoloum.setCellValueFactory(new PropertyValueFactory<marketingdata, String>("status"));
    amounttablecoloum.setCellValueFactory(new PropertyValueFactory<marketingdata, String>("budget"));
    typetablecoloum.setCellValueFactory(new PropertyValueFactory<marketingdata, String>("campaingdiscription"));
    datetablecoloum.setCellValueFactory(new PropertyValueFactory<marketingdata, String>("sdate"));
    targettablecoloum.setCellValueFactory(new PropertyValueFactory<marketingdata, String>("campaingname"));
    budgetpage.add(marketingdata);
    transactionTableView.getItems().add(marketingdata);
    }

    @javafx.fxml.FXML
    public void handleAllocateBudget(ActionEvent actionEvent) {
    }
}