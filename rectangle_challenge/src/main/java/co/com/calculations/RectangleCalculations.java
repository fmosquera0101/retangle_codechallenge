package co.com.calculations;

import co.com.shapes.Point;
import co.com.shapes.Rectangle;

public class RectangleCalculations {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(2,1),new Point(7, 7));
        Rectangle r2 = new Rectangle(new Point(3,3), new Point(6,5));

        System.out.println(r1);
        System.out.println(r2);

        RectangleCalculations rectang = new RectangleCalculations();
        Rectangle rectangleIntersect = rectang.getIntersectionPoints(r1, r2);
        System.out.println(rectangleIntersect);
        System.out.println("Are adjacent: "+rectang.areAdjacent(r1, r2));
        System.out.println("R2 is contained in R1: "+rectang.isContained(r1, r2));

    }

    public Rectangle getIntersectionPoints(Rectangle r1, Rectangle r2){

        int x4 = Math.max(r1.getP1().getX(), r2.getP1().getX());
        int y4 = Math.max(r1.getP1().getY(), r2.getP1().getY());

        int x5 = Math.min(r1.getP2().getX(), r2.getP2().getX());
        int y5 = Math.min(r1.getP2().getY(), r2.getP2().getY());
        if(x4 > x5 || y4 > y5){
            return new Rectangle(new Point(0, 0), new Point(0, 0));
        }

        Point p1 = new Point(x4, y4);
        Point p2 = new Point(x5, y5);

        return new Rectangle(p1, p2);

    }

    public boolean isContained(Rectangle r1, Rectangle r2){

        return (r1.getP1().getX() < r2.getP1().getX() && r1.getP1().getY() < r2.getP1().getY()) &&
                (r1.getP2().getX() > r2.getP2().getX() && r1.getP2().getY() > r2.getP2().getY());
    }

    public boolean areAdjacent(Rectangle r1, Rectangle r2){
        return  (r1.getP2().getX() == r2.getP1().getX()) || (r1.getP1().getY() == r2.getP2().getY());
    }
}
