import java.util.Scanner;
/**
 * RectangleDriver runs and tests Rectangle class.
 *
 * @author Celine
 * @version 1.0
 */
public class RectangleDriver
{
    public static void main(String[] args){
        double inputWidth = 0.0;
        double inputHeight = 0.0;
        Scanner keyboard = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        
        // take user input for width and height
        System.out.print("Enter the width of the rectangle: ");
        inputWidth = keyboard.nextDouble();
        // r1.setWidth(inputWidth);
        System.out.print("Enter the height of the rectangle: ");
        inputHeight = keyboard.nextDouble();
        // r1.setHeight(inputHeight);
        r1.setRectangle(inputWidth, inputHeight);
        
        System.out.print("Your entered width: " + inputWidth );
        System.out.println(" and height: " + inputHeight);
        System.out.println("The perimeter is " + r1.getPerimeter());
        System.out.println("The surface area is " + r1.getSurfaceArea());
        
        // Another rectangel
        System.out.print("Enter the width of another rectangle: ");
        double inputWidth2 = keyboard.nextDouble();
        System.out.print("Enter the height of another rectangle: ");
        double inputHeight2 = keyboard.nextDouble();
        Rectangle r2 = new Rectangle(inputWidth2, inputHeight2);
        
        System.out.print("Your entered width: " + inputWidth2 );
        System.out.println(" and height: " + inputHeight2);
        System.out.println("The perimeter is " + r2.getPerimeter());
        System.out.println("The surface area is " + r2.getSurfaceArea());
    }
}
