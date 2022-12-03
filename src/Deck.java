import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final SUIT[] suits = SUIT.values();
    private final RANK[] ranks = RANK.values();
    public ArrayList<Cards> deck = new ArrayList<Cards>();
    Deck() {
        for(SUIT suit:suits) {
            for(RANK rank:ranks) {
                deck.add(new Cards(rank, suit, true));
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }
}
