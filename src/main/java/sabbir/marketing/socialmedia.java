package sabbir.marketing;

import javafx.scene.chart.PieChart;

import java.time.LocalDate;

public class socialmedia {
    String postcontent, platform, url;
    LocalDate schadule ;
    PieChart performance;

    @Override
    public String toString() {
        return "socialmedia{" +
                "postcontent='" + postcontent + '\'' +
                ", platform='" + platform + '\'' +
                ", url='" + url + '\'' +
                ", schadule=" + schadule +
                ", performance=" + performance +
                '}';
    }
    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent;
    }


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getSchadule() {
        return schadule;
    }

    public void setSchadule(LocalDate schadule) {
        this.schadule = schadule;
    }

    public PieChart getPerformance() {
        return performance;
    }

    public void setPerformance(PieChart performance) {
        this.performance = performance;
    }

    public socialmedia(String postcontent, String platform, String url, PieChart performance, LocalDate schadule) {
        this.postcontent = postcontent;
        this.platform = platform;
        this.url = url;
        this.performance = performance;
        this.schadule = schadule;
    }
}
