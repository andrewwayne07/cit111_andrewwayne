/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagecore;

import java.util.Random;

/**
 *
 * @author andrew.wayne
 */
public class QualityControl {
    final static int QUALITY_THRESHOLD = 43;
    final static int MAX_QUALITY = 100;
    final static int UNITS_TO_MAKE = 100000;
    
    static int unitQuality = 0;
    static int totalFailures = 0;
    static int totalUnitsMade = 0;
    
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        while(totalUnitsMade < UNITS_TO_MAKE) {
            
            unitQuality = randomGenerator.nextInt(MAX_QUALITY + 1);
            System.out.println("Unit Quality: " + unitQuality);
            totalUnitsMade = totalUnitsMade + 1;
            
            if(unitQuality < QUALITY_THRESHOLD) {
                System.out.println("Unit below quality standards!");
                totalFailures = totalFailures + 1;
            } else {
                System.out.println("Unit passes quality test");
            } //close if/else
            
            System.out.println("Total Failures: " + totalFailures +
                    " out of " + totalUnitsMade + " units made");
        } // closes while
        
       double productionRatio = (double)totalFailures / (double)totalUnitsMade;
       //Print summary 
       System.out.println("***PRODUCTION SUMMARY***");
            System.out.println("Tested " + totalUnitsMade + " Units.");
            System.out.println("Failure Ratio: " + productionRatio);
    } //Closes Main
} //Closes Class
