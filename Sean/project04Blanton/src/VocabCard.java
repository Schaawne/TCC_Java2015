/**
 * VocabCard class for project04Blanton
 * <p>
 * Created by Schaawne on 10/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class VocabCard extends FlashCard
{
    /** The word to be defined */
    private String m_word;
    /** The english translation of the word */
    private String m_englishWord;

    /**
     * Normal Constructor
     *
     * @param word Word to be learned
     * @param englishWord English translation of the word
     */
    public VocabCard(String word, String englishWord)
    {
        //Call base class constructor
        super();

        //Initialize the local fields
        m_word = word;
        m_englishWord = englishWord;
    }

    /**
     * Get the English translation for the Word
     *
     * @return English translation of the Word as String
     */
    public String GetAnswer()
    {
        return m_englishWord;
    }

    /**
     * Get the Word being learned
     *
     * @return Word as String
     */
    public String GetQuestion()
    {
        return m_word;
    }
}
