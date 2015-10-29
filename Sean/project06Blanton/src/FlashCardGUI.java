import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * FlashCardGUI class for project06Blanton
 * <p>
 * Created by Schaawne on 10/28/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class FlashCardGUI extends JFrame implements ActionListener
{
    private JButton m_theButton;
    private JPanel m_theDisplayPanel;
    private JLabel m_theCardText;
    private JLabel m_theProgressText;
    private JLabel m_theSideType;
    private CardStack m_theCardStack;
    private FlashCard m_currentCard;
    private int m_cardID;

    private final String STR_START = "Start!";
    private final String STR_ANSWERBTN = "Click for Answer";
    private final String STR_NEXTBTN = "Next Question";
    private final String STR_ANSWER = "ANSWER";
    private final String STR_QUESTION = "QUESTION";

    /**
     * Constructor
     *
     * @param flashCardStack CardStack that the GUI will work with
     */
    public FlashCardGUI(CardStack flashCardStack)
    {
        //Call the JFrame constructor and set the window title
        super("Flash Card GUI");

        //Setup the FlashCard Info
        m_theCardStack = flashCardStack;
        m_cardID = 0;

        //Set default options so user doesn't have to by default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);

        //Setup the button
        m_theButton = new JButton();
        m_theButton.addActionListener(this);
        updateButton(STR_START);

        //Setup the display JPanel
        setupDisplay();

        //Set the layout for the JFrame
        this.setLayout(new BorderLayout(2, 1));

        //Add the elements to the JFrame
        this.add(m_theDisplayPanel, BorderLayout.CENTER);
        this.add(m_theButton, BorderLayout.PAGE_END);

        //Lastly, set the window visible
        this.setVisible(true);
    }

    /**
     * Private helper function for setting up the display
     */
    private void setupDisplay()
    {
        //Setup the display Panel
        m_theDisplayPanel = new JPanel();
        m_theDisplayPanel.setLayout(new BorderLayout());

        //Setup the Labels
        m_theCardText = new JLabel("Flash Card GUI App", JLabel.CENTER);
        m_theCardText.setBorder(BorderFactory.createLineBorder(Color.black));
        m_theProgressText = new JLabel(String.format("Card %d of %d", m_cardID, m_theCardStack.GetCardCount()), JLabel.RIGHT);
        m_theSideType = new JLabel("", JLabel.CENTER);

        //Setup a Panel for the Progress Info
        JPanel progressPanel = new JPanel();
        progressPanel.setLayout(new GridLayout(2,1));
        progressPanel.add(m_theProgressText);
        progressPanel.add(m_theSideType);
        progressPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        //Add the to the display Panel
        m_theDisplayPanel.add(progressPanel, BorderLayout.PAGE_START);
        m_theDisplayPanel.add(m_theCardText, BorderLayout.CENTER);
    }

    /**
     * Private helper method for updating the Button
     *
     * @param buttonUpdateStr String to replace the button text and ActionCommand with
     */
    private void updateButton(String buttonUpdateStr)
    {
        m_theButton.setText(buttonUpdateStr);
        m_theButton.setActionCommand(buttonUpdateStr);
        m_theButton.setEnabled(true);
    }

    /**
     * Gets and displays a new Card
     */
    private void newCard()
    {
        //Get the next FlashCard
        m_currentCard = m_theCardStack.NextCard();

        //If a card was found
        if(null != m_currentCard)
        {
            //Update the progress
            m_cardID++;
            m_theProgressText.setText(String.format("Card %d of %d", m_cardID, m_theCardStack.GetCardCount()));

            //Display the Question
            m_theSideType.setText(STR_QUESTION);
            m_theCardText.setText(m_currentCard.GetQuestion());

            //Update the Button
            updateButton(STR_ANSWERBTN);
        }
        else
        {
            //This shouldn't happen
            JOptionPane.showMessageDialog(this, null, "There were no Cards in the Stack!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Show the Answer (check for end of Stack)
     */
    private void showAnswer()
    {
        int userResponse = 0;

        //Display the Answer
        m_theSideType.setText(STR_ANSWER);
        m_theCardText.setText(m_currentCard.GetAnswer());

        //Check if this was the last card
        if(m_cardID == m_theCardStack.GetCardCount())
        {
            //Disable the button
            m_theButton.setEnabled(false);

            //Ask the User if they want to start over
            switch(JOptionPane.showConfirmDialog(this, "Start Over?", "Out of Cards!", JOptionPane.YES_NO_OPTION))
            {
                case JOptionPane.YES_OPTION:
                    m_theCardStack.Shuffle();
                    m_cardID = 0;
                    m_theCardText.setText("Flash Card GUI App");
                    m_theSideType.setText("");
                    m_theProgressText.setText(String.format("Card %d of %d", m_cardID, m_theCardStack.GetCardCount()));
                    updateButton(STR_START);
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(this, "Goodbye!", "Goodbye!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    break;
            }
        }
        else
        {
            //Update the Button
            updateButton(STR_NEXTBTN);
        }
    }

    /**
     * ActionListener interface
     *
     * @param ae event object
     */
    public void actionPerformed(ActionEvent ae)
    {
        switch(ae.getActionCommand())
        {
            case STR_START:
                newCard();
                break;
            case STR_ANSWERBTN:
                showAnswer();
                break;
            case STR_NEXTBTN:
                newCard();
                break;
            default:
                break;
        }
    }
}
