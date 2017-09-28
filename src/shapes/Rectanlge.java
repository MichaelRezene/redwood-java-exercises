package shapes;

import java.awt.geom.Area;

public class Rectanlge {

    private double length;
    private double width;

    public Rectanlge(){
    }
    public Rectanlge(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return  length;
    }
    public double getWidth() {
        return width;
    }
    public  double getArea(){
        return  length * width;

    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);

    }
}
