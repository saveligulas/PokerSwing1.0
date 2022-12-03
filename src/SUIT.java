public enum SUIT {
    HEARTS("hearts"),SPADES("spades"),DIAMONDS("diamonds"),CLUBS("clubs");
    private final String suitName;
    private SUIT(String suitName){
        this.suitName = suitName;
    }
    public String getSuitName() {
        return suitName;
    }
}
