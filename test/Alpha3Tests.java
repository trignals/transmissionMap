import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Alpha3Tests {

    private String code = "XYZ";
    private String overwriteString = "unrecognised data";
    private Alpha3 valid1;
    private Alpha3 invalid2;
    private Alpha3 invalid3;

    @Before
    public void setup() {
        valid1 = new Alpha3(code);
        invalid2 = new Alpha3("AB");
        invalid3 = new Alpha3("ABCD");
    }

    @Test
    public void validateParameters_whenInstantiating() {
        assertEquals("accept valid alpha3 date formats", code.length(), valid1.getCode().length());
        assertEquals("accept valid alpha3 code formats", code, valid1.getCode());
        assertEquals("overwrite invalid alpha3 code formats", overwriteString.length(), invalid2.getCode().length());
        assertEquals("overwrite invalid alpha3 code formats", overwriteString, invalid2.getCode());
        assertEquals("overwrite invalid alpha3 code formats", overwriteString.length(), invalid3.getCode().length());
        assertEquals("overwrite invalid alpha3 code formats", overwriteString, invalid3.getCode());
    }
}
