/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andrew.wayne
 */
public class KennywoodRideTracker {

    static int totalRiders = 0;
    static int totalFailedAttempts = 0;
    static int totalSickRiders = 0;
    //declares and initializes total data
    final static int THRILLHEIGHT = 167; //min requirement for thrill in cm
    final static int THEMEHEIGHT = 102; //min req for theem in cm

    final static int LOW = 70;
    final static int HIGH = 200;
    final static int TOP = 24;
    final static int BOTTOM = 1;
    static int rides;
    static int count = 1;

    //delcaring minimum requirements
    public static void main(String[] args) {
        Random h = new Random();
        Random r = new Random();
        int randH; 
        int randR;
        Scanner simulate = new Scanner(System.in);

        System.out.println("Let's simulate your rides.");
        System.out.println("How many rides of each should we simulate?");
        rides = simulate.nextInt();
        while (count <= rides) {
            System.out.println();
            System.out.println("This is Simulation number "+count);
                randH=h.nextInt(HIGH - LOW) + LOW;
                randR=r.nextInt(TOP - BOTTOM) + BOTTOM;
            
            rideBlackWidow(randR, randH);

            rideMerryGoRound(randR, randH);

            count = count + 1;
            
        }
        System.out.println();    
        printRiderStats();

    } //closes main

    public static void rideBlackWidow(int riders, double avgh) {
        if (avgh >= THRILLHEIGHT) {
            System.out.println("THRILL SIM.");
            System.out.println("Riders for this sim "+riders);
            totalRiders = totalRiders + riders;

            Random sick = new Random();
            int sickRiders = sick.nextInt(riders);
            totalSickRiders = totalSickRiders + sickRiders;
        } else {
            totalFailedAttempts = totalFailedAttempts + riders;
            System.out.println("Failed attempts for BW: " + riders);
        }//Closes if/else
    } //closes black widow

    public static void rideMerryGoRound(int r, double avgh) {
        if (avgh >= THEMEHEIGHT) {
            System.out.println("THEME SIM.");
            System.out.println("Riders for this sim "+r);
            totalRiders = totalRiders + r;

            Random sick = new Random();
            int sickRiders = sick.nextInt(r);
            totalSickRiders = totalSickRiders + sickRiders;
        } else {
            totalFailedAttempts = totalFailedAttempts + r;
            System.out.println("Failed attempts for MGR: " + r);
        }//Closes if/else

    } //closes merry go round

    public static void printRiderStats() {
        System.out.println("Here are the statistics for your two rides.");
        System.out.println("Total Rides: "+ count);
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Attempts: " + totalFailedAttempts);
        System.out.println("Total sick riders: " + totalSickRiders);
    } //end rider stats

} //closes class
