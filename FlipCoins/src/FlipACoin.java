import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
   
   public static  String coinFlip(Random rand) {
      final String[] COINS = {"Tails", "Heads"};
      int randomValue = rand.nextInt(2);
      return COINS[randomValue];
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(); // Unique seed

      int count = scnr.nextInt();
      int i;
      
      for(i = 0; i < count; ++i) {
         System.out.println(coinFlip(rand));
      }
   }
}
