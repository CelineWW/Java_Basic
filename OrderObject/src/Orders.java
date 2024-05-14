import java.util.Scanner;
import java.util.ArrayList;

public class Orders {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Order> orderList = new ArrayList<Order>();
      Order currOrder;
      String currFood;
		char currOption;
      int i;

      
      currFood = scnr.next();
      while (!currFood.equals("done")) {
         currOption = scnr.next().charAt(0);
         currOrder = new Order();
         currOrder.setDetails(currFood, currOption);
         orderList.add(currOrder);
         currFood = scnr.next();
      }

      for (i = 0; i < orderList.size(); ++i) {
         currOrder = orderList.get(i);
         currOrder.print();
      }
   }
}