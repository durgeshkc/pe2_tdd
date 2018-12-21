package com.stackroute.unittest.pe2;

import org.junit.Test;

public class EvenNumberTest {

    @Test
    public void checkForEven() {
        assertTrue("Not Divisible by 2,so not an even number",obj.isEven(23));
    }

    @Test
    public void checkForEven2() {
        assertTrue("Divisible by 2,soit is an even number",obj.isEven(66));
    }

    @Test
    public void checkForEven3() {
        assertTrue("Divisible by 2,so  even number",obj.isEven(0));
    }

    @Test
    public void checkForEven3() {
        assertTrue("Not Divisible by 2,so not an even number",obj.isEven('a'));
    }

    @Test
    public void eventest2(){
        assertEquals(true,num1.isEven(-2));
    }

}
