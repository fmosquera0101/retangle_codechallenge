package co.com.calculations;

import co.com.shapes.Point;
import co.com.shapes.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleCalculationsTest {

    private RectangleCalculations rectangleCalculations = new RectangleCalculations();

    @Test
    public void intersectionPointsCase4InterceptionPoints() {
        Rectangle r1 = new Rectangle(new Point(2,1), new Point(6,4));
        Rectangle r2 = new Rectangle(new Point(3,1),new Point(5, 5));
        Rectangle rectangleIntersection = rectangleCalculations.getIntersectionPoints(r1, r2);
        Assert.assertTrue(rectangleIntersection.getArea() > 0);
        Assert.assertTrue(rectangleIntersection.getP1().getX() == 3 && rectangleIntersection.getP1().getY() == 1);
        Assert.assertTrue(rectangleIntersection.getP2().getX() == 5 && rectangleIntersection.getP2().getY() == 4);
        Assert.assertTrue(rectangleIntersection.getP3().getX() == 3 && rectangleIntersection.getP3().getY() == 4);
        Assert.assertTrue(rectangleIntersection.getP4().getX() == 5 && rectangleIntersection.getP4().getY() == 1);

    }
    @Test
    public void intersectionPoints() {
        Rectangle r1 = new Rectangle(new Point(2,2), new Point(7,6));
        Rectangle r2 = new Rectangle(new Point(3,3),new Point(6, 8));
        Rectangle rectangleIntersection = rectangleCalculations.getIntersectionPoints(r1, r2);
        Assert.assertTrue(rectangleIntersection.getArea() > 0);
        Assert.assertTrue(rectangleIntersection.getP1().getX() == 3 && rectangleIntersection.getP1().getY() == 3);
        Assert.assertTrue(rectangleIntersection.getP2().getX() == 6 && rectangleIntersection.getP2().getY() == 6);

    }


    @Test
    public void NotIntersectionPoints() {
        Rectangle r1 = new Rectangle(new Point(2,2), new Point(7,6));
        Rectangle r2 = new Rectangle(new Point(3,7),new Point(6, 8));
        Rectangle rectangleIntersection = rectangleCalculations.getIntersectionPoints(r1, r2);
        Assert.assertTrue(rectangleIntersection.getArea() == 0);
        Assert.assertTrue(rectangleIntersection.getP1().getX() == 0 && rectangleIntersection.getP1().getY() == 0);
        Assert.assertTrue(rectangleIntersection.getP2().getX() == 0 && rectangleIntersection.getP2().getY() == 0);

    }

    @Test
    public void isContained() {
        Rectangle r1 = new Rectangle(new Point(3,3), new Point(6,5));
        Rectangle r2 = new Rectangle(new Point(2,1),new Point(7, 7));
        Assert.assertTrue(rectangleCalculations.isContained(r1, r2));

    }
    @Test
    public void isNotContained() {
        Rectangle r1 = new Rectangle(new Point(1,3), new Point(6,5));
        Rectangle r2 = new Rectangle(new Point(2,1),new Point(7, 7));
        Assert.assertFalse(rectangleCalculations.isContained(r1, r2));

    }

   @Test
    public void areAdjacentSharingLefOrRightSide() {
       Rectangle r1 = new Rectangle(new Point(1,2), new Point(4,5));
       Rectangle r2 = new Rectangle(new Point(4,7),new Point(6, 7));
       Assert.assertTrue(rectangleCalculations.areAdjacent(r1, r2));
    }
    @Test
    public void areAdjacentSharingBottomOrUpperSide() {
        Rectangle r1 = new Rectangle(new Point(1,4), new Point(5,8));
        Rectangle r2 = new Rectangle(new Point(2,1),new Point(5, 4));
        Assert.assertTrue(rectangleCalculations.areAdjacent(r1, r2));
    }

    @Test
    public void areNotAdjacent() {
        Rectangle r1 = new Rectangle(new Point(1,2), new Point(3,5));
        Rectangle r2 = new Rectangle(new Point(4,7),new Point(6, 7));
        Assert.assertFalse(rectangleCalculations.areAdjacent(r1, r2));
    }
}