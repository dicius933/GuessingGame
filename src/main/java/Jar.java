import java.util.Random;
public class Jar{

  private String itemName;
  private Integer guess = 0;
  private int maxAmount =0;
  private int amountInJar;
  private int attempts=0;

  
  public Jar(){};
    
  public Jar(String itemName, int maxAmount){
    setItemName(itemName);
    setMaxAmount(maxAmount);
    
  }

  private int normalizeGuess(int guess) {
      if(guess > maxAmount ) {
          throw new IllegalArgumentException("Your guess must be less than " + Integer.toString(maxAmount));
      }
      if(Integer.toString(guess).length() == 0){
          throw new IllegalArgumentException("No number found");
      }
      return guess;
  }
  public boolean applyGuess(int guess){
    setGuess(normalizeGuess(guess));
      if (getGuess() > amountInJar){
          System.out.println("Your guess is too high");
      }else if(getGuess() < amountInJar){
          System.out.println("Your guess is too low");
      }
      attempts++;
    return isWon();
  }
  public boolean isWon(){
      boolean correctGuess = getGuess().intValue()== getAmountInJar();
      return correctGuess;
  }


  public void fill(){
    Random random = new Random();
    this.amountInJar = random.nextInt(getMaxAmount() + 1);
  }

  
  public String getItemName(){
    return itemName;
  }
  
  public int getMaxAmount(){
    return maxAmount;
  }
  
  public int getAmountInJar(){
    return amountInJar;  
  }


  public void setItemName(String itemName){
    this.itemName = itemName;
  }
  
  public void setMaxAmount(int maxAmount){
    this.maxAmount = maxAmount; 
  }

  public Integer getGuess() {
        return guess;
    }

  public void setGuess(Integer guess) {
        this.guess = guess;
    }


    public int getAttempts() {
        return attempts;
    }
}