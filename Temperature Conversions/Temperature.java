
/**
 * Temperature stores a termperature in Fahrenheit, Celisius
 * and Kelvin scales.
 * @author Celine
 * @version 1.0
 */
public class Temperature{
    private double degreesFahrenheit; // Fahrenheit temperature
    private double degreesCelsius; // Celsius temperature
    private double degreesKelvin; // Kelvin temperature
    
    // Constructors
    /**
     * Default constructors for Temperature sets the default
     * value of the Temperature object to 0.0 degrees
     * Fahrenheit with Celsius and Kelvin equivalents
     */
    public Temperature() {  // default constructor
        this(0.0);
    }
    
    /**
     * This constructor for Temperature sets the Fahrenheit
     * value to the value from degrees, then calculates
     * equivalent Celsius and Kelvin values using setDegreesFahrenheit()
     * @param degrees degreedFahrenheit
     */
    public Temperature(double degrees){
        setDegreesFahrenheit(degrees);
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
     * The setDegreesFahrenheit method sets the Fahrenheit temperature value
     * @param degrees The Fahrenheit value to store
     */
    public void setDegreesFahrenheit(double degrees){
        degreesFahrenheit = degrees; // set Fahrenheit value
        degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius
        degreesKelvin = degreesCelsius + 273.15; // set Kelvin
     }
     
}
