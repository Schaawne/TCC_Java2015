import java.util.Scanner;

/**
 * Driver class for project04Blanton
 *
 * Created by Schaawne on 10/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Driver
{
    /** CardStack object */
    private static CardStack m_cardStack;
    /** Scanner for reading user inputs */
    private static Scanner m_inputScanner;
    /** Current FlashCard from CardStack */
    private static FlashCard m_currentCard;
    /** ID# for current FlashCard */
    private static int m_cardID;

    //char constants for user menu selections
    private static final char CHAR_GIVEANSWER = 'a';
    private static final char CHAR_NEXTCARD = 'n';
    private static final char CHAR_QUIT = 'q';

    /**
     * Main Driver Method
     *
     * @param args Un-used command line arguments
     */
    public static void main(String[] args)
    {
        boolean exit = false;

        //Create a CardStack
        m_cardStack = new CardStack();
        m_cardID = 0;

        //Create the Scanner
        m_inputScanner = new Scanner(System.in);

        //Add the MathCards
        addMathCards();

        //Add the VocabCards
        addVocabCards();

        //Shuffle the CardStack
        m_cardStack.Shuffle();

        /** App Start */
        System.out.println("*****************Flash Cards Tool*****************");
        //Get and print the first FlashCard Question
        exit = printNextQuestion();

        //User loop
        while(!exit)
        {
            if(null != m_currentCard)
            {
                //Inform the User of their options
                printMenu();

                //Process one input from user
                exit = processInput();
            }
        }
    }

    /**
     * Helper method for adding MathCards to CardStack
     */
    private static void addMathCards()
    {
        int index = 0;
        int lhArgs[] = {  1,   2,  -7,  16};
        char ops[]   = {'+', '-', '-', '/'};
        int rhArgs[] = {  7,  -3,  -2,   3};

        //Add using constructed FlashCard method
        for(index = 0; index < (lhArgs.length - 2); index++)
        {
            m_cardStack.AddCard(new MathCard(lhArgs[index], ops[index], rhArgs[index]));
        }

        //Add via constructing MathCard method
        for(;index < lhArgs.length; index++)
        {
            m_cardStack.AddCard(lhArgs[index], ops[index], rhArgs[index]);
        }
    }

    /**
     * Helper method for adding VocabCards to CardStack
     */
    private static void addVocabCards()
    {
        int index = 0;
        String words[] =        {"Hola", "Por Favor", "Gracias", "Adios"};
        String englishWords[] = {"Hello", "Please",   "Thanks",  "Goodbye" };

        //Add using constructed FlashCard method
        for(index = 0; index < (words.length - 2); index++)
        {
            m_cardStack.AddCard(new VocabCard(words[index], englishWords[index]));
        }

        //Add via constructing VocabCard method
        for(;index < words.length; index++)
        {
            m_cardStack.AddCard(words[index], englishWords[index]);
        }
    }

    /**
     * Helper method for printing the user menu
     */
    private static void printMenu()
    {
        System.out.println("Press 'a' to see the answer");
        System.out.println("Press 'n' to see the next card");
        System.out.println("Press 'q' to quit");
    }

    /**
     * Helper method for processing user input
     * @return QuitTriggered by user request or end of CardStack
     */
    private static boolean processInput()
    {
        boolean quitTriggered = false;

        char userInput = m_inputScanner.next(".").charAt(0);

        switch(userInput)
        {
            case CHAR_GIVEANSWER:
                //Print the Answer for current FlashCard
                System.out.println(String.format("A%d: %s", m_cardID, m_currentCard.GetAnswer()));
                break;
            case CHAR_NEXTCARD:
                //Print the Question for next FlashCard
                quitTriggered = printNextQuestion();
                break;
            case CHAR_QUIT:
                quitTriggered = true;
                break;
            default:
                System.out.println("Unrecognized input!");
                break;
        }

        return quitTriggered;
    }

    /**
     * Helper method for getting the next FlashCard from CardStack and printing the Question
     *
     * @return outOfCards state of CardStack as boolean
     */
    private static boolean printNextQuestion()
    {
        boolean outOfCards = false;

        //Get the next FlashCard
        m_currentCard = m_cardStack.NextCard();
        //Update the cardID
        m_cardID++;
        //Display the current Question
        if(null != m_currentCard)
        {
            System.out.println(String.format("Q%d: %s", m_cardID, m_currentCard.GetQuestion()));
        }
        else
        {
            System.out.println("No more Flash Cards!");
            outOfCards = true;
        }

        return outOfCards;
    }
}