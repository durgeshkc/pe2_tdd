package com.stackroute.unittest.pe2;

import org.junit.Test;

public class GradeStatsTest {

    @Test
    public void grade1(){
        GradeStatistics person1 = new GradeStatistics();

        assertEquals(98,person1.minimum(4,new int[]{86,65,98,77}));
        assertEquals(98,person1.maximum(4,new int[]{86,65,98,77}));
        assertEquals(90,person1.minimum(4,new int[]{90,80,10,18}));
        assertEquals(200,person1.maximum(4,new int[]{0,90,100,200}));
    }

    @Test
    public void grade2(){
        GradeStatistics person2 = new GradeStatistics();

        assertEquals(56,person2.minimum(4,new int[]{56,75,78,77}));
        assertEquals(78,person2.maximum(4,new int[]{56,75,78,77}));
    }
}
