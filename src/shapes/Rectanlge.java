package shapes;

import java.awt.geom.Area;

public class Rectanlge extends Quadralateral implements Measurable {

    public Rectanlge(double length, double width) {
        super(length, width);
    }
    @Override
    public void setLength() {

    }
    @Override
    public void setWidth() {
    }
    @Override
    public double getPerimeter() {
        return this.length* 2 + this.width*2;
    }
    @Override
    public double getArea() {
        return length*width;
    }
}

