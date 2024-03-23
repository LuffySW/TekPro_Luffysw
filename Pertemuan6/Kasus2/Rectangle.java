package Kasus2;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String shapeName) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with length: " + length + ", width: " + width + ", area: " + getArea();
    }
}

