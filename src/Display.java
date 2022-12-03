import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Display extends JFrame implements ActionListener {

    private ImageIcon[] holeCards = new ImageIcon[2];
    private final JLabel[] dealtCards = new JLabel[5];
    private final Game game = new Game();

    private final JPanel MasterPanel;
    private final JSplitPane MasterSplitPane;
    private final JPanel handPanel;
    private final JPanel dealtCardPanel;

    private final JLabel holeCard1;
    private final JLabel holeCard2;
    Display() {

        game.initializeNewGame();
        game.instantiatePlayers(1, new ArrayList<>(List.of("Saveli")));
        game.dealPlayerCards();

        MasterPanel = new JPanel();
        handPanel = new JPanel();
        dealtCardPanel = new JPanel();

        setVisible(true);
        setContentPane(MasterPanel);
        setSize(800, 400);
        setResizable(true);
        setName("Poker");

        MasterSplitPane = new JSplitPane();

        MasterSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        MasterSplitPane.setDividerLocation(0.5);
        MasterSplitPane.setTopComponent(dealtCardPanel);
        MasterSplitPane.setBottomComponent(handPanel);
        MasterSplitPane.setDividerSize(0);

        MasterPanel.add(MasterSplitPane);

        holeCard1 = new JLabel();
        holeCard2 = new JLabel();

        printHoleCards(game.playerArrayList.get(0));

        holeCard1.setIcon(holeCards[0]);
        holeCard2.setIcon(holeCards[1]);

        handPanel.add(holeCard1);
        handPanel.add(holeCard2);

        pack();
    }

    public void printHoleCards(Player player) {
        holeCards[0] = new ImageIcon(player.hand[0].getCardImagePath());
        holeCards[1] = new ImageIcon(player.hand[1].getCardImagePath());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
