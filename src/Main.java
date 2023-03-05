/*
Sabrina Henige
IT1090C
Andy Zimmerman
Craps Game
Desc: This game begins by rolling two dice. The sum of the rolls is then used to either crap out,
getting a natural, or setting the point. The user then continues to roll until they roll a 7
or roll the point. The user is then asked if they would like to play again.
*/
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        //declare variables
        String anything = new String ("");
        int dieOne;
        int dieTwo;
        int dieOneTwo;
        int dieTwoTwo;
        int sum = 15;
        int point;
        int quitOrStay = 1;
        int check = 1;
        int checkOne = 1;
        //while so that user can keep playing
        while (quitOrStay ==1) {
            //explain to user and have them input something so it feels like they're rolling the dice
            System.out.println("Welcome to Craps. Input anything to roll the dice.");
            anything = input.next();
            //generate random number for the dice
            dieOne = generator.nextInt(6) + 1;
            dieTwo = generator.nextInt(6) + 1;
            //calculate the point
            point = dieOne + dieTwo ;
            //show user the results
            System.out.println("The first die rolled " + dieOne + " and the second die rolled " + dieTwo + ". The point is " + point);
            //check if its craps, natural, or point
            if (point == 2 || point == 3 || point == 12) {
                System.out.println("You rolled craps. You lose.");
            }
            else if (point == 7 || point == 11) {
                System.out.println("You rolled a natural. You win!");
            }
            else {
                while (checkOne == 1) {
                    System.out.println("Now try to roll the point, but don't get a 7!");
                    System.out.println("Input anything to roll the dice.");
                    anything = input.next();
                    //generate random number for the dice
                    dieOneTwo = generator.nextInt(6) + 1;
                    dieTwoTwo = generator.nextInt(6) + 1;
                    //calculate the sum
                    sum = dieOneTwo + dieTwoTwo;
                    System.out.println("The first die rolled " + dieOneTwo + " and the second die rolled " + dieTwoTwo + ". The sum is " + sum);
                    //if they rolled a 7
                    if (sum == 7) {
                        System.out.println("You rolled a 7. You lose!");
                        checkOne = 2;
                    }
                    //if they rolled the point
                    if (sum == point) {
                        System.out.println("You rolled the point. You win!");
                        checkOne = 2;
                    } else {
                        checkOne = 1;
                    }
                }
            }
                System.out.println("If you would like to play again, enter a 1. If you would like to quit, enter a 2");
                //see if user would like to play again
                    quitOrStay = input.nextInt();
            }


    }
}