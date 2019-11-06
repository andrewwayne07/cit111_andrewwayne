/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigProjects;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author andrew.wayne
 */
public class RaceSim {

    static int lapTime;
    static int currentDeg;
    static int currentLife;
    static int laps;
    static int tyreType;

    public static void welcome() {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE CIT 111 GRAND PRIX!");
        System.out.println("IN THIS RACE,YOU HAVE TO CHOOSE THE OPTIMAL"
                + " TIME TO PIT, AND ON WHAT TYRE COMPOUND. YOU MAY CHOOSE "
                + "BETWEEN THREE DIFFERENT TYRES.");
        System.out.println();
        System.out.println("How many laps should this race be?");
        laps = input.nextInt();

    }//welcome

    public static void start() {
        Scanner choice = new Scanner(System.in);
        System.out.println("There are three tyres you can choose from, all "
                + "offering different benefits.");
        System.out.println("(1.)SOFT TYRE: Is the fastest tyre, but degrades quickly.");
        System.out.println("Its fastest time is a 90 second lap, but degrades "
                + "at a rate between 4 and 10 percent per lap.");
        System.out.println();
        System.out.println("(2.)MEDIUM TYRE: Is a balance of fast and durable.");
        System.out.println("Fast Lap is 98 seconds, and its deg rate is 3 and 8.");
        System.out.println();
        System.out.println("(3.)HARD TYRE: offers longevity while sacrificing "
                + "outright pace.");
        System.out.println("Its fast lap is 100 seconds, its deg rate is between"
                + " 1 and 6.");
        System.out.println("What tyre (1,2,3) would you like to start the race on?");
        tyreType = choice.nextInt();
    }//end start

    public static void raceSim() {

    }//end race sim

    public static void lapOutput() {
        int lapCounter = 1;
        while (lapCounter <= laps) {
            System.out.println("Lap: " + lapCounter); //Current Lap
            System.out.println("Time: ");           //Lap Time
            System.out.println("Lap Degredation: ");//Degredation this lap
            System.out.println("Current Tyre Life: "); //Current life
            System.out.println();
            System.out.println("Do you want to pit? (y/n)"); //Pit Determine

        }//end lap count of the race

    } //end Lap Output

  
    //SOFT TYRE WORK
    public static void softDegredation() {
        int startLife = 100; //percent of tyre left
        int currentLife; //life at any given lap
        int lapDeg;
        int highDeg = 8; //high percent of tyre loss
        int lowDeg = 3; //low percent of tyre loss
        Random deg = new Random();
        lapDeg = deg.nextInt(highDeg - lowDeg) + lowDeg;
        while (currentLife > 0) {

        }//Tyre Degredation Sim

    } //end soft tyre Degredation data

    public static void softLapTime() {

    }// end soft Lap Time

   
    //MEDIUM TYRE WORK
    public static void mediumDegredation() {

    }//end medium tyre data

    public static void mediumLapTime() {

    } //end lap time

    //HARD TYRE WORK
    public static void hardDegredation() {

    }//end Degredation

    public static void hardLapTime() {

    } //end lap time

    //MAIN
    public static void main(String[] args) {
        welcome(); //gather lap count
        start(); //gather tyre choice
    }//end main

}//end class 
