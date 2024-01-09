
/**
 * Circle is a class calculates circumference,
 * area and sphere's suface area based on radius.
 *
 * @author Celine
 * @version 1.0
 */
public class Circle
{
    // instance variables
    private double radius;
    private double circumference;
    private double area;
    private double surfaceArea;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(){  // default constructor
        this(0.0);
    }
    
    public Circle(double r){
        setRadius(r);
    }
    

    /**
     * setRadius method sets the radius and calculate other parameters
     *
     * @param  radius 
     */
    public void setRadius(double r){
        radius = r;
        circumference = 2 * r * Math.PI;
        area = Math.PI * Math.pow(r, 2);
        surfaceArea = 4 * Math.PI * Math.pow(r, 2);
    }
    
    /**
     * getRadius method retrieves the radius
     *
     * @return a double value containing radius 
     */
    public double getRadius(){
        return radius;
    }
    
    /**
     * getCircumference method retrieves the circumference
     *
     * @return a double value containing circumference 
     */
    public double getCircumference(){
        return circumference;
    }
    
    /**
     * getArea method retrieves the area
     *
     * @return a double value containing area 
     */
    public double getArea(){
        return area;
    }
    
    /**
     * getSurfaceArea method retrieves the surface area
     *
     * @return a double value containing surface area 
     */
    public double getSurfaceArea(){
        return surfaceArea;
    }
}
