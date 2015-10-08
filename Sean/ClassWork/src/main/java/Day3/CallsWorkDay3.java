package Day3;

import java.util.Random;
import java.util.Scanner;

/**
 * Day3.CallsWorkDay3 class for ClassWork
 * <p>
 * Created by Schaawne on 8/11/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class CallsWorkDay3
{
    public static void main(String[] args)
    {
        Scanner theScanner = new Scanner(System.in);

        Random randomer = new Random();
        int userGuess, myNumber, topEnd, maxGuesses;

        topEnd = randomer.nextInt(100);
        myNumber = randomer.nextInt(topEnd) + 1;
        maxGuesses = myNumber / 3;

        System.out.println("Random number between 1 and " + topEnd + "!\r\nYou have " + maxGuesses + " attempts to guess correctly");
        for(int i = 0; i < maxGuesses; i++)
        {
            System.out.println("Make a guess: ");
            userGuess = theScanner.nextInt();
            if(myNumber > userGuess)
            {
                System.out.println("Too LOW!!");
            }
            else if(myNumber < userGuess)
            {
                System.out.println("Too HIGH!");
            }
            else
            {
                System.out.println("You did it! [" + (i + 1) + " of " + maxGuesses + " guesses used]");
                break;
            }
        }
    }
}
