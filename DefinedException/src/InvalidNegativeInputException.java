//public class InvalidNegativeInputException extends Exception {
//   private String inputName;
//   private double inputValue;
//
//   public InvalidNegativeInputException(String name, double value) {
//      super("Input " + name + " is negative");
//      inputName = name;
//      inputValue = value; 
//   }
//  
//   public String getInputName() {
//	   return inputName;
//   }
//
//   public double getInputValue() {
//	   return inputValue;
//   }
//}



public class InvalidNegativeInputException extends Exception {
   public InvalidNegativeInputException(String varName) {
      super("Variable " + varName + " is negative");
   }
}