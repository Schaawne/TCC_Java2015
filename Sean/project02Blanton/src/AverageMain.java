import java.util.ArrayList;
import java.util.List;

/**
 * AverageMain class for project02Blanton
 * <p>
 * Created by Schaawne on 9/2/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class AverageMain
{
    /**
     * project02Blanton Main function.
     * <p>
     * -Expects a list of integer arguments for which it will calculate the average.
     * <p>
     * <ul>
     *     <li>Grading Criteria: (125pt)</li>
     *     <li>1: Jar file is executable and Programming  Guidelines are followed. (25pt)</li>
     *     <li>2: Documentation report is created. (25pt)</li>
     *     <li>3: Program reads input from the args array. (25pt)</li>
     *     <li>4: Program calculates and displays the average  of the given input. (25pt)</li>
     *     <li>5: Program displays a welcome message when launched and GRACEFULLY handles the case of  no arguments. (25pt)</li>
     * </ul>
     * @param args Command line arguments (Integers)
     */
    public static void  main(String[] args)
    {
        List<Integer> intList = new ArrayList<Integer>();

        //Print welcome message (Grade criteria 5)
        System.out.println("Sean Blanton's Average Program:");

        //Loop through the args (Grade criteria 3)
        for(String s: args)
        {
            try{
                //Add in Integer elements to an ArrayList
                intList.add(Integer.parseInt(s));
            }
            catch(NumberFormatException e)
            {
                //Catch exception when non-integer is passed
                System.out.println("Caught a NumberFormatException!!  Please only provide integer inputs.");
                System.exit(0); //Exit without continuing
            }
            catch(Exception e)
            {
                //Catch unhandled exceptions
                System.out.println("Caught an unhandled exception!! Exception: " + e);
                System.exit(0); //Exit without continuing
            }
        }

        //Check if no arguments were passed (Grade criteria 5)
        if(intList.isEmpty())
        {
            System.out.println("No arguments were passed, please pass integer arguments and this program will compute the average.");
        }
        else
        {
            //Display the average (Grade criteria 4)
            System.out.printf("Calculated average of your numbers is: %02.3f!\n", AverageMain.calcAverage(intList));
        }
    }

    /**
     * Average calculator
     * -Calculates the average of the provided list of Integers
     *
     * @param inputIntList ArrayList object of Integer objects
     * @return average of the Integers in the ArrayList as double
     */
    private static double calcAverage(List<Integer> inputIntList)
    {
        double sum = 0;

        //Sum the elements
        for(int s: inputIntList)
        {
            sum += s; //integers get scaled to doubles (cast-upwards is okay)
        }

        return (sum / inputIntList.size());
    }


}
