public class Main {

    public static void main(String[] args) {

        // Creating Circle object
        Shape circle = new Circle(5);

        System.out.println("----- CIRCLE -----");
        circle.displayMessage();
        circle.calculateArea();

        System.out.println();

        // Creating Rectangle object
        Shape rectangle = new Rectangle(10, 5);

        System.out.println("----- RECTANGLE -----");
        rectangle.displayMessage();
        rectangle.calculateArea();
    }
}