import java.util.Scanner;
/**
 * TemperatureDriver runs and tests the Temperature class.
 *
 * @author Celine
 * @version 2.0
 */
public class TemperatureDriver{
   /**
    * main() reads two Fahrenheit temperatures and 
    * displays their Celsius and Kelvin equivalents.
    */ 
   public static void main(String[] args){
       double inputTemperature = 0.0;
       Scanner keyboard = new Scanner(System.in);
       Temperature t1;
       String temperatureType = "";
       
       System.out.print("Enter a temperature type (C for Celsius, " +
               "F for Fahrenheit, K for Kelvin): ");
       temperatureType = keyboard.next();
       System.out.print("Enter a temperature: ");
       inputTemperature = keyboard.nextDouble();
       t1 = new Temperature(temperatureType, inputTemperature);
       
       // when compare objects, use method equals()
       // can't use == operator here because == compares memory address.
       if (temperatureType.equalsIgnoreCase("C")) { 
           System.out.println("You entered " + inputTemperature + " degrees Celsius");
           // t1.setDegreesFahrenheit(inputTemperature);
           System.out.println("Which is " + t1.getDegreesFahrenheit() + " degrees Fahrenheit");
           System.out.println("and " + t1.getDegreesKelvin() + " degrees Kelvin.");
       }
       else if (temperatureType.equalsIgnoreCase("F")) { 
           System.out.println("You entered " + inputTemperature + " degrees Fahrenheit");
           // t1.setDegreesFahrenheit(inputTemperature);
           System.out.println("Which is " + t1.getDegreesCelsius() + " degrees Celsius");
           System.out.println("and " + t1.getDegreesKelvin() + " degrees Kelvin.");
       }
       else if (temperatureType.equalsIgnoreCase("K")) { 
           System.out.println("You entered " + inputTemperature + " degrees Kelvin");
           // t1.setDegreesFahrenheit(inputTemperature);
           System.out.println("Which is " + t1.getDegreesCelsius() + " degrees Celsius");
           System.out.println("and " + t1.getDegreesFahrenheit() + " degrees Fahrenheit.");
       }
      
    }
}