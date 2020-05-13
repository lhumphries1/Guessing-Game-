import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Select your WINNING number between 1-10");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == 7) {
            System.out.println("Congratulations you have won!");
        } else {
            System.out.println("You have lost!");
        } if (guess == 0){
            System.out.println("Select your WINNING number between 1-10");
          guess = input.nextInt();

        }

    }
}