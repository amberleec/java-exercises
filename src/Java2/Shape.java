package Java2;

/**
 * Created by Amberlee on 5/19/17.
 */
public class Shape {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Square box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
