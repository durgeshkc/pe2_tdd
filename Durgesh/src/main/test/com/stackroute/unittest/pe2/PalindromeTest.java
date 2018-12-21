package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    Palindrome obj;

    @Test
    public void getReverse() {
        assertEquals(321,obj.getReverse(123));
    }
    @Test
    public void getReverse() {
        assertEquals("nasan",obj.getReverse("nasan"));
    }


    @Test
    public void checkPalindrome() {
        assertEquals(true,obj.checkPalindrome(121,121));
    }

    @Test
    public void checkPalindrome2() {
        assertEquals("Not a Palindrome",false,obj.checkPalindrome(12,121));
    }

    @Test
    public void checkPalindrome3() {
        assertEquals(" Palindrome",true,obj.checkPalindrome("",""));
    }

}
