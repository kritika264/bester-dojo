package bester;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldReturnTrueIfFirstRectangleIsBetterThanSecond() throws Exception {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(1, 2);
        assertTrue(rectangle1.isBetter(rectangle2));
    }

    @Test
    public void shoulfReturnFalseIfSecondRectangleIsBetterThanFirst() throws Exception {
        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(2,2);

        assertFalse(rectangle1.isBetter(rectangle2));
    }

    @Test
    public void shouldReturnBestRectangleWhenGivenOneReactangle() throws Exception {
        Rectangle rectangle = new Rectangle(1,2);
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(rectangle);
        assertEquals(rectangle, Bester.findBest(rectangles));
    }

    @Test
    public void shouldReturnTheBestRectangleOutOfTwoRectangles() throws Exception {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 5);
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);

        assertEquals(rectangle2, Bester.findBest(rectangles));
    }
    @Test
    public void shouldReturnTheBestRectangleOutOfThreeRectangles() throws Exception {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Rectangle rectangle3 = new Rectangle(6, 7);
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);

        assertEquals(rectangle3, Bester.findBest(rectangles));
    }
}
