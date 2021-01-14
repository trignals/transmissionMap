import java.util.HashMap;
import java.util.Map;

// Template : 2020-02-25
public class Date {
    private String date;
    private Map<Alpha3, Average7Days_NewPer100k> reportedFigures;


    public Date(String date) {
        if ((date.length() != 10) || (date.charAt(4) != '-') || (date.charAt(7) != '-')) {
            this.date = "unrecognised data";
        }
        else {
            this.date = date;
        }
    }

    public String getDate() {
        return date;
    }

    public Double getFigureFor(Alpha3 country) {
        return (Double) 0.0004;
    }
}


