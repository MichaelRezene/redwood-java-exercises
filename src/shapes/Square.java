package shapes;

public class Square extends Quadralateral {
    protected double side;

    public Square(double length, double width) {
        super(length, width);
    }
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    @Override
    public void setWidth() {
        this.length = width;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return this.length;
    }
    @Override
    public double getArea() {
        return this.length*this.width;
    }
}

