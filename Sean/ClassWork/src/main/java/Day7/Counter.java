package Day7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Counter class for ClassWork
 * <p>
 * Created by Schaawne on 9/30/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Counter extends JFrame implements ActionListener, WindowListener
{
    private JLabel m_currentCountLabel;
    private JButton m_addButton, m_subtractButton, m_resetButton;
    private int m_currentCount;
    private JPanel m_displayPanel;
    private JPanel m_buttonPanel;

    //String constants
    private static final String TEXT_ADD_CMD = "Add 1!";
    private static final String TEXT_SUBTRACT_CMD = "Subtract 1!";
    private static final String TEXT_RESET_CMD = "Reset to 0!";

    public Counter()
    {
        //Call super constructor to set title
        super("Counter");

        //Setup defaults so main() doesn't have to
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setup the layout
        setLayout(new GridLayout(2, 1));

        //Add the Labels
        populateLayout();

        //Add listener
        addWindowListener(this);

        //Make the window visible
        setVisible(true);
    }

    /**
     * Action Performed Listener
     *
     * @param ae the action event
     */
    public void actionPerformed(ActionEvent ae)
    {
//        System.out.println(String.format("%d action event itemID!", ae.getID()));
//        System.out.println(String.format("%s action event ActionCommand!", ae.getActionCommand()));
//        System.out.println(String.format("%d action event modifier!", ae.getModifiers()));

        switch(ae.getActionCommand())
        {
            case TEXT_ADD_CMD:
                m_currentCount++;
                break;
            case TEXT_SUBTRACT_CMD:
                m_currentCount--;
                break;
            case TEXT_RESET_CMD:
                m_currentCount = 0;
                break;
            default:
                break;
        }

        //Limit count to positive values
        if(0 > m_currentCount)
        {
            m_currentCount = 0;
        }

        //Update the current count label
        m_currentCountLabel.setText(String.format("%d", m_currentCount));
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window Deiconified!");
    }

    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window Iconified!");
    }

    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window Activated!");
    }

    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window Deactivated!");
    }

    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window Opened!");
    }

    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window Closing!");
    }

    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window Closed!");
    }

    private void populateLayout()
    {
        //Create the default label for currentCount with a seed value of 0
        m_currentCount = 0;
        m_currentCountLabel = new JLabel(String.format("%d", m_currentCount), JLabel.CENTER);

        //Create the buttons
        m_addButton = new JButton("Add 1!");
        m_resetButton = new JButton("Reset to 0!");
        m_subtractButton = new JButton("Subtract 1!");

        //Add ActionListeners to all the buttons
        m_addButton.addActionListener(this);
        m_resetButton.addActionListener(this);
        m_subtractButton.addActionListener(this);

        //Set the actionCommand so it can be detected in ActionEvent listener
        m_addButton.setActionCommand(TEXT_ADD_CMD);
        m_resetButton.setActionCommand(TEXT_RESET_CMD);
        m_subtractButton.setActionCommand(TEXT_SUBTRACT_CMD);

        //Format the Buttons
        m_addButton.setBackground(Color.GREEN);
        m_addButton.setForeground(Color.WHITE);
        m_subtractButton.setBackground(Color.RED);
        m_subtractButton.setForeground(Color.WHITE);
        m_resetButton.setBackground(Color.BLUE);
        m_resetButton.setForeground(Color.WHITE);

        //Add the Components to their Panels
        m_displayPanel = new JPanel();
        m_displayPanel.setLayout(new GridLayout(1, 1)); //1x1 for now
        m_displayPanel.add(m_currentCountLabel);

        m_buttonPanel = new JPanel();
        m_buttonPanel.setLayout(new GridLayout(3, 1)); //3x1
        m_buttonPanel.add(m_addButton);
        m_buttonPanel.add(m_subtractButton);
        m_buttonPanel.add(m_resetButton);

        //Add the Panels to the Frame
        add(m_displayPanel);
        add(m_buttonPanel);
    }
}
