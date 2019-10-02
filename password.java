/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import java.util.Scanner;

/**
 *
 * @author andrew.wayne
 */
public class password {

    public static void main(String[] args) {
        final String Correct_name = "username";
        final String Correct_password = "password";
        int attempts = 6;

        String username;
        String password;

        Scanner input = new Scanner(System.in);
        System.out.println("THIS IS A TOP SECRET DATABASE. YOU MUST HAVE THE "
                + "SPECIFIC USERNAME AND PASSWORD OR AUTHORITIES WILL BE "
                + "ALERTED TO THIS LOCATION. YOU HAVE 6 ATTEMPTS.\n");
        while (attempts > 0) {
            System.out.println("Please enter the username: ");
            username = input.next();
            //input username
            if (!username.equals(Correct_name)) {
                System.out.println("The username is not correct, please try again");
            }else{
                 
                System.out.println("Please enter your password: ");
                password = input.next();
                //input password

                if (password.equals(Correct_password)) {
                    System.out.println("You have successfully logged in.");
                    break;
                } else {
                    attempts = attempts - 1;
                    System.out.println("The password entered is not correct. You have "
                            + attempts + " remaining.");
                } //correct name, not pass
            }//else wrong name
        } //end while
        
    }//end main
}//end class

