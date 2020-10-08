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
    public void givenThreeDouble_whenMaxDoubleAtPositionOne_returnPositionOneDouble() {
        Double maximumDouble = findMaximumMainObj.findMaximumDouble(3.1, 2.2, 1.3);
        assertEquals((Double) 3.1, maximumDouble);
    }

    //Testing for Max Position At Two
    @Test
    public void givenThreeDouble_whenMaxDoubleAtPositionTwo_returnPositionTwoDouble() {
        Double maximumDouble = findMaximumMainObj.findMaximumDouble(2.2, 3.1, 1.3);
        assertEquals((Double) 3.1, maximumDouble);
    }

    //Testing for Max Position At Three
    @Test
    public void givenThreeDouble_whenMaxDoubleAtPositionThree_ReturnPositionThreeDouble() {
        Double maximumDouble = findMaximumMainObj.findMaximumDouble(1.3, 2.2, 3.1);
        assertEquals((Double) 3.1, maximumDouble);
    }
}
