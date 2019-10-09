/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;
import java.util.Scanner;

/**
 *
 * @author andrew.wayne
 */
public class triangle {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        int length;
        int width;
        int position = 0;
        int hpos = 1;
        int blank =0; 
        String symbol = "*";

         System.out.println("Hello! Let's make an arch.");
        System.out.println("What should be the height of our arch?");
        height = input.nextInt();
        System.out.println("What about the length?");
        length = input.nextInt();
        System.out.println("And what about the width of our bases?");
        width = input.nextInt();
        int arch=height*(2/3);
        int center= length/2;
        //Gather input for the structure
        
        while (hpos <= height) {
            while (arch<hpos){
            while (position < length) {
                System.out.print(symbol);
                position = position + 1;
                }
            System.out.println();
            hpos=hpos+1;
            position= 0;
            }
            
        }
        
        System.out.println("Here is your box.");
        }

    }
    

