package com.stackroute.unittest.pe2;

import org.junit.Test;

public class PowerOf4Test {

    PowerOf4 obj;
    @Test
    public void checkDivisibility() {
        assertTrue("Not Divisible by 4,so not power of 4",obj.checkDivisibility(285));
    }

    @Test
    public void checkDivisibility2() {
        assertTrue("Divisible by 4,so may be power of 4",obj.checkDivisibility(286));
    }

    @Test
    public void checkPowerOf4OrNot() {
        assertTrue("Not power of 4",obj.checkDivisibility(285));
    }
    @Test
    public void checkPowerOf4OrNot() {
        assertTrue("Power of 4",obj.checkDivisibility(286));
    }
}
