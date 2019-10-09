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
public class forLoopIntro {
    public static void main(String[] args) {
        int loopControl;
        Scanner user= new Scanner(System.in);
        
        System.out.println("How many loops should we do?");
        loopControl=user.nextInt();
        
        //for Loop
        for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops+1){
            System.out.println("We have done " + numLoops + " loops.");
        } //close for
    } //close main
} //close class
