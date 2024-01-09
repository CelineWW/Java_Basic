import java.util.Scanner;
/**
 * CircleDriver runs and tests Circle class.
 *
 * @author Celine
 * @version 1.0
 */
public class CircleDriver
{
    public static void main(String[] args){
        double inputRadius = 0.0;
        Scanner keyboard = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2;
        
        System.out.print("Enter the radius of a circle: ");
        inputRadius = keyboard.nextDouble();
        c1.setRadius(inputRadius);
        System.out.println("Your entered radius: " + inputRadius);
        System.out.println("The circumference is " + c1.getCircumference());
        System.out.println("The area is " + c1.getArea());
        System.out.println("The surface area is " + c1.getSurfaceArea());
        
        System.out.print("Enter the radius of another circle: ");
        inputRadius = keyboard.nextDouble();
        c2 = new Circle(inputRadius);
        System.out.println("Your entered radius: " + inputRadius);
        System.out.println("The circumference is " + c2.getCircumference());
        System.out.println("The area is " + c2.getArea());
        System.out.println("The surface area is " + c2.getSurfaceArea());
    }
}
