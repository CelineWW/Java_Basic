import java.util.Scanner;
/**
 * TemperatureDriver runs and tests the Temperature class.
 *
 * @author Celine
 * @version 3.0
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
        boolean moreTemperature = true;
        boolean goodType = false;
        boolean goodTemperature = false;

        while(moreTemperature) {
            // read the temperature type
            System.out.print("Enter a temperature type (C = Celsius, " +
                "F= Fahrenheit, K = Kelvin, Q = Quit): ");
            // variable declarations, outer loop, and prompt are here
            temperatureType = keyboard.next();
            
            // check temperature type
            goodType = false;
            while (! goodType ) {
                if (temperatureType.equalsIgnoreCase("Q") ||
                    temperatureType.equalsIgnoreCase("C") ||
                    temperatureType.equalsIgnoreCase("F") ||
                    temperatureType.equalsIgnoreCase("K")){
                        goodType = true;
                    }
                else {
                    System.out.println("Invalid temperature type!");
                    System.out.println("The type must be C,F,K,or Q.");
                    System.out.println("Please enter the temperature type again: ");
                    temperatureType = keyboard.next();
                }
            }
            
            if (temperatureType.equalsIgnoreCase("Q")) {
                moreTemperature = false;
                System.out.println("\nProgram ended.");
            }

            else {
                goodTemperature = false;
                do {
                    System.out.print("Enter a temperature: ");
                    if (keyboard.hasNextDouble()){
                        inputTemperature = keyboard.nextDouble();
                        if ((temperatureType.equalsIgnoreCase("C") && inputTemperature >= -273.15) ||
                             (temperatureType.equalsIgnoreCase("F") && inputTemperature >= -459.67) ||
                             (temperatureType.equalsIgnoreCase("K") && inputTemperature >= 0))
                             goodTemperature = true;
                        else {
                            System.out.println("You entered an invalid temperature!");
                            System.out.println("It must be greater than absolute zero.");
                            System.out.println("Try again.");
                        }
                    }
                    else {
                        System.out.println("You entered an invalid temperature!");
                        System.out.println("It must be a numeric value.");
                        System.out.println("Try again.");
                        keyboard.next();
                    }
                } while ( ! goodTemperature);
                
                
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
                else {
                    System.out.println("You entered an invalid temperature type: " + temperatureType);
                    System.out.println("It must be \"C\", \"F\", or \"K\". Please try the program again.");
                }
            }
        }
    }
}