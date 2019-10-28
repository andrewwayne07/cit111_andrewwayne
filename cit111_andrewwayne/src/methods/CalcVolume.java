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
public class CalcVolume {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while (true){
            
            System.out.println("Enter Length of a cube");
            double userLength=scan.nextDouble();
            
            if(userLength<0){
                break;
            }//end if
            double volume = calcVolumeofcube(userLength);
            System.out.println("************");
            System.out.println("The volume of the cube is: " + volume);
            System.out.println("************");
        }//close while
    }//end main
    public static double calcVolumeofcube(double Length){
        double cubeVolume = Math.pow(Length,3);
        return cubeVolume;
    } //end cube
}//end class
