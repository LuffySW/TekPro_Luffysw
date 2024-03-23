package Kasus2;

class Cylinder extends Shape {
    private double radius;
    private double height;
    public Cylinder(double radius, double height,String shapeName) {
        super(shapeName); // Add constructor call to the superclass Shape
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + radius + ", height: " + height + ", area: " + getArea();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius * height;
    }
}