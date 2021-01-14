import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DateTests {
    private String date = "1234-56-78";
    private String overwriteString = "unrecognised data";
    private Date validDate;
    private Date invalidDate1;
    private Date invalidDate2;

    @Before
    public void setup() {
        validDate = new Date(date);
        invalidDate1 = new Date("1234-56-7");
        invalidDate2 = new Date("234-56-78x");
    }

    @Test
    public void atInstantiation_validateParameters() {
        assertEquals("accept valid date formats", date.length(), validDate.getDate().length());
        assertEquals("accept valid date formats", date, validDate.getDate());
        assertEquals("should overwrite invalid date formats", overwriteString.length(), invalidDate1.getDate().length());
        assertEquals("should overwrite invalid date formats", overwriteString, invalidDate1.getDate());
        assertEquals("should overwrite invalid date formats", overwriteString.length(), invalidDate2.getDate().length());
        assertEquals("should overwrite invalid date formats", overwriteString, invalidDate2.getDate());
    }

    @Test
    public void afterInstantiation_listOfCountriesReportingShouldBeAccessible() {
        assertEquals("should return the 7 Day Average of new cases per 100 thousand",
                (Double) 24.7064, validDate.getFigureFor(new Alpha3("GER")));
        assertEquals("should return the 7 Day Average of new cases per 100 thousand",
                (Double) 0.0004, validDate.getFigureFor(new Alpha3("IRL")));
    }
}
