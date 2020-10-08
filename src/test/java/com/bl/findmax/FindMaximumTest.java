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

    //Testing for Max Position At One
    @Test
    public void givenThreeIntegers_whenMaxIntegerAtPositionOne_returnPositionOneInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumInteger(3, 2, 1);
        assertEquals((Integer) 3, maximumInteger);
    }

    //Testing for Max Position At Two
    @Test
    public void givenThreeIntegers_whenMaxIntegerAtPositionTwo_returnPositionTwoInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumInteger(2, 3, 1);
        assertEquals((Integer) 3, maximumInteger);
    }

    //Testing for Max Position At Three
    @Test
    public void givenThreeIntegers_whenMaxIntegerAtPositionThree_ReturnPositionThreeInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumInteger(1, 2, 3);
        assertEquals((Integer) 3, maximumInteger);
    }

    //Testing for Max Position At One
    @Test
    public void givenThreeFloat_whenMaxFloatAtPositionOne_returnPositionOneFloat() {
        Float maximumFloat = findMaximumMainObj.findMaximumFloat(3.1f, 2.2f, 1.3f);
        assertEquals((Float) 3.1f, maximumFloat);
    }

    //Testing for Max Position At Two
    @Test
    public void givenThreeFloat_whenMaxFloatAtPositionTwo_returnPositionTwoFloat() {
        Float maximumFloat = findMaximumMainObj.findMaximumFloat(2.2f, 3.1f, 1.3f);
        assertEquals((Float) 3.1f, maximumFloat);
    }

    //Testing for Max Position At Three
    @Test
    public void givenThreeFloat_whenMaxFloatAtPositionThree_ReturnPositionThreeFloat() {
        Float maximumFloat = findMaximumMainObj.findMaximumFloat(1.3f, 2.2f, 3.1f);
        assertEquals((Float) 3.1f, maximumFloat);
    }
}
