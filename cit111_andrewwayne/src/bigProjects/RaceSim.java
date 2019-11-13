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

    static int tyreType;
    static int startingLife = 100;
    static int currentLife = 100;
    static int lapCounter = 1;
    static int laps;
    static double totalTime = 0;
    static int finalTime;
    static double lapTime;
    static int lapDeg;
    static int currentDeg;
    final static int PITTIME = 10;

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
                + "at a rate between 4 and 7 percent per lap.");
        System.out.println();
        System.out.println("(2.)MEDIUM TYRE: Is a balance of fast and durable.");
        System.out.println("Fast Lap is 93 seconds, and its deg rate is 2 and 5.");
        System.out.println();
        System.out.println("(3.)HARD TYRE: offers longevity while sacrificing "
                + "outright pace.");
        System.out.println("Its fast lap is 97S seconds, its deg rate is between"
                + " 2 and 3.");
        System.out.println("What tyre (1,2,3) would you like to start the race on?");
        System.out.println();
        System.out.println();
        tyreType = choice.nextInt();
    }//end start

    public static void raceSim() {
        switch (tyreType) {
            case 1:
                softDegredation();
                softLapTime();
                break;
            case 2:
                mediumDegredation();
                mediumLapTime();
                break;
            case 3:
                hardDegredation();
                hardLapTime();
        }//end switch statement for tyre type

    }//end race sim

    public static boolean pitQuestion() {
        Scanner scanner = new Scanner(System.in);
        boolean stopforPit = false;
        System.out.println("Would you like to pit for new tyres? (y/n)");
        String answer = scanner.next();
        answer = answer.toLowerCase();
        if (answer.equals("y") || answer.equals("yes")) {
            stopforPit = true;
            System.out.println("What tyre should we stop for");
            tyreType = scanner.nextInt();
            totalTime = totalTime + PITTIME;
        } //end if statement
        return stopforPit;
    }//end pit Question

    public static void lapOutput() {
        System.out.println("Lap: " + lapCounter); //Current Lap
        System.out.println("Time: " + lapTime);           //Lap Time
        System.out.println("Total Race Time: " + totalTime);
        System.out.println("Lap Degredation: " + lapDeg);//Degredation this lap
        System.out.println("Current Tyre Life: " + currentLife); //Current life
        System.out.println();

    } //end Lap Output

    public static void retirement() {
        if (currentLife <= 0) {
            System.out.println("Your tyre ran out of life. You must retire"
                    + " the car.");
            System.exit(0);
        }
    } //end retirement

    //SOFT TYRE WORK
    public static void softDegredation() {

        int highDeg = 7; //high percent of tyre loss
        int lowDeg = 4; //low percent of tyre loss
        if (currentLife > 0) {
            Random deg = new Random();
            lapDeg = deg.nextInt(highDeg - lowDeg) + lowDeg;
            currentLife = currentLife - lapDeg;
            currentDeg = startingLife - currentLife;
            retirement();
        } else {
            System.out.println("Your tyres ran out of life! You have to "
                    + "retire the car.");
        } //end if

    } //end soft tyre Degredation data

    public static void softLapTime() {
        int fastestLap = 90;
        lapTime = (((currentDeg - 1) * (currentDeg - 1)) / 125) + fastestLap;
        //I used DESMOS graphing utilities to find a proper exponential increase to lap time
        //with respect to tyre degredation.
        totalTime = totalTime + lapTime;
    }// end soft Lap Time

    //MEDIUM TYRE WORK
    public static void mediumDegredation() {
        int highDeg = 5; //high percent of tyre loss
        int lowDeg = 2; //low percent of tyre loss
        if (currentLife > 0) {
            Random deg = new Random();
            lapDeg = deg.nextInt(highDeg - lowDeg) + lowDeg;
            currentLife = currentLife - lapDeg;
            currentDeg = startingLife - currentLife;
            retirement();
        } else {
            System.out.println("Your tyres ran out of life! You have to "
                    + "retire the car.");
        } //end if

    }//end medium tyre data

    public static void mediumLapTime() {
        int fastestLap = 93;
        lapTime = (((currentDeg - 1) * (currentDeg - 1)) / 125) + fastestLap;
        //I used DESMOS graphing utilities to find a proper exponential increase to lap time
        //with respect to tyre degredation.
        totalTime = totalTime + lapTime;

    } //end lap time

    //HARD TYRE WORK
    public static void hardDegredation() {
        int highDeg = 3; //high percent of tyre loss
        int lowDeg = 2; //low percent of tyre loss
        if (currentLife > 0) {
            Random deg = new Random();
            lapDeg = deg.nextInt(highDeg - lowDeg) + lowDeg;
            currentLife = currentLife - lapDeg;
            currentDeg = startingLife - currentLife;
            retirement();
        } else {
            System.out.println("Your tyres ran out of life! You have to "
                    + "retire the car.");
        } //end if

    }//end Degredation

    public static void hardLapTime() {
        int fastestLap = 97;
        lapTime = (((currentDeg - 1) * (currentDeg - 1)) / 125) + fastestLap;
        //I used DESMOS graphing utilities to find a proper exponential increase to lap time
        //with respect to tyre degredation.
        totalTime = totalTime + lapTime;
    } //end lap time

    public static void finalTime() {
        double minutes = totalTime / 60;
        double remain = totalTime % 60;
        int min = (int) minutes;
        int sec = (int) remain;
        System.out.println("Your total time for the " + laps + " race was: " + min + " minutes "
                + "and " + sec + " seconds.");
    }

    //MAIN
    public static void main(String[] args) {
        welcome(); //gather lap count
        start(); //gather tyre choice
        while (lapCounter <= laps) {
            if (lapCounter > 1 && pitQuestion()) {
                currentDeg = 0;
                currentLife = 100;
                System.out.println("You have pitted for fresh " + tyreType);
                System.out.println("The pit stop cost you " + PITTIME + " "
                        + "seconds");
            }//end PITTING
            raceSim();
            lapOutput();
            lapCounter = lapCounter + 1;
        } //close while
        System.out.println("Congratulations, you have completed "
                + "the CIT 111 Grand Prix.");
        finalTime();
        System.out.println("See if you can improve on your time!");
    }//end main

}//end class S 
