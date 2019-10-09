/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author andrew.wayne
 */
public class Projfriends {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int THRESHOLD = 40;
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", let's find out if we should"
                + " be friends.");
        //Intro and name
        int score = 0;

        System.out.println("Let's start by seeing what we both enjoy.");
        System.out.println("Do you play any sports similar to myself?\n");
        System.out.println("You will type 1 for yes or 0 for no");

        System.out.println("Tennis?");
        int tennis = input.nextInt();
        if (tennis == 1) {
            score = score + 10;
        } else {
            score = score - 10;
            System.out.println("That's alright, let's move on.");
        }
        //end tennis
        System.out.println("Ping Pong?");
        int pong = input.nextInt();
        if (pong == 1) {
            score = score + 10;
        } else {
            score = score - 5;
            System.out.println("Not a problem, let's move on."
            );
        }
        //end ping pong
        System.out.println("Soccer?");
        int soccer = input.nextInt();
        if (soccer == 1) {
            score = score + 20;
            System.out.println("Awesome! What position do you play?");
            System.out.println("Type 1 for goalie, 2 for defense, 3 for "
                    + "midfield, or 4 for forward.");
            int position = input.nextInt();
            if (position == 1) {
                score = score - 5;
                System.out.println("That's unfortunate.");
            } else if (position == 2) {
                score = score - 5;
                System.out.println("I don't like defenders.");
            } else if (position == 3) {
                score = score + 10;
                System.out.println("Midfield is the best position!");
            } else if (position == 4) {
                score = score + 5;
                System.out.println("I like forwards too.");
            }
        } else { //top level if else
            score = score - 20;
            System.out.println("I do not think we can recover from this,"
                    + " but let's continue");
        }

        //end soccer
        //end sports 
        System.out.println("Let's move on to music!");
        System.out.println("What is your preferred genre out of these choices?");
        System.out.println("Type 1 for yes, 0 for no.");
        System.out.println("Indie Pop?");
        int indiepop = input.nextInt();
        if (indiepop == 1) {
            score = score + 10;
        System.out.println("Me too! Do you enjoy The XX?");
            int xx= input.nextInt();
            if (xx==1) {
                score=score+10;
            }
        } else score=score-10;
        
        System.out.println("Synthwave?");
        int synth=input.nextInt();
        if (synth==1) {
            System.out.println("I love synthwave! Have you heard of Toro y Moi?");
            int toro=input.nextInt();
            if (toro==1) {
                score=score+20;
            }
        } else score=score-10;

        if (score >= THRESHOLD) {
            System.out.println("I think we should be friends!");
        } else 
            System.out.println("It was nice talking to you, but I don't "
                    + "think we should be friends.");
        System.out.println("The threshold for friendship is: " + THRESHOLD);
        System.out.println("Our compatibility is: " + score);

    }
}
