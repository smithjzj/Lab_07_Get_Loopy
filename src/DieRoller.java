import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String playAgain;

        // Task 8

        do {
            System.out.printf("%-6s %-5s %-5s %-5s %-4s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------");

            int rollCount = 0;
            int die1, die2, die3;

            while (true) {
                rollCount++;

                // Generate values between 1 and 6
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("%-6d %-5d %-5d %-5d %-4d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            // Ask user to continue
            System.out.print("\nDo you want to roll again? (y/n): ");
            playAgain = in.nextLine();
            System.out.println(); // Adds a blank line between games

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}

