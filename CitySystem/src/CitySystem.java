import java.util.Scanner;
import java.util.ArrayList;

public class CitySystem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      SmallTowns smallTowns = new SmallTowns();

      smallTowns.inputCities(scnr);
      smallTowns.printCities();
   }
}
