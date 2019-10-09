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
public class practice {
    public static void main(String[] args) {
        int count=0;
        int numLoops=300000;
        long start=System.currentTimeMillis();
        long end;
        
            System.out.println("Start Looping at: "+start);
        while(count<numLoops){
            System.out.println("Value of Count: "+count);
            count=count+1;
        } //close while
        end=System.currentTimeMillis();
            System.out.println("Stopped Looping at:" + end);
        long milli=end-start;
        System.out.println("Total time to compute is:" + ((end-start))+
                " milliseconds");
        double seconds=(double)milli/1000;
        System.out.println("Which translates to: " + seconds+" seconds");
    } //close main
    
} //close class
