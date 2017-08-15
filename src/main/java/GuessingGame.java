import java.util.Scanner;

public class GuessingGame{


 /*public class Order {
 private String itemName;
    private int priceInCents;
    private String discountCode;

    public Order(String itemName, int priceInCents) {
        this.itemName = itemName;
        this.priceInCents = priceInCents;
    }
    private String normalizeDiscountCode(String discountCode){

        for(char character : discountCode.toCharArray()){
            if (!Character.isLetter(character) && character != '$'  ){
                throw new IllegalArgumentException("Invalid discount code.");
            }
        }
        return discountCode.toUpperCase();

    }

    public String getItemName() {
        return itemName;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void applyDiscountCode(String discountCode) {
        try{
            this.discountCode = normalizeDiscountCode(discountCode);
        } catch (IllegalArgumentException e) {

        }
    }
}*/
    public static void main(String[] args) {

      int count = 1;
      Jar jar = new Jar();


      System.out.println("What type of item will be stored in the jar?");
      Scanner scanner = new Scanner(System.in);
      jar.setItemName(scanner.nextLine());

      System.out.printf("How many %s(s) fit in the jar? ", jar.getItemName());
      jar.setMaxAmount( scanner.nextInt());
      System.out.printf("Jar fits %d %s(s) ", jar.getMaxAmount(), jar.getItemName());

      // Filling jar with fill method
      jar.fill(jar.getMaxAmount());
      System.out.println(jar.getAmountInJar());

      System.out.printf("How many %s(s) do you think there are considering there are more than 0 and less than %d?",        jar.getItemName(), jar.getMaxAmount());
      int guess = scanner.nextInt();


      while(guess != jar.getAmountInJar() ){
       System.out.println("Incorrect. Guess again");
       guess = scanner.nextInt();
       count++;
     } if(guess == jar.getAmountInJar()){
        System.out.printf("You guessed %d %s(s) and there is/are %d %s(s). You got it in %d attempt(s).\n", guess, jar.getItemName(), jar.getAmountInJar(), jar.getItemName(), count);
      }


    }

}
