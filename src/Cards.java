public class Cards {
    private final String cardImagePath;
    boolean faceDown;
    RANK rank;
    SUIT suit;
    Cards(RANK rank, SUIT suit, boolean faceDown) {
        this.rank = rank;
        this.suit = suit;
        this.faceDown = faceDown;
        cardImagePath = "C:/Users/savel/IdeaProjects/PokerSwing1.0/PNG-cards-1.3/"+rank.getName(rank)+"_of_"+suit.getSuitName()+".png";
    }
    public String getName() {
        return rank.getName(rank)+" of "+suit.getSuitName();
    }
    public String getCardImagePath() {
        if(faceDown) {
            return "C:/Users/savel/IdeaProjects/PokerSwing1.0/PNG-cards-1.3/back.png";
        }
        return cardImagePath;
    }
}
