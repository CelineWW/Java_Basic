
/**
 * Rectangle is a class calculates perimeter and surfacer area
 *
 * @author Celine
 * @version 1.0
 */
public class Rectangle
{
    // instance variables
    private double width;
    private double height;
    private double perimeter;
    private double surfaceArea;

    /**
     * Constructor for objects of class Circle
     */
    public Rectangle(){  // default constructor
        this(0.0, 0.0);
    }
    
    public Rectangle(double w, double h){
        setRectangle(w, h);
    }
    

    /**
     * setRectangle method sets the width and height,
     * then calculate other instance variables
     *
     * @param  width w and height h 
     */
    public void setRectangle(double w, double h){
        width = w;
        height = h;
        perimeter = 2 * ( h + w );
        surfaceArea = h * w;
    }
    
    /**
     * getwidth method retrieves the width
     *
     * @return a double value containing width
     */
    public double getWidth(){
        return width;
    }
    
    /**
     * getHeight method retrieves the height
     *
     * @return a double value containing height
     */
    public double getHeight(){
        return height;
    }
    
    /**
     * getPerimeter method retrieves the perimeter
     *
     * @return a double value containing perimeter
     */
    public double getPerimeter(){
        return perimeter;
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
