public class Animal {
   private String type;
   private String color;
   private int age;
   
   public Animal() { // Default constructor
      type = "None";
      color = "Undefined";
      age = -1;
   }
   
   public Animal(String animalType, String animalColor) {
      type = animalType;
      color = animalColor;
      age = -1;
   }
   
   public Animal(String animalType, String animalColor, int animalAge) {
      type = animalType;
      color = animalColor;
      age = animalAge;
   }
   
   public void print() {
      System.out.println("Animal: " + type + ", " + color + ", " + age);
   }
}