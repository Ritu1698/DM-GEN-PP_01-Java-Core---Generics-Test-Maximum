package com.bl.findmax;

public class FindMaximumMain {
    //Function to Find The Maximum Integer
    public Integer findMaximumInteger(Integer firstInteger, Integer secondInteger, Integer thirdInteger) {
        Integer maxInteger = firstInteger;
        if (secondInteger.compareTo(maxInteger) > 0)
            maxInteger = secondInteger;
        if (thirdInteger.compareTo(maxInteger) > 0)
            maxInteger = thirdInteger;
        return maxInteger;
    }
}
