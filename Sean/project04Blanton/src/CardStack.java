import java.util.ArrayList;
import java.util.Collections;

/**
 * CardStack class for project04Blanton
 *
 * Created by Schaawne on 10/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class CardStack
{
    /** Set of FlashCard object */
    private ArrayList<FlashCard> m_cardStack;
    /** Current index within ArrayList */
    private int m_currentIndex;

    public CardStack()
    {
        m_cardStack = new ArrayList<FlashCard>();
        m_currentIndex = -1;
    }

    /**
     * Add a new FlashCard to the ArrayList
     *
     * @param newCard FlashCard object to be added
     * @return boolean result of the add operation
     */
    public boolean AddCard(FlashCard newCard)
    {
        //Add the FlashCard to the ArrayList
        boolean result = m_cardStack.add(newCard);

        //If successful, make sure currentIndex is set
        if((result) && (0 > m_currentIndex))
        {
            m_currentIndex = 0;
        }

        return result;
    }

    /**
     * Add a new MathCard to the ArrayList
     *
     * @param arg1 left-hand argument for MathCard
     * @param operation math operation for MatchCard
     * @param arg2 right-hand argument for MathCard
     * @return boolean result of the add operation
     */
    public boolean AddCard(int arg1, char operation, int arg2)
    {
        //Add the FlashCard to the ArrayList
        boolean result = m_cardStack.add(new MathCard(arg1, operation, arg2));

        //If successful, make sure currentIndex is set
        if((result) && (0 > m_currentIndex))
        {
            m_currentIndex = 0;
        }

        return result;
    }

    /**
     * Add a new VocabCard to the ArrayList
     *
     * @param word word to be learned
     * @param englishWord English translation of the word
     * @return boolean result of the add operation
     */
    public boolean AddCard(String word, String englishWord)
    {
        //Add the FlashCard to the ArrayList
        boolean result = m_cardStack.add(new VocabCard(word, englishWord));

        //If successful, make sure currentIndex is set
        if((result) && (0 > m_currentIndex))
        {
            m_currentIndex = 0;
        }

        return result;
    }

    /**
     * Randomizes the ArrayList
     */
    public void Shuffle()
    {
        //Shuffle the ArrayList
        Collections.shuffle(m_cardStack);
        //Set the index to 0
        m_currentIndex = 0;
    }

    /**
     * Get the next FlashCard on the Card Stack
     *
     * @return the next FlashCard or null if no cards remaining
     */
    public FlashCard NextCard()
    {
        //Check if current index has not been initialized or
        if((0 > m_currentIndex) || (m_cardStack.size() <= m_currentIndex))
        {
            return null;
        }

        return m_cardStack.get(m_currentIndex++);
    }
}
