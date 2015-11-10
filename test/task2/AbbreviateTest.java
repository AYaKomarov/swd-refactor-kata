package task2;

import org.junit.Test;
import task1.IndexOfAny;

import static org.junit.Assert.assertEquals;

public class AbbreviateTest {
  //Your tests go here
    @Test
    public void test1() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 0, 9);
        assertEquals("London...", result);
    }

    @Test
    public void test2() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 7, 1000000);
        assertEquals("London is a capital of Great Britain", result);
    }

    @Test
    public void test3() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 7, 8);
        assertEquals("...is...", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 10, 6);
        assertEquals("...is...", result);
    }

    @Test
    public void test5() throws Exception {
        String result = Abbreviate.abbreviate("London is a capital of Great Britain", 7, 8);
        assertEquals("...is...", result);
    }

    @Test
    public void test6() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 9, 7);
        assertEquals("...6789", result);
    }

    @Test
    public void test7() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 6, 7);
        assertEquals("...6789", result);
    }

    @Test
    public void test8() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 5, 7);
        assertEquals("...5...", result);
    }

    @Test
    public void test9() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 5, 8);
        assertEquals("...56789", result);
    }

    @Test
    public void test10() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 5, 9);
        assertEquals("012345...", result);
    }

    @Test
    public void test11() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 100, 7);
        assertEquals("...6789", result);
    }

    @Test
    public void test12() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 100, 8);
        assertEquals("...56789", result);
    }

    @Test
    public void test13() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 2, 8);
        assertEquals("01234...", result);
    }

    @Test
    public void test14() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", 3, 8);
        assertEquals("01234...", result);
    }

    @Test
    public void test15() throws Exception {
        String result = Abbreviate.abbreviate("0123456789", -3, 5);
        assertEquals("01...", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test16() throws Exception {
        Abbreviate.abbreviate("0123456789", 5, -7);
    }
}