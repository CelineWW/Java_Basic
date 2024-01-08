
/**
 * TextWritter is a class that will store and display any text string.
 *
 * @author Celine
 * @version1/8/2024
 */
public class TextWritter {
    // instance variable
    private String textToDisplay; // the text to be displayed
    
    // constructors
    public TextWritter(){  // default constructor
        textToDisplay = "";
    }
    
    public TextWritter(String inputText){   //overloading constructor
       textToDisplay = inputText; 
    }
    
    // methods/actions
    public void setTextToDisplay(String inputText){
        textToDisplay = inputText;
    }
    
    public String getTextToDisplay(){
        return textToDisplay;
    }
    
    public void display(){
        System.out.println(textToDisplay);
    }
}
