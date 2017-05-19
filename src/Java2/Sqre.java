package Java2;

/**
 * Created by Amberlee on 5/19/17.
 */
public class Sqre {
    private final double width;
    private final double length;


    public Sqre (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {

        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}

