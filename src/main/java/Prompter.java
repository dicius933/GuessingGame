import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by yeshua on 8/16/2017.
 */
public class Prompter {

    private Jar jar;

    public Prompter(Jar jar) {
        this.jar = jar;
    }

    public void promptForInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of item will be stored in the jar?");
        jar.setItemName(scanner.nextLine());
        System.out.printf("How many %s(s) fit in the jar? ", jar.getItemName());
        jar.setMaxAmount( scanner.nextInt());
    }

    public boolean promptForGuess(){
    Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        boolean isAcceptable = false;

        do{
            System.out.printf("How many %s(s) do you think there are considering there are more than 0 and less than %d?", jar.getItemName(), jar.getMaxAmount());


            try{
                int guess = scanner.nextInt();
                isCorrect = jar.applyGuess(guess);
                isAcceptable = true;
            }catch(IllegalArgumentException iae){
                System.out.printf("%s.Please try again.%n", iae.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Invalid value!");
                scanner.next();
            }
        } while(! isAcceptable);
        return isCorrect;
    }

    public void displayOutcome(){
        System.out.printf("You guessed %d %s(s) and there is/are %d %s(s). You got it in %d attempt(s).\n", jar.getGuess(), jar.getItemName(), jar.getAmountInJar(), jar.getItemName(), jar.getAttempts());
    }
}
