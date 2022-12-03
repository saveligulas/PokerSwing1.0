public enum CHIPS {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONE_HUNDRED(100),
    TWO_HUNDRED(200),
    FIVE_HUNDRED(500),
    ONE_THOUSAND(1000);
    private final int VALUE;
    CHIPS(int value) {
        VALUE = value;
    }
    public int getVALUE() {
        return VALUE;
    }
}
