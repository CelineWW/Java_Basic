public class City {
   private int population;
   private String name;

	public void setDetails(int newPopulation, String newName) {
		population = newPopulation;
		name = newName;
	}

   public void print() {
      System.out.println("City population: " + population + ", Name: " + name);
   }
}