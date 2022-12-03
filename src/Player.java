public class Player {
    public String NAME;
    public int stack;
    public int bet;
    public Cards[] hand = new Cards[2];
    public boolean isBigBlind;
    public boolean isSmallBlind;
    public boolean hasFolded;
    public ACTION actionTaken;

    Player(String NAME) {
        this.NAME = NAME;
    }
}
