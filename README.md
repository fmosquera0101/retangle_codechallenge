# Rectangles
This is a Maven Java 11 project that implement certain algorithms to calculate, interceptions points, contaiment and adjacency of tow rectangles.


Rectangle is represented by the entity class Rectangle.java which contains a constructor to with tow params, point p1 which represents the bottom-left point (x, y) and p2 which represents the top-right point (x, y), with this tow points I construct the top-left point p3 and the bottom-right point p4

Considerations:
I’m assuming that the rectangle constructed is parallel to the X line of Cartesian plane, which mean that for that this rectangle is not rotated.

Rectangles with all points in (0,0) means that there no rectangle represented in cartesian plan because its total rea is 0.

Different Algorithms can be found in the class:
RectangleCalculations.java

public Rectangle getIntersectionPoints(Rectangle r1, Rectangle r2){} Calculate the intersection points which is returned in a Rectangle object, if both Rectangles don not have intersection returned Rectangle will contain all its point in (0,0) and an area of 0.



public boolean isContained(Rectangle r1, Rectangle r2){} 
Return true or false if Rectangle R1 is fully contained in Rectangle R2


public boolean areAdjacent(Rectangle r1, Rectangle r2)
Return true or False if tow rectangles are adjacent, which is share one of its sides


Unit Tests:
We can find unit test in the RectangleCalculationTest.java which tests different test case scenario for every method described before.
![image](https://user-images.githubusercontent.com/25505457/177424448-5b260400-cc88-439c-a816-75b94e041b42.png)
