import java.util.Scanner;

/**
 * Created by princewhizzerd on 9/24/17.
 */
public class StringToLongMain  {
    private static Scanner key = new Scanner(System.in);
    private static String input;

    public static void main (String[] args) throws StringToLongException
    {


        while (input != "DONE") {
            System.out.println("Please enter no more then 20 characters.");
            input = key.next();
            checkString();
        }
    }

    public static void checkString()
    {
        try {
            if (input.length() > 19) {
                throw new StringToLongException("You entered more then 20 characters.\nPlease try again. \n");
            }
        }catch (StringToLongException ex)
        {
            System.out.println(ex);
        }
    }
}
