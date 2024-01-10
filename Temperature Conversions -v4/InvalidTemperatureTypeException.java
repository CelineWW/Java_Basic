
/**
 * InvalidTemperatureTypeException is an exception that gets thrown if
 * a user tried to create a Temperature object using an invalid temperature
 * type.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class InvalidTemperatureTypeException extends Exception {
    /**
     * Default Constructor for objects of class InvalidTemperatureTypeException
     * It creates an InvalidTemperatureTypeException with a null detail message.
     */
    public InvalidTemperatureTypeException(){
        super();
    }
    
    /**
     * Constructor for objects of class InvalidTemperatureTypeException
     * It creates an InvalidTemperatureTypeException with a specific detail message.
     */
    public InvalidTemperatureTypeException(String message){
        super(message);
    }
}
