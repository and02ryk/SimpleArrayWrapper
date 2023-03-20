import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class SimpleArrayWrapperTest {

    private SimpleArrayWrapper<Integer> array;

    @Test
    public void testGetValidIndex() {
        SimpleArrayWrapper<Integer> array = new SimpleArrayWrapper<>(new Integer[]{1, 2, 3});
        assertEquals(Integer.valueOf(2), array.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetInvalidIndex() {
        SimpleArrayWrapper<Integer> array = new SimpleArrayWrapper<>(new Integer[]{1, 2, 3});
        array.get(3);
    }

    @Test
    public void testAddWithoutIndex() {
        SimpleArrayWrapper<Integer> array = new SimpleArrayWrapper<>(new Integer[]{1, 2, 3});
        array.add(4);
        assertEquals(Integer.valueOf(4), array.get(3));
        assertEquals(4, array.length());
    }

    @Test
    public void testRemoveWithIndex() {
        SimpleArrayWrapper<Integer> array = new SimpleArrayWrapper<>(new Integer[]{1, 2, 3});
        array.remove(1);
        assertEquals(Integer.valueOf(3), array.get(1));
        assertEquals(2, array.length());
    }
}