public class GuessingGame{

    public static void main(String[] args) {

      Jar jar = new Jar();
      Prompter prompter = new Prompter(jar);
      prompter.promptForInfo();
      jar.fill();

      while(!jar.isWon()) {
          prompter.promptForGuess();
      }
      prompter.displayOutcome();
    }
}
