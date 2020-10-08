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

    //Function to Find The Maximum Double
    public Double findMaximumDouble(Double firstDouble, Double secondDouble, Double thirdDouble) {
        Double maxDouble = firstDouble;
        if (secondDouble.compareTo(maxDouble) > 0)
            maxDouble = secondDouble;
        if (thirdDouble.compareTo(maxDouble) > 0)
            maxDouble = thirdDouble;
        return maxDouble;
    }
}
