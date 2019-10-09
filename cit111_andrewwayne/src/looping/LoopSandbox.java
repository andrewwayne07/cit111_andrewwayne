/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author andrew.wayne
 */
public class LoopSandbox {
    public static void main(String[] java){
        long time = System.currentTimeMillis();
        System.out.println("time ms: "+time);
        long seconds = time/1000;
        System.out.println("Time sec: "+seconds);
        long hours = (seconds/60) /60;
        System.out.println("Hours: "+hours);
        long days = hours/24;
        System.out.println("days: "+days);
        long years = days/365;
        System.out.println("years: "+years);
    }
    
}
