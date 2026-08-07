package objects;

public class HomeAreaCalculator {
    static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(10);
        rectangle.setLength(10);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}
