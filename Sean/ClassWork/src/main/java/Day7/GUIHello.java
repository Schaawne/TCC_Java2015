package Day7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUIHello class for ClassWork
 * <p>
 * Created by Schaawne on 9/30/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class GUIHello extends JFrame implements ActionListener
{
    private JLabel labelItem1, labelItem2;
    private JButton buttonItem1;

    public GUIHello()
    {
        //Call the super class's constructor to name the title bar
        super("GUIHello Window");

        //Set default options so user doesn't have to by default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);

        //Use a Grid Layout to display both labels without them rendering over the top of each other
        this.setLayout(new GridLayout(3, 1)); //rows, columns

        //Create JLabels
        setupLabels();

        //Create Buttons
        setupButtons();

        //Lastly, set the window visible
        this.setVisible(true);
    }

    /**
     * Function to be called when actions are performed
     *
     * @param ae the Event object
     */
    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("Some event has happened!");
    }

    /**
     * Sets up JLabel objects
     */
    private void setupLabels()
    {
        //Create basic JLabel
        labelItem1 = new JLabel("Default JLabel Text");
        labelItem1.setHorizontalAlignment(JLabel.CENTER); //Center-align the text

        //Create a second JLabel
        labelItem2 = new JLabel("A Second JLabel", JLabel.RIGHT); //Right-align the text

        //The JLabels must be added to the JFrame in order to be displayed
        this.add(labelItem1);
        this.add(labelItem2);
    }

    /**
     * Sets up JButton objects
     */
    private void setupButtons()
    {
        //Create basic JButton
        buttonItem1 = new JButton("Button!");

        //Add an action listener to the buttons
        buttonItem1.addActionListener(this);

        //The JButtons must be added in order to display
        this.add(buttonItem1);
    }
}
