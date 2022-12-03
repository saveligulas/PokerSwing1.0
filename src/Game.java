import java.util.ArrayList;

public class Game {
    public Deck gameDeck;
    public int pot;
    public ArrayList<Player> playerArrayList = new ArrayList<Player>();
    public Cards[] deal = new Cards[5];
    public GLOBAL_FLAGS gameState;
    public Player playerTurn;

    public void initializeNewGame() {
        gameDeck = null;
        gameDeck = new Deck();
        gameDeck.shuffle();
    }

    public void instantiatePlayers(int i, ArrayList<String> playerNames) {
        for(int j = 0; j<i; j++) {
            playerArrayList.add(new Player(playerNames.get(j)));
        }
    }

    public void dealPlayerCards() {
        for(int i = 0; i<2; i++) {
            for (Player player : playerArrayList) {
                drawCard(player,i);
            }
        }
    }

    private void drawCard(Player player, int index) {
        player.hand[index] = gameDeck.deck.get(0);
        gameDeck.deck.remove(0);
    }
}
