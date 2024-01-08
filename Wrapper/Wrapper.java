
/**
 * Write a description of class Wrapper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wrapper
{
    public static void main(String[] args) {
        String intString = "99";
        String floatString = "99.999";
        int intVariable;
        double doubleVariable;
        
        // stores 99 into intVariable then displays it
        intVariable = Integer.parseInt(intString);
        System.out.println(intVariable);
        
        // stores 99.999 into doubleVariable
        doubleVariable = Double.parseDouble(floatString);
        System.out.println(doubleVariable);
        
        // displays largest int Value
        System.out.println(Integer.MAX_VALUE);
        
        // stores then displays largest double value
        doubleVariable = Double.MAX_VALUE;
        System.out.println(doubleVariable);
    }// End main
} // End Wrapper
