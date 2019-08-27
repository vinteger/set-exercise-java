import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {

    private Set empty;
    private Set one;
    private Set many;

    @Before
    public void setUp(){
        empty = new Set();
        one = new Set();
        many = new Set();

        one.add(1);
        many.add(1);
        many.add(2);
    }

    @Test
    public void emptiness() {
        assertTrue(empty.isEmpty());
    }

    @Test
    public void add() {
        assertFalse(one.isEmpty());
        assertFalse(many.isEmpty());
    }

    @Test
    public void size() {
        assertEquals(0, empty.size());
        assertEquals(1, one.size());
        assertEquals(2, many.size());
    }

    @Test
    public void contains() {
        assertTrue(one.contains(1));
        assertTrue(many.contains(1));
        assertTrue(many.contains(2));
    }

    @Test
    public void noDuplicates() {
        many.add(2);

        assertEquals(2, many.size());
    }

    @Test
    public void remove() {
        many.remove(1);

        assertEquals(1, many.size());
        assertFalse(many.contains(1));
    }
}
