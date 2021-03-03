package sky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void setX() {
        Table table = new Table();
        table.setX(4);
        assertTrue(table.getX() == 4);
    }

    @Test
    void setY() {
        Table table = new Table();
        table.setY(4);
        assertTrue(table.getY() == 4);
    }
}