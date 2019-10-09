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
public class usercontrol {
    public static void main(String[] args){
        int numLoops = 0;
        int loopControl;
        
        Scanner user= new Scanner(System.in);
        System.out.println("How many loops should we display?");
        loopControl = user.nextInt();
        
        while (numLoops <= loopControl) {
            System.out.println(numLoops + " loops, we need more!");
            numLoops = numLoops+1;
        } //close while
        System.out.println("No more loops...");
    } //close main
    
} //close class
