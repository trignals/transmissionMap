public class Alpha3 {
    private String code;

    public Alpha3(String code) {
        if (code.length() == 3) {
            this.code = code;
        } else {
            this.code = "unrecognised data";
        }
    }

    public String getCode() {
        return code;
    }
}
