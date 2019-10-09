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
public class Comparisons {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        int retirementAge = 55; 
        
       
        if (age >= retirementAge){
            System.out.println("You are eligible for retirement.");
        } else {
            System.err.println("You cannot retire yet.");
        }
    }
    
}
