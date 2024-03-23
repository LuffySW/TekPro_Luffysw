package Kasus2;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius,String shapeName) {
        super(shapeName); // Invoke the no-argument constructor of the Shape class
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Calculate the surface area of the sphere
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere with radius: " + radius + ", area: " + getArea();
    }
}

