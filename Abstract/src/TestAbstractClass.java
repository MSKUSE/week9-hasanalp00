import java.util.ArrayList;

public class TestAbstractClass {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(2, 2);
        System.out.println(square);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        Shape r1 = new Rectangle(3, 4);
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        ArrayList <Shape> shapes=new ArrayList<Shape>();
        System.out.println(shapes.get(1));

    }

}
