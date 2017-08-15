import java.util.Random;
public class Jar{
  
  private String itemName;
  private int maxAmount;
  private int amountInJar;
  
  public Jar(){};
    
  public Jar(String itemName, int maxAmount){
    setItemName(itemName);
    setMaxAmount(maxAmount);
    
  }
  
  public void fill(int maxAmount){
    Random random = new Random();
    int x = random.nextInt(maxAmount + 1);

    this.amountInJar  =     x;
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
  
}