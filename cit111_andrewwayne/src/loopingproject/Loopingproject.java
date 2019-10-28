/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingproject;

import java.util.Scanner;

/**
 *
 * @author andrew.wayne
 */
public class Loopingproject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        int length;
        int position = 0;
        int hpos = 1;
        String symbol = "*";

        System.out.println("Input the length of the box.");
        length = input.nextInt();
        System.out.println("Input the height of the box.");
        height = input.nextInt();
        while (hpos <= height) {
            while (position < length) {
                System.out.print(symbol);
                position = position + 1;
                }
            System.out.println();
            hpos=hpos+1;
            position= 0;
        }
        System.out.println("Here is your box.");
        }

    }

