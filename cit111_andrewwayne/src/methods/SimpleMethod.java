/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author andrew.wayne
 */
public class SimpleMethod {

    public static void main(String[] args) {
        String name = "Andrew";
        System.out.println("This coded is inside method main.");
        printStatement();
        generateBigNumber();

        System.out.println("...back in main");
        printStatement();
        generateBigNumber();
        
    } //closes main
    public static void printStatement() {
        System.out.println("****INSIDE printStatement****");
        System.out.println("Statement: Where There's a Will,"
                + " There's a way.");
        System.out.println("********************");
    } //closes PStatement



    public static void generateBigNumber() {
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println(bigInt);
    }
} //closes class
