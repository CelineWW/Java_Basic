
public class Order {
   private String food;
   private char option;

	public void setDetails(String newFood, char newOption) {
		food = newFood;
		option = newOption;
	}

   public void print() {
      System.out.println("Order: " + food + ", Option: " + option);
   }
}