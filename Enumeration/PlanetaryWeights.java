
import java.util.Scanner;
/**
 * PlanetaryWeights takes in a user's weight and returns
 * what that user would weigh on the different planets in the
 * solar system. It uses the enumeration Planet.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class PlanetaryWeights {
    public static void main(String[] args) {
        double earthWeight = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your weight on Earth: ");
        if (in.hasNextDouble()) {
            earthWeight = in.nextDouble();
            for (Planet p : Planet.values())
                System.out.println("Your weight on " + p + " is " +
                                    p.getWeight(earthWeight));
        }
        else {
            System.out.println(in.next() + " is not a valid number.");
        }
    }
}