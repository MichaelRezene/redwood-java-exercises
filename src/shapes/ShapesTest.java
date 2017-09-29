package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Measurable myShape = new Rectanlge(5,4);

        System.out.println("Box1 perimeter = " + myShape.getPerimeter());
        System.out.println("Box1 area = " + myShape.getArea());


    }
}

