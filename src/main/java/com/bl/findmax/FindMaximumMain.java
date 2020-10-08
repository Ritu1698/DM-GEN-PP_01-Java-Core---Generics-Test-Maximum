package com.bl.findmax;

public class FindMaximumMain {
    //Function to Find The Maximum Generic
    public <E extends Comparable<E>> E findMaximumGeneric(E firstGeneric, E secondGeneric, E thirdGeneric) {
        E maxGeneric = firstGeneric;
        if (secondGeneric.compareTo(maxGeneric) > 0) {
            maxGeneric = secondGeneric;
        }
        if (thirdGeneric.compareTo(maxGeneric) > 0) {
            maxGeneric = thirdGeneric;
        }
        return maxGeneric;
    }
}
