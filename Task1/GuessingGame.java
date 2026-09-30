package Task1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;
        final int MAX_ATTEMPTS = 7;
       
        String playAgain;
    do {
          int computerNo = rand.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
          int count = 1;
          boolean won = false;
          
        
        System.out.println("Guess the number between " + MIN_NUMBER + " and " + MAX_NUMBER + ". You have " + MAX_ATTEMPTS + " attempts!");

        while (count <= MAX_ATTEMPTS) {
            System.out.print("Attempt " + count + " - Enter your guess: ");

            int guess;
           
            try {
                guess = sc.nextInt(); 
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.next();
                continue; 
            }

            if(guess<MIN_NUMBER || guess>MAX_NUMBER){
                System.out.println("Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
                continue;
            }

            // if guess < computerNo   -> ?
            if(guess < computerNo){
                System.out.println("Your guess is too low.");
            }
            // else if guess > computerNo -> ?
            else if(guess > computerNo){
                System.out.println("Your guess is too high.");
            }
            // else -> won = true, aur loop rokna hai
            else {
                won = true;
                System.out.println("Congratulations! You've guessed the number!");
                break; 
            }
            
            count++;
        }
          if (!won){
            System.out.println("Sorry, you've used all your attempts. The  number was: " + computerNo);
       
        }

        System.out.print("Do you want to play again? (y/n): ");
         playAgain = sc.next();
 
    } while (playAgain.equalsIgnoreCase("y")); // Infinite loop to keep playing until the user decides to exit

      
        System.out.println("Thank you for playing the Guessing Game!");
        sc.close();
    }
}