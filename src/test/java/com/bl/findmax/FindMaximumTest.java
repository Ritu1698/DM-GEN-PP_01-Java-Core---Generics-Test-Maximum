package com.bl.findmax;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//Junit Testing For Different TestCases
public class FindMaximumTest {
    FindMaximumMain findMaximumMainObj = null;

    //Initializing the Object
    @Before
    public void initializingObject() {
        findMaximumMainObj = new FindMaximumMain();
    }

    //Testing for Max Position At One Integer
    @Test
    public void givenThreeIntegers_whenMaxIntegerAtPositionOne_returnPositionOneInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumGeneric(3, 2, 1);
        assertEquals((Integer) 3, maximumInteger);
    }

    //Testing for Max Position At Two Integer
    @Test
    public void givenThreeIntegers_whenMaxIntegerAtPositionTwo_returnPositionTwoInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumGeneric(2, 3, 1);
        assertEquals((Integer) 3, maximumInteger);
    }

    //Testing for Max Position At Three Integer
    @Test
    public void givenThreeIntegers_whenMaxIntegerAtPositionThree_ReturnPositionThreeInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumGeneric(1, 2, 3);
        assertEquals((Integer) 3, maximumInteger);
    }

    //Testing for Max Position At One Float
    @Test
    public void givenThreeFloat_whenMaxFloatAtPositionOne_returnPositionOneFloat() {
        Float maximumFloat = findMaximumMainObj.findMaximumGeneric(3.1f, 2.2f, 1.3f);
        assertEquals((Float) 3.1f, maximumFloat);
    }

    //Testing for Max Position At Two Float
    @Test
    public void givenThreeFloat_whenMaxFloatAtPositionTwo_returnPositionTwoFloat() {
        Float maximumFloat = findMaximumMainObj.findMaximumGeneric(2.2f, 3.1f, 1.3f);
        assertEquals((Float) 3.1f, maximumFloat);
    }

    //Testing for Max Position At Three Float
    @Test
    public void givenThreeFloat_whenMaxFloatAtPositionThree_ReturnPositionThreeFloat() {
        Float maximumFloat = findMaximumMainObj.findMaximumGeneric(1.3f, 2.2f, 3.1f);
        assertEquals((Float) 3.1f, maximumFloat);
    }

    //Testing for Max Position At One String
    @Test
    public void givenThreeString_whenMaxStringAtPositionOne_returnPositionOneString() {
        String maximumString = findMaximumMainObj.findMaximumGeneric("Cat", "Ball", "Apple");
        assertEquals("Cat", maximumString);
    }

    //Testing for Max Position At Two String
    @Test
    public void givenThreeString_whenMaxStringAtPositionTwo_returnPositionTwoString() {
        String maximumString = findMaximumMainObj.findMaximumGeneric("Ball", "Cat", "Apple");
        assertEquals("Cat", maximumString);
    }

    //Testing for Max Position At Three String
    @Test
    public void givenThreeString_whenMaxStringAtPositionThree_ReturnPositionThreeString() {
        String maximumString = findMaximumMainObj.findMaximumGeneric("Ball", "Apple", "Cat");
        assertEquals("Cat", maximumString);
    }
}
