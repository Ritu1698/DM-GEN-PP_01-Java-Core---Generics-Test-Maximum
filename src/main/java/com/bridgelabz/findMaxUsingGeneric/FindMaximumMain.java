package com.bridgelabz.findMaxUsingGeneric;

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
    public static <E extends Comparable<E>> E findMaximumGeneric(E firstGeneric, E secondGeneric, E thirdGeneric, E... genericArray) {
        E maxGeneric = firstGeneric;
        if (secondGeneric.compareTo(maxGeneric) > 0) {
            maxGeneric = secondGeneric;
        }
        if (thirdGeneric.compareTo(maxGeneric) > 0) {
            maxGeneric = thirdGeneric;
        }
        if (genericArray.length > 0)
            maxGeneric = findMaxGenericArray(maxGeneric, genericArray);
        printMaximumValue(firstGeneric, secondGeneric, thirdGeneric, maxGeneric, genericArray);
        return maxGeneric;
    }

    //Function to Find The Maximum For More Than 3 Elements
    private static <E extends Comparable<E>> E findMaxGenericArray(E maxGeneric, E[] genericArray) {
        for (E genericElement : genericArray) {
            if (genericElement.compareTo(maxGeneric) > 0)
                maxGeneric = genericElement;
        }
        return maxGeneric;
    }

    // Print function
    public static <E> void printMaximumValue(E firstGeneric, E secondGeneric, E thirdGeneric, E maxGeneric, E... genericArray) {
        System.out.println("Given Array:- ");
        System.out.println(firstGeneric + "\n" + secondGeneric + "\n" + thirdGeneric);
        if (genericArray.length > 0) {
            for (E iterator : genericArray)
                System.out.print(iterator + "\n");
        }
        System.out.println("\nMaximum element is:- " + maxGeneric);
    }
}
