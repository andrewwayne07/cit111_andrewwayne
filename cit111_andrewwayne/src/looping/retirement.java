/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;
import java.util.Scanner;
/**
 *
 * @author andrew.wayne
 */
public class retirement {
    public static void main(String[] args) {
        int age;
        Scanner userAge = new Scanner(System.in);
        
        while (true) {
            System.out.println("Please enter your age.");
            age = userAge.nextInt();
            
            if(age > 65.5){
                System.out.println("You can retire.");
                break;
            }else{
                System.out.println("You cannot retire.");
                break;
            } //close else
        } //close while
        System.out.println("Thank you for using my retirement checker.");
    } // close main
} //close class
