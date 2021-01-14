public class Average7Days_NewPer100k {
    private Double cases;

    public Average7Days_NewPer100k(String new_cases_smoothed_per_million) {
        this.cases = Double.parseDouble(new_cases_smoothed_per_million) / 10;
    }

    public Double getCases() {
        return cases;
    }
}
