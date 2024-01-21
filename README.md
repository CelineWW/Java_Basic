# Java Programming
Practice basic Java programming
## Temperature Convesion Program
### Version 1
1. Create Temperature class to hold object with
    - private double **degreesFahrenheit**; 
    - private double **degreesCelsius**; 
    - private double **degreesKelvin**; 
    - constructor
    - getter & setter methods

2. Create TemperatureDriver class with main method. 
    - prompt user to enter *Fahrenheit temperature*.

### Version 2
1. Modify **Version 1** to ask user to choose the *temperature type* for input.
    ```
    if (temperatureType.equalsIgnoreCase("C")) {}
    else if (temperatureType.equalsIgnoreCase("F")) {}
    else if (temperatureType.equalsIgnoreCase("K")) {}  
    else {<invalid message>}
    ```
2. Assume user input temperatures are valid, convert temperature to two other types. 

### Version 3 
1. Add while and do-while loop continuously run the program untill user choose to end.

    ```
    if (temperatureType.equalsIgnoreCase("Q")) {
        moreTemperature = false;
        System.out.println("\nProgram ended.");
    }
    ```

2. Add Temperature validation to **Version 2**
    ```
    inputTemperature = keyboard.nextDouble();
    if ((temperatureType.equalsIgnoreCase("C") && inputTemperature >= -273.15) ||
        (temperatureType.equalsIgnoreCase("F") && inputTemperature >= -459.67) ||
        (temperatureType.equalsIgnoreCase("K") && inputTemperature >= 0))
        goodTemperature = true;
    ```
### Version 4
Modify  **Version 3** to throw appropriate Erro messages if user use invalid entry.
1. Add InvalidTemperatureTypeException class
2. Add InvalidTemperatureException class 

    ```
    public class InvalidTemperatureTypeException extends Exception {
        public InvalidTemperatureTypeException(){
            super();
        }
        public InvalidTemperatureTypeException(String message){
            super(message);
        }
    }
    ```