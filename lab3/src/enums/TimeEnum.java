package enums;

public enum TimeEnum {
    DAYS("много дней"), TIME("в это время");
    private String value;

    private TimeEnum(String t) {
        value = t;
    }

    @Override
    public String toString() {
        return value;
    }
}
