package task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexOfAnyTest {
  //Your tests go here

    @Test
    public void testSimple() throws Exception {
        int result = IndexOfAny.indexOfAny("01234567", new char[]{'2', '5'});
        assertEquals(5, result);
    }

    @Test
    public void testSimpleChange() throws Exception {
        int result = IndexOfAny.indexOfAny("01234567", new char[]{'5', '2'});
        assertEquals(2, result);
    }

    @Test
    public void testFindFistChar() throws Exception {
        int result = IndexOfAny.indexOfAny("012534567", new char[]{'2', '5'});
        assertEquals(2, result);
    }

    @Test
    public void testFindSecondChar() throws Exception {
        int result = IndexOfAny.indexOfAny("01x2534567", new char[]{'1', '2', '5'});
        assertEquals(3, result);
    }

    @Test
    public void testEmptyStr() throws Exception {
        int result = IndexOfAny.indexOfAny("", new char[]{'a', 'b'});
        assertEquals(-1, result);
    }

    @Test
    public void testEmptyChars() throws Exception {
        int result = IndexOfAny.indexOfAny("12345abcdefg", new char[]{});
        assertEquals(-1, result);
    }

    @Test
    public void testFindlast() throws Exception {
        int result = IndexOfAny.indexOfAny("12345abc", new char[]{'c'});
        assertEquals(7, result);
    }

    @Test
    public void testManyCharsInStr() throws Exception {
        int result = IndexOfAny.indexOfAny("1a2a3a4", new char[]{'a'});
        assertEquals(1, result);
    }

    @Test
    public void testWithLastFindChar() throws Exception {
        int result = IndexOfAny.indexOfAny("12345abc", new char[]{'x', 'c'});
        assertEquals(7, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullStr() throws Exception {
        IndexOfAny.indexOfAny(null, new char[]{'x', 'c'});
    }

    @Test(expected = NullPointerException.class)
    public void testNullChars() throws Exception {
        IndexOfAny.indexOfAny("str", null);
    }

    @Test
    public void testNotFoundChars() throws Exception {
        int result = IndexOfAny.indexOfAny("12345abcd", new char[]{'x', 'y'});
        assertEquals(-1, result);
    }
}