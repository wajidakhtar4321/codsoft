import java.util.Random;
import java.util.*;

public class number_game {
    public static int guessing_game() {
        Random rand = new Random();
        int random_no = rand.nextInt(100) + 1;
        int numberofTries = 0;
        Scanner sc = new Scanner(System.in);
        boolean win = false;

        while (win == false) {
            // System.out.println("The correct number is "+random_no);
            int guess = sc.nextInt();
            numberofTries++;

            if (guess == random_no) {
                win = true;
            } else if (guess > random_no) {
                System.out.println("your guess is too high");
            } else if (guess < random_no) {
                System.out.println("your guess is too low");
            }
            if (numberofTries == 9) {
                break;
            }

        }
        if (win == true) {

            System.out.println("Great You Guess a correct no ");
            System.out.println("you predict the correct number in " + numberofTries + " tries");
        } else if (numberofTries == 9) {
            System.out.println("you lost the game as your number of tries exhausted");
            System.out.println("The correct number is " + random_no);
        }
        System.out.println();

        return numberofTries;
    }

    public static void end_game() {
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        while (game == true) {
            System.out.println("Do you want to play the game again ?? press 1 for yes and 0 for no");
            int number = sc.nextInt();

            if (number == 1) {
                winner();
            } else {
                game = false;
            }
        }
        System.out.println("!! Game Over !!");

        sc.close();
    }

    public static void winner() {
        System.out.println("Both of the  Players are Guess the number in between range 1 to 100");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player 1 name : ");
        String user1 = sc.next();
        System.out.print("Enter player 2 name : ");
        String user2 = sc.next();

        System.out.println(user1 + " Your Turn Enter the Guess no ");
        int player_1 = guessing_game();

        System.out.println("Now " + user2 + " Your Turn you Enter the Guess no ");
        int player_2 = guessing_game();

        if (player_1 < player_2) {
            System.out.println("!!Congratulations!! " + user1 + " You Won the Game And You Predict the correct no in "
                    + player_1 + " Attempts");
        } else if (player_1 > player_2) {
            System.out.println("!!Congratulations!! " + user2 + " You Won the Game And You Predict the correct no in "
                    + player_2 + " Attempts");
        } else if (player_1 == 9 && player_2 == 9) {
            System.out.println("You both are lose the game because you not predict the no in 8 Attempts.");
        } else {
            System.out.println("Game is tie on both player are predict the correct no in " + player_1 + " times");
        }
    }

    public static void output() {
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        while (game == true) {
            System.out.println("Do you want to play with computer or your friends.");
            System.out.print("For computer press 1 and for friends press 0 : ");

            int number = sc.nextInt();

            if (number == 1) {
                System.out.println("Guess the number in between range 1 to 100");
                int out = guessing_game();
                if (out <= 8) {
                    System.out.println(" !!Congratulations!! YOu Won The Game... ");
                } else {
                    System.out.println(" !! BETTER LUCK NEXT TIME !! You lose The Game... ");
                }
            } else {
                winner();
            }
        }
    }

    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("### Welcome to Number Game ### ");
        System.out.println(
                "This is a computer Game and  Multiplayer Game (Both players will get 8 attempts to   predict the correct number.)");
        output();
        end_game();
    }
}
