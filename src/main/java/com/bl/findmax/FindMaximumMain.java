package com.bl.findmax;

public class FindMaximumMain<E extends Comparable<E>> {
    E firstGenericObject;
    E secondGenericObject;
    E thirdGenericObject;
    public FindMaximumMain(E firstGenericObject, E secondGenericObject, E thirdGenericObject) {
        this.firstGenericObject = firstGenericObject;
        this.secondGenericObject = secondGenericObject;
        this.thirdGenericObject = thirdGenericObject;
    }
    public FindMaximumMain() {
    }

    //Function to Find The Maximum Generic
    public  static <E extends Comparable<E>> E findMaximumGeneric(E firstGeneric, E secondGeneric, E thirdGeneric) {
        E maxGeneric = firstGeneric;
        if (secondGeneric.compareTo(maxGeneric) > 0) {
            maxGeneric = secondGeneric;
        }
        if (thirdGeneric.compareTo(maxGeneric) > 0) {
            maxGeneric = thirdGeneric;
        }
        return maxGeneric;
    }

    public E findMaximumGeneric() {
        return FindMaximumMain.findMaximumGeneric(firstGenericObject, secondGenericObject, thirdGenericObject);
    }
}
