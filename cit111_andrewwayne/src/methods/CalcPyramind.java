/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author andrew.wayne
 */
public class CalcPyramind {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Let's find the volume of a square pyramid.");
        System.out.println("What should be the length of our base?");
        double base = user.nextDouble();
        System.out.println("And what about the height?");
        double height = user.nextDouble();
        
        double volume = volumeofSquare(base,height);
        System.out.println("***********");
        System.out.println("The volume of our square pyramid is: "+ volume);
        System.out.println("***********");
        
        
    }//end main
    public static double volumeofSquare(double b, double h){
      final double ONETHIRD = 1f/3f;
        double square=(b*b)*h*ONETHIRD;
     return square;
    }//end volume
}//end class
