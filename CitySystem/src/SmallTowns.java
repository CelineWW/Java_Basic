import java.util.Scanner;
import java.util.ArrayList;

public class SmallTowns {
   private ArrayList<City> cityList = new ArrayList<City>();

   public void inputCities(Scanner scnr) {
      String name;
      int population;
      
      population = scnr.nextInt();
      while (population != -999) {
         name = scnr.next();
         City city = new City();
         city.setDetails(population, name);
         cityList.add(city);
         population = scnr.nextInt();
      }
   }

   public void printCities() {
      City currCity;
      int i;

      for (i = 0; i < cityList.size(); ++i) {
         currCity = cityList.get(i);
         currCity.print();
      }
   }
}