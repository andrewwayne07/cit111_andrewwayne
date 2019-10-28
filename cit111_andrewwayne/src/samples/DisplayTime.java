package samples;
import java.util.Scanner;
/*
 * Sample Program, listing 2.4 in Liang 9
 * Converts seconds to minutes
 * @author Andrew Wayne
 */
public class DisplayTime {  // Line Comment
    // The main method is a program's starting point
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        //Prompt user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt(); // Read inpout from user
       
        int minutes = seconds / 60; // Find Minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
    System.out.println(seconds + " Seconds is " + minutes + " Minutes and " + 
            remainingSeconds + " Seconds");
} //Closes main method

} // Closes class
    