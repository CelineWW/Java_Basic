
/**
 * InvalidTemperatureException is an exception that gets thrown if
 * a user tried to create a Temperature object using an invalid temperature
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InvalidTemperatureException extends Exception {
    /**
     * Default Constructor for objects of class InvalidTemperatureException
     * It creates an InvalidTemperatureTypeException with a null detail message.
     */
    public InvalidTemperatureException(){
        super();
    }
    
    /**
     * Constructor for objects of class InvalidTemperatureException
     * It creates an InvalidTemperatureException with a specific detail message.
     */
    public InvalidTemperatureException(String message) {
        super(message);
    }
}
