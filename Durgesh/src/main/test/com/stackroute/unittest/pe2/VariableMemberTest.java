package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VariableMemberTest {

    // defining the object of the two classes.........................
     MemberVariable memberVariableObj1;
     Member memberVariableObj2;

     // this will execute before each test.................
    @Before
    public void setUp(){
        memberVariableObj1=new MemberVariable();
        memberVariableObj2=new Member();
    }

    //// this will execute after each test.................
    @After
    public void tearDown() throws Exception {
        Member memberVariableObj2  = null;
        MemberVariable memberVariableObj1  = null;
    }

    @Test
    public void memberTestOne(){
        memberVariableObj2.setName("Chris Hemsworth");
        memberVariableObj2.setAge(29);
        memberVariableObj2.setSalary(20000000.00);
        assertEquals(memberVariableObj2.toString(),memberVariableObj1.displayMembers().toString());
    }

    @Test
    public void memberTestTwo(){
        memberVariableObj2.setName("Kaley cuoco");
        memberVariableObj2.setAge(26);
        memberVariableObj2.setSalary(5000000.00);
        assertEquals(memberVariableObj2.toString(),memberVariableObj1.displayMembers().toString());
    }

    @Test
    public void memberTestTwo(){
        memberVariableObj2.setName("Jim Parsons");
        memberVariableObj2.setAge(28);
        memberVariableObj2.setSalary(5000000.00);
        assertEquals(memberVariableObj2.toString(),memberVariableObj1.displayMembers().toString());
    }
}
