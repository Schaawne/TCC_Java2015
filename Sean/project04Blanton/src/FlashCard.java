/**
 * FlashCard class for project04Blanton
 * <p>
 * Created by Schaawne on 10/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public abstract class FlashCard
{
    /** Error message */
    protected String m_errorString;

    /**
     * Protected Constructor
     */
    protected FlashCard()
    {
        m_errorString = "";
    }

    /**
     * Get the Question
     *
     * @return String representation of the Question
     */
    public abstract String GetQuestion();

    /**
     * Get the Answer
     *
     * @return String representation of the Answer
     */
    public abstract String GetAnswer();
}
