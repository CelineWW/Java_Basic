import java.util.Scanner;

public class Zoo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String animalType;
      String animalColor;
      int animalAge;
   
      animalType = scnr.next();
      animalColor = scnr.next();
      animalAge = scnr.nextInt();

      Animal animal1 = new Animal();
      Animal animal2 = new Animal(animalType, animalColor);
      Animal animal3 = new Animal(animalType, animalColor, animalAge);

      animal1.print();
      animal2.print();
      animal3.print();
   }
}