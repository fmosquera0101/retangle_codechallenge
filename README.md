# Rectangles
This is a Maven Java 11 project that implements certain algorithms to calculate, interception points, containment and adjacency of two rectangles.


Rectangle is represented by the entity class **Rectangle.java** which contains a constructor  with two params:
point p1 which represents the bottom-left point (x, y) and p2 which represents the top-right point (x, y)
with this two points I construct the top-left point p3 and the bottom-right point p4

The Entity class **Point.java** represents a point in cartesian plane.


**Considerations**:

I’m assuming that the rectangle constructed is parallel to the X line of Cartesian plane, which mean that this rectangle is not rotated.

Rectangles with all points in (0,0) have an area of 0

**Different Algorithms can be found in the class**:

*RectangleCalculations.java*

*public Rectangle getIntersectionPoints(Rectangle r1, Rectangle r2){}* 
Calculate the intersection points which is returned in a Rectangle object, if both Rectangles don not have intersection points a Rectangle object will be returned with all its point in (0,0) and an area of 0.


*public boolean isContained(Rectangle r1, Rectangle r2){}* 

Return true or false if Rectangle R1 is fully contained in Rectangle R2


*public boolean areAdjacent(Rectangle r1, Rectangle r2){}*

Return true or False if two rectangles are adjacent, share one of its sides


**Unit Tests**:

We can find unit tests in the **RectangleCalculationTest.java** which have different test case scenarios for every method described before.

