

public class Casting {
    public static void main(){
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
        
        String s = "abc";
        String t = "DEF";
        int i = 99;
        double d = 9.999;
                
        String u = s + t;  // puts "abcDEF" into u
        u = s + i;         // puts "abc99" into u
        u = t + d;         // puts "DEF9.999" into u
        System.out.print("The value in my int variable is ");
        System.out.println(i);
        System.out.println("The value in my int variable is " + d);
        
    }//End main
}// End Casting
