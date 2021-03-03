package sky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void setDirection() {
        Point point = new Point();
        point.setDirection("north");
        assertTrue(point.getDirection().equals("north"));
    }

    @Test
    void getDirection() {
        Point point = new Point();
        point.setDirection("north");
        assertTrue(point.getDirection().equals("north"));
    }

    @Test
    void setX() {
        Point point = new Point();
        point.setX(4);
        assertTrue(point.getX() == 4);
    }

    @Test
    void setY() {
        Point point = new Point();
        point.setY(4);
        assertTrue(point.getY() == 4);
    }

    @Test
    void getX() {
        Point point = new Point();
        point.setX(4);
        assertTrue(point.getX() == 4);
    }

    @Test
    void getY() {
        Point point = new Point();
        point.setY(4);
        assertTrue(point.getY() == 4);
    }
}