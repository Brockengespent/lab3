package enums;

public enum Circumstance {
    SADLY(" печально"), AFTER(" вслед"), THEN(" потом"), THOUGHT(" будто "), REALLY("совсем"), SADDER(" ещё печальнее"), TOWARDS("навстречу "), WITHJOY(" от радости"), HARDLY(" чуть "), INTHEMIDDLE("посреди"), PROUDLY(" с гордостью"), WITHLOVE(" и любовью"), TIGHT(" крепко "), LENGTHY(" долго");
    private String value;

    private Circumstance(String c) {
        value = c;
    }

    @Override
    public String toString() {
        return value;
    }
}
