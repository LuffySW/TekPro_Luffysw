package exercise2;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){
        radius = 1.0;
    }

    public Circle(double r){
        setRadius(r);
    }

    public Circle(double r, String c, boolean f){
        setRadius(r);
        setColor(c);
        setFilled(f);
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;    
    }

    @Override
    public String toString(){
        return "Circle[color=" + getColor() + " filled=" + isFilled() + " radius=" + getRadius() + "]";
    }
}
