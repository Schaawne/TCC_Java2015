import javax.swing.*;

/**
 * MathCard class for project04Blanton
 *
 * Created by Schaawne on 10/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MathCard extends FlashCard
{
    /** Left-hand argument */
    private int m_lhArg;
    /** Right-hand argument */
    private int m_rhArg;
    /** Operation */
    private char m_operation;
    //Operation Constants
    private static final char CHAR_ADD_OP = '+';
    private static final char CHAR_SUB_OP = '-';
    private static final char CHAR_MUL_OP = '*';
    private static final char CHAR_DIV_OP = '/';

    /**
     * Standard Constructor
     *
     * @param arg1 left-hand argument as integer
     * @param operation operation as char (+, -, *, /)
     * @param arg2 right-hand argument as integer
     */
    public MathCard(int arg1, char operation, int arg2)
    {
        //Construct base class
        super();

        //Initialize member fields
        m_lhArg = arg1;
        m_operation = operation;
        m_rhArg = arg2;
    }

    /**
     * Calculates result of math operation and return Answer as String
     *
     * @return result as String
     */
    public String GetAnswer()
    {
        double answer = doMath();
        //See if there was a problem
        if("" != m_errorString)
        {
            JOptionPane.showMessageDialog(null, m_errorString, "MathCard Fault!", JOptionPane.WARNING_MESSAGE);
        }
        return String.format("%.3f", answer);
    }

    /**
     * Form the operation as a string
     *
     * @return math operation as String
     */
    public String GetQuestion()
    {
        return String.format("%d %c %d = ?", m_lhArg, m_operation, m_rhArg);
    }

    /**
     * Perform the math operation
     *
     * @return result as double
     */
    private double doMath()
    {
        double result = 0.0;

        switch(m_operation)
        {
            case CHAR_ADD_OP:
                result = m_lhArg + m_rhArg;
                break;
            case CHAR_SUB_OP:
                result = m_lhArg - m_rhArg;
                break;
            case CHAR_MUL_OP:
                result = m_lhArg * m_rhArg;
                break;
            case CHAR_DIV_OP:
                //Protect against divide-by-zero
                if(0 != m_rhArg)
                {
                    result = (double) m_lhArg / (double) m_rhArg;
                }
                else
                {
                    m_errorString = "User attempted to divide by 0!";
                }
                break;
            default:
                m_errorString = String.format("User attempted invalid operation: %c", m_operation);
                break;
        }

        return result;
    }
}
