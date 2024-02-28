public class Circle {
    private double radius;
    private String color;

    // Constructors (overloaded)    /** Constructs a Circle instance with default value for radius and color */ 
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r){
        radius = r;
        color = "red"; 
    }

    public Circle(double r, String c){
        setRadius(r);
        setColor(c);
    }

    /*return nilai radius */
    public double getRadius(){
        return radius;
    }
     
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */    
    public String toString() {       
        return "Circle[radius=" + radius + " color=" + color + "]";    
    } 

     /** Returns the area of this Circle instance */ 
     public double getArea(){
        return radius*radius*Math.PI;
    }
}
