/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Scanner;


/**
 *
 * @author andrew.wayne
 */
public class variables {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter years in elementary school: ");
        int yearsEleSchl = input.nextInt() ;
        System.out.print("Enter years in middle school: ");
        int yearsMS = input.nextInt() ; 
        System.out.print("Enter years in high school: ");
        int yearsHS = input.nextInt(); 
        System.out.print("Enter years in college: ");
        int yearsCollege = input.nextInt();
        int totalYears ; 
        //Delcare vairables
        
      
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        //Initialize
        
        System.out.println("Total years in school: " + totalYears);
        //Print value
    } // Main
    
} // Class
