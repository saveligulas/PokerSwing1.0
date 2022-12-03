public enum RANK {
    TWO(2),THREE(3),FOUR(4),FIVE(5),
    SIX(6),SEVEN(7),EIGHT(8),NINE(9),
    TEN(10),JACK(10),QUEEN(10),KING(10),ACE(1);
    private final Integer cardValue;
    private RANK(Integer cardValue) {
        this.cardValue = cardValue;
    }
    public int getValue() {
        return cardValue;
    }
    public String getName(RANK card) {
        String str = "";
        if (card.cardValue > 1 && card.cardValue < 10) {
            str = card.cardValue.toString();
        }
        else {
            str = switch (card) {
                case TEN -> "Ten";
                case JACK -> "Jack";
                case QUEEN -> "Queen";
                case KING -> "King";
                case ACE -> "Ace";
                default -> "Not a Card";
            };
        }
        return str;
    }
}
