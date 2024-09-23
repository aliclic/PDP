import model.Circle;
import model.Rectangle;
import model.Triangle;

public class PrototypeTest {
    public static void main(String[] args) {
        // Criando e clonando um Retângulo
        Rectangle rect1 = new Rectangle();
        rect1.x = 10;
        rect1.y = 20;
        rect1.width = 15;
        rect1.height = 25;
        rect1.color = "Blue";

        Rectangle rectClone = (Rectangle) rect1.clone();
        System.out.println("Original Rectangle: " + rect1);
        System.out.println("Cloned Rectangle: " + rectClone);

        System.out.println("\n--------------------------------\n");

        // Criando e clonando um Círculo
        Circle circle1 = new Circle();
        circle1.x = 5;
        circle1.y = 7;
        circle1.radius = 10;
        circle1.color = "Red";

        Circle circleClone = (Circle) circle1.clone();
        System.out.println("Original Circle: " + circle1);
        System.out.println("Cloned Circle: " + circleClone);

        System.out.println("\n--------------------------------\n");

        // Criando e clonando um Triângulo
        Triangle triangle1 = new Triangle();
        triangle1.x = 0;
        triangle1.y = 0;
        triangle1.base = 8;
        triangle1.height = 12;
        triangle1.color = "Green";

        Triangle triangleClone = (Triangle) triangle1.clone();
        System.out.println("Original Triangle: " + triangle1);
        System.out.println("Cloned Triangle: " + triangleClone);
    }
}
