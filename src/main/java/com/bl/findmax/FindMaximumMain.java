package com.bl.findmax;

import java.util.Arrays;

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
    public static <E extends Comparable<E>> E findMaximumGeneric(E firstGeneric, E secondGeneric, E thirdGeneric) {
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

    // Find Maximum for more than 3 Objects
    public static <E extends Comparable<E>> E findMaximumGeneric(E... genericArray) {
        Arrays.sort(genericArray);
        printMaximumValue(genericArray);
        return genericArray[genericArray.length - 1];
    }

    // Print function for more than 3 objects
    public static <E> void printMaximumValue(E... genericArray) {
        System.out.println("Given Array:- ");
        for (E iterator : genericArray)
            System.out.print(iterator + " ");
        System.out.println("\nMaximum element is:- " + genericArray[genericArray.length - 1]);
    }
}
