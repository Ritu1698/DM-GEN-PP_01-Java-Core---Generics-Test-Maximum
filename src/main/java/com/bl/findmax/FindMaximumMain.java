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

    //Function to Find The Maximum Float
    public Float findMaximumFloat(Float firstFloat, Float secondFloat, Float thirdFloat) {
        Float maxFloat = firstFloat;
        if (secondFloat.compareTo(maxFloat) > 0)
            maxFloat = secondFloat;
        if (thirdFloat.compareTo(maxFloat) > 0)
            maxFloat = thirdFloat;
        return maxFloat;
    }
}
