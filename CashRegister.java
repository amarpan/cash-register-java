import java.util.ArrayList;

/**
   A simulated cash register that tracks the item count and
   the total amount due.
*/
public class CashRegister
{
   private static int instances = 0;
   private int item_count;
   private int total_price;
   private ArrayList<Integer> allPrices = new ArrayList<Integer>();
   /**
      Constructs a cash register with no sale.
   */
   public CashRegister() {
      item_count = 0;
      total_price = 0;
      instances++;
   }
   /**
      Clears this cash register.
   */
   public void clear() {
      item_count = 0;
      total_price = 0;
   }

   /**
      Adds an item to this cash register.
      @param price the price of the added item
   */
   public void addItem(int price){
      allPrices.add(price);
      item_count++;
      total_price = total_price + price;
   }

   /**
      Gets the price of all items in the current sale.
      @return the total amount
   */
   public double getTotal() {
      return total_price; 
   }

  
   /**
      Gets the number of items in the current sale.
      @return the item count
   */
   public int getCount() {
      return item_count; 
   }

   public static int instanceCount() {
      return instances;
   }

   /**
    Displays the prices of all items in the current sale.
    @return all the prices in an array list
  */
   public ArrayList displayAll() {
     return allPrices;
   }
}