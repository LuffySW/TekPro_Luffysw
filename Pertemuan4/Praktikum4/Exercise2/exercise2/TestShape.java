package exercise2;
public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(2.5, "yellow", true);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(3.0, 4.0, "orange", false);
        System.out.println(rectangle2);

        Square square1 = new Square(5.0);
        System.out.println(square1);

        square1.setLength(6.0);
        System.out.println(square1);
    }
}
