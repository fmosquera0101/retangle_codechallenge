package co.com.shapes;

/**
 * Entity that represents a Rectangle
 * can be constructed providing bottom left points p1 (x, y) and top right points p2 (x, y)
 * with those points top left p3 (x, y), and points  bottom right p4 (x, y) can be constructed
 */
public class Rectangle {

    private Point p1;
    private Point p2;

    private Point p3;
    private Point p4;

    private int area;


    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        p3 = new Point(p1.getX(), p2.getY());
        p4 = new Point(p2.getX(), p1.getY());

        area = calculateArea(p1, p2);
    }

    private int calculateArea(Point p1, Point p2) {
        return (p2.getX() - p1.getX()) * (p2.getY() - p1.getY());
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public int getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                ", area=" + area +
                '}';
    }
}
