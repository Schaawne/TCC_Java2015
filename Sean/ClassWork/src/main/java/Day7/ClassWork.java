package Day7;

import javax.swing.*;

/**
 * ClassWork class for ClassWork
 * <p>
 * Created by Schaawne on 9/30/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class ClassWork
{
    public static void main(String[] args)
    {
        /** EXAMPLE 1 */
//        //Construct a GUIHello object
//        GUIHello gui = new GUIHello();

//        //It is invisible by default
//        gui.setVisible(true);
//
//        //It does nothing on close by default
//        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //It has almost no size by default
//        gui.setSize(640, 480);

        /** EXAMPLE 2 */
        //Construct a Counter object
        Counter counterGui = new Counter();

        /** EXAMPLE 3 */
//        //Default message dialog
//        JOptionPane.showMessageDialog(null, "Message!");
//
//        //Warning_Message type dialog
//        JOptionPane.showMessageDialog(null, "Warning Message!", "Window Title!", JOptionPane.WARNING_MESSAGE);
//
//        //Error_Message type dialog
//        JOptionPane.showMessageDialog(null, "Error Message!", "Window Title!", JOptionPane.ERROR_MESSAGE);
//
//        //User Response Dialog
//        int userResponse = JOptionPane.showConfirmDialog(null, "Do something?", "Window Title!", JOptionPane.YES_NO_CANCEL_OPTION);
//
//        switch(userResponse)
//        {
//            case JOptionPane.YES_OPTION:
//                System.out.println("Okay!");
//                break;
//            case JOptionPane.NO_OPTION:
//                System.out.println("I guess not...");
//                break;
//            case JOptionPane.CANCEL_OPTION:
//                System.out.println("Canceling....");
//                break;
//            case JOptionPane.CLOSED_OPTION:
//                System.out.println("Goodbye!");
//            default:
//                break;
//        }
//
//        //Custom options
//        final String[] myOptions = {"Left", "Right", "Center"};
//        Object selectedObject = JOptionPane.showInputDialog(null, "Which way?", "WindowTitle!", JOptionPane.QUESTION_MESSAGE,
//                null, //No icon
//                myOptions, //Available options
//                myOptions[0]); //Initial Option
//
//        //Input dialog
//        String name = JOptionPane.showInputDialog("What is your name?", "Your name here.");
//        JOptionPane.showMessageDialog(null, name + " is not a very good choice", "Window Title!", JOptionPane.PLAIN_MESSAGE);

        /** EXAMPLE 4 */
//        Dice myDice = new Dice(6);
//
//        boolean exitLoop = false;
//        int userResponse;
//
//        while(!exitLoop)
//        {
//            //User Response Dialog
//            userResponse = JOptionPane.showConfirmDialog(null, String.format("You rolled %d! Roll Again?", myDice.roll()), "Dice Roller GUI", JOptionPane.YES_NO_OPTION);
//
//            switch (userResponse)
//            {
//                case JOptionPane.YES_OPTION:
//                    break;
//                case JOptionPane.NO_OPTION:
//                    exitLoop = true;
//                    break;
//                case JOptionPane.CANCEL_OPTION:
//                    exitLoop = true;
//                    break;
//                case JOptionPane.CLOSED_OPTION:
//                    exitLoop = true;
//                default:
//                    break;
//            }
//        }
    }
}
