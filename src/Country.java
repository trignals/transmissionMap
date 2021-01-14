import java.util.*;

public class Country {
    private String alpha3;
    private int population;
    private Map<Date, Double> dataHashMap;

    //ISO 3166-1 alpha-3
    public Country(String alpha3, int population, Map<Date, Double> dataHashMap) {
        this.alpha3 = alpha3;;
        this.population = population;
        this.dataHashMap = dataHashMap;
    }

        public String getISO() {
        return alpha3;
    }

    public int getPopulation() {
        return population;
    }

    public Double getDataForDate(Date date) {
        return dataHashMap.get(date);
    }
}
