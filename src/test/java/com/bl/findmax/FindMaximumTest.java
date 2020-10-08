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
    public void givenThreeIntegers_whenMaxAtPositionThree_ReturnPositionThreeInteger() {
        Integer maximumInteger = findMaximumMainObj.findMaximumInteger(1, 2, 3);
        assertEquals((Integer) 3, maximumInteger);
    }
}
