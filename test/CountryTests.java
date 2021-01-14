import java.lang.String;
import java.util.*;
import org.junit.*;
import java.lang.*;

import static junit.framework.TestCase.assertEquals;

public class CountryTests {
    private static String GERMANY_ALPHA3 = "GER";
    private static final int GERMANY_POPULTION = 83783945;
    private Map<Date, Double> germanyData = new HashMap<Date, Double>();
    private static final Double GERMANY_TODAY_VALUE = 247.064;
    private static final String IRELAND_ALPHA3 = "IRL";
    private static final int IRELAND_POPULTION = 4937796;
    private Map<Date, Double> irelandData = new HashMap<Date, Double>();
    private static final Date DATE = new Date("today");
    private static final Double IRELAND_TODAY_VALUE = 1288.661;


    @Before
    public void setup() {
        germanyData.put(DATE, 247.064);
        irelandData.put(DATE, 1288.661);
    }

    @Test
    public void onCreation_countrysHaveNecessaryFieldsFilledAndAccessible() {
        Country Germany = new Country(GERMANY_ALPHA3, GERMANY_POPULTION, germanyData);
        Country Ireland = new Country(IRELAND_ALPHA3, IRELAND_POPULTION, irelandData);
        assertEquals("should return ISO 3166-1 Alpha-3 code", GERMANY_ALPHA3, Germany.getISO());
        assertEquals("should return ISO 3166-1 Alpha-3 code", IRELAND_ALPHA3, Ireland.getISO());
        //Make population data type
        assertEquals("should return population", 83783945, Germany.getPopulation());
        assertEquals("should return population", 4937796, Ireland.getPopulation());
        assertEquals("should return data", GERMANY_TODAY_VALUE, Germany.getDataForDate(DATE));
        assertEquals("should return data", GERMANY_TODAY_VALUE, Germany.getDataForDate(DATE));
    }


}
