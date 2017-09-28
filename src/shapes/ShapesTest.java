package shapes;

public class ShapesTest {
    public static void main(String[] args) {

           Rectanlge box1 = new Rectanlge(5,4);
        System.out.println("Box1 perimeter = " + box1.getPerimeter());
        System.out.println("Box1 area = " + box1.getArea());

        Rectanlge box2 = new Square(5);
        System.out.println("Box2 perimeter = " + box2.getPerimeter());
        System.out.println("Box2 area = " + box2.getArea());

    }
}
