package co.com.calculations;

import co.com.shapes.Point;
import co.com.shapes.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleCalculationsTest {

    private RectangleCalculations rectangleCalculations = new RectangleCalculations();


    // @Before
    public void setUp() throws Exception {
    }

   // @Test
    public void getIntersectionPoints() {
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

   // @Test
    public void areAdjacent() {
    }
}