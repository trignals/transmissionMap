import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Average7Days_NewPer100kTests {
    private String new_cases_smoothed_per_million = "0.004";
    private Average7Days_NewPer100k caseData;

    @Before
    public void setup() {
        caseData = new Average7Days_NewPer100k(new_cases_smoothed_per_million);
    }

    @Test
    public void onceCreated_casesAreRecordedAndAccessible() {
        assertEquals("accept valid alpha3 date formats", (Double) 0.0004, caseData.getCases());
    }
}
