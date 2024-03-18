import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int answer, guess, c = 0, score = 0, TS = 0;

        final int MIN = 1;
        final int MAX = 100;
        final int ATTEMPT = 5;
        final int ROUNDS = 3;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Maximum number of rounds is : " + ROUNDS);
        System.out.println("Maximum number of attempts in each round is :" + ATTEMPT);

        for (int i = 1; i <= ROUNDS; i++) {
            answer = rand.nextInt(MAX - MIN + 1) + MIN;
            c = 0;
            System.out.println("Round: " + i);





             while (c < ATTEMPT) {
                System.out.println("Guess a number between 1 and 100");
                guess = sc.nextInt();
                c++;

                if (guess == answer) {
                    score = ATTEMPT - c;
                    TS = TS + score;
                    System.out.println("Score is: " + score);
                    System.out.println("Number of guesses taken " + c);
                    break;
                } else if (guess > answer) {
                    System.out.println("Guess lower");
                    score = ATTEMPT - c;
                    System.out.println("Number of guesses remaining " + score);
                } else {
                    System.out.println("Guess higher");
                    score = ATTEMPT - c;
                    System.out.println("Number of guesses remaining " + score);
                }
            }
        }

        System.out.println("Total Score for 3 rounds is: " + TS);
    }
}


 