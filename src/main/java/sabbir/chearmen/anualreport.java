package sabbir.chearmen;

public class anualreport {
    String year;

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "anualreport{" +
                "year='" + year + '\'' +
                '}';
    }

    public void setYear(String year) {
        this.year = year;
    }

    public anualreport(String year) {
        this.year = year;
    }
}
