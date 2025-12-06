package sabbir.marketing;

public class budget {
    int budget;
    String campaing;

    public budget(int budget, String campaing) {
        this.budget = budget;
        this.campaing = campaing;
    }

    @Override
    public String toString() {
        return "budget{" +
                "budget=" + budget +
                ", campaing='" + campaing + '\'' +
                '}';
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getCampaing() {
        return campaing;
    }

    public void setCampaing(String campaing) {
        this.campaing = campaing;
    }
}
