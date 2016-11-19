package atm.view.components;

import javax.swing.*;

import java.awt.*;

import static atm.tools.GUIConstants.CARDREADER_HEIGHT;
import static atm.tools.GUIConstants.CARDREADER_WIDTH;
import static atm.tools.ViewUtils.createButton;

public class CardReaderView extends JPanel{
    private static CardReaderView instance;

    private JButton btnInsertCard;

    private CardReaderView(){
        super();
        setSize(CARDREADER_WIDTH, CARDREADER_HEIGHT);
        setBackground(Color.DARK_GRAY);
        setLayout(null);
        btnInsertCard = createButton("Insert Card", 140, 0, 160, 20);
        btnInsertCard.setBackground(Color.white);
        add(btnInsertCard);
    }

    public static synchronized CardReaderView getInstance() {
        if (instance == null) instance = new CardReaderView();
        return instance;
    }
}
