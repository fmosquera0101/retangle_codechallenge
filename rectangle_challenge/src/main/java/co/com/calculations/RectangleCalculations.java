package co.com.calculations;

import co.com.shapes.Point;
import co.com.shapes.Rectangle;


public class RectangleCalculations {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(-4,1), new Point(-1,4));
        Rectangle r2 = new Rectangle(new Point(-3,3),new Point(-2, 5));

        System.out.println(r1);
        System.out.println(r2);

        RectangleCalculations rectang = new RectangleCalculations();
        Rectangle rectangleIntersect = rectang.getIntersectionPoints(r1, r2);
        System.out.println(rectangleIntersect);
        System.out.println("Are adjacent: "+rectang.areAdjacent(r1, r2));
        System.out.println("R1 is contained in R2: "+rectang.isContained(r1, r2));

    }

    /**
     * Calculate te intersections points of two rectangles
     * return a Rectangle with area zero or point in (0,0) position if the rectangles don't overlap
     * @param r1
     * @param r2
     * @return Rectangle
     */
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

    /**
     * Determine if Rectangle r1 is contained in Rectangle 2
     * @param r1
     * @param r2
     * @return true or false
     */
    public boolean isContained(Rectangle r1, Rectangle r2){
        return (r2.getP1().getX() < r1.getP1().getX() && r2.getP1().getY() < r1.getP1().getY()) &&
                (r2.getP2().getX() > r1.getP2().getX() && r2.getP2().getY() > r1.getP2().getY());
    }

    /**
     * Return true or false if Rectangle r1 is adjacent to Rectangle R2, it is if they share one side
     * @param r1
     * @param r2
     * @return
     */
    public boolean areAdjacent(Rectangle r1, Rectangle r2){
        return  (r1.getP2().getX() == r2.getP1().getX()) || (r1.getP1().getY() == r2.getP2().getY());
    }
}
