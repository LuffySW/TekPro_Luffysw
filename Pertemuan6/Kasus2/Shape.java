package Kasus2;
public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: " + shapeName;
    }
}