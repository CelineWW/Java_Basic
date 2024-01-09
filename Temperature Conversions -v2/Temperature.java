
/**
 * Temperature stores a termperature in Fahrenheit, Celisius
 * and Kelvin scales.
 * @author Celine
 * @version 2.0
 */
public class Temperature{
    private double degreesFahrenheit; // Fahrenheit temperature
    private double degreesCelsius; // Celsius temperature
    private double degreesKelvin; // Kelvin temperature

    // Constructors
    /**
     * This constructors for Temperature sets the temperature 
     * values to the value in degrees, based on type
     * 
     * @param type temperature scale to use
     * @param degrees 
     */
    public Temperature(String type, double degrees) {  
        if (type.equalsIgnoreCase("C"))
            setDegreesCelsius(degrees);
        else if (type.equalsIgnoreCase("F"))
            setDegreesFahrenheit(degrees);
        else if (type.equalsIgnoreCase("K"))
            setDegreesKelvin(degrees);
    }
    
    // methods
    /**
     * getDegreesCelsius retrieves the Celsius temperature value
     * @return a double value containing the Celsiu temperature
     */
    public double getDegreesCelsius(){
        return degreesCelsius;
    }

    /**
     * getDegreesKelvin retrieves the Kelvin temperature value
     * @return a double value containing the Kelvin temperature
     */
    public double getDegreesKelvin(){
        return degreesKelvin;
    }

    /**
     * getDegreesFahrenheit retrieves the Fahrenheit temperature value
     * @return a double value containing the Fahrenheit temperature
     */
    public double getDegreesFahrenheit(){
        return degreesFahrenheit;
    }

    /**
     * The setDegreesFahrenheit method sets the Fahrenheit temperature value
     * @param degrees The Fahrenheit value to store
     */
    public void setDegreesFahrenheit(double degrees){
        degreesFahrenheit = degrees; // set Fahrenheit value
        degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius
        degreesKelvin = degreesCelsius + 273.15; // set Kelvin
    }

    public void setDegreesCelsius(double degrees) {
        degreesCelsius = degrees;
        degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32.0;
        degreesKelvin = degreesCelsius + 273.15;
    }

    public void setDegreesKelvin(double degrees) {
        degreesKelvin = degrees;
        degreesCelsius = degreesKelvin - 273.15;
        degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32.0;
    }
}
