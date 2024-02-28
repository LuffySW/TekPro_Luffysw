package Praktikum4.Exercise2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double w, double l){
        setWidth(w);
        setLength(l);
    }

    public Rectangle(double w, double l, String c, boolean f){
        setWidth(w);
        setLength(l);
        setColor(c);
        setFilled(f);
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length*width);
    }

    public String toString(){
        return "A Rectangle with width="+ width + " and length="+ length +", which is a subclass of"+ super.toString() ;
    }
}
