import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * HelloWorldFrame class for project05Blanton
 *
 * Created by Schaawne on 10/14/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class HelloWorldFrame extends JFrame implements ActionListener
{
    /** Text Label */
    private JLabel m_textLabel;
    /** Buttons Panel */
    private JPanel m_buttonPanel;
    /** Button for Label-to-uppercase */
    private JButton m_toUpperCase_btn;
    /** Button for Label-to-lowercase */
    private JButton m_toLowerCase_btn;
    /** Button for new user Label text */
    private JButton m_newUserInput_btn;
    /** Button for Label text reset */
    private JButton m_reset_btn;
    /** String representing current Label text */
    private String m_displayText;

    private final String STR_DEFAULTLABEL = "Hello World";
    private final String STR_TOUPPERCASE = "ToUppercase!";
    private final String STR_TOLOWERCASE = "ToLowercase!";
    private final String STR_NEWLABEL = "New Label!";
    private final String STR_RESETLABEL = "Reset Label!";

    /**
     * Default Constructor
     */
    public HelloWorldFrame()
    {
        //Call the JFrame constructor and set the window title
        super("Hello World Frame");

        //Set default options so user doesn't have to by default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);

        //Setup the buttons JPanel
        setupButtons();

        //Setup the JLabel
        m_displayText = STR_DEFAULTLABEL;
        m_textLabel = new JLabel(m_displayText, JLabel.CENTER);

        //Set the layout for the JFrame
        this.setLayout(new GridLayout(2, 1));

        //Add the elements to the JFrame
        this.add(m_textLabel);
        this.add(m_buttonPanel);

        //Lastly, set the window visible
        this.setVisible(true);
    }

    /**
     * Helper method for setting up the JPanel of JButtons
     */
    private void setupButtons()
    {
        //Setup the JPanel
        m_buttonPanel = new JPanel();
        m_buttonPanel.setLayout(new GridLayout(2, 2));

        //Create the JButtons
        m_toUpperCase_btn = new JButton(STR_TOUPPERCASE);
        m_toLowerCase_btn = new JButton(STR_TOLOWERCASE);
        m_newUserInput_btn = new JButton(STR_NEWLABEL);
        m_reset_btn = new JButton(STR_RESETLABEL);

        //Add the ActionListener to the JButtons
        m_toUpperCase_btn.addActionListener(this);
        m_toLowerCase_btn.addActionListener(this);
        m_newUserInput_btn.addActionListener(this);
        m_reset_btn.addActionListener(this);

        //Setup the ActionCommands for use by ActionListener
        m_toUpperCase_btn.setActionCommand(STR_TOUPPERCASE);
        m_toLowerCase_btn.setActionCommand(STR_TOLOWERCASE);
        m_newUserInput_btn.setActionCommand(STR_NEWLABEL);
        m_reset_btn.setActionCommand(STR_RESETLABEL);

        //Add the JButtons to the JPanel
        m_buttonPanel.add(m_toUpperCase_btn);
        m_buttonPanel.add(m_newUserInput_btn);
        m_buttonPanel.add(m_toLowerCase_btn);
        m_buttonPanel.add(m_reset_btn);
    }

    public void actionPerformed(ActionEvent ae)
    {
        switch(ae.getActionCommand())
        {
            case STR_TOUPPERCASE:
                m_displayText = m_displayText.toUpperCase();
                break;
            case STR_TOLOWERCASE:
                m_displayText = m_displayText.toLowerCase();
                break;
            case STR_NEWLABEL:
                m_displayText = JOptionPane.showInputDialog("What text would you like to see?", m_displayText);
                break;
            case STR_RESETLABEL:
                m_displayText = STR_DEFAULTLABEL;
                break;
            default:
                break;
        }
        m_textLabel.setText(m_displayText);
    }
}
