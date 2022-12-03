public enum ACTION {
    FOLD("Fold"),
    CHECK("Check"),
    BET("Bet"),
    CALL("Call"),
    RAISE("Raise"),
    ALL_IN("All-In");
    private final String NAME;
    ACTION(String NAME) {
        this.NAME = NAME;
    }
    public String getNAME() {
        return NAME;
    }
}
