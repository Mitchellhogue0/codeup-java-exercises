package shapes;

class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        super.length = super.width = side;
    }

    @Override
    public void setWidth(double side) {
        super.width = super.length = side;
    }

    @Override
    public double getPerimeter() {
        return length + width + length + width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
