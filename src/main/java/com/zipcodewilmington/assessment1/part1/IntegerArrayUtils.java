package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer result = 0;

        for (int i = 0; i <=intArray.length-1 ; i++) {
            result += intArray[i];

        }
        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        Integer result = 1;

        for (int i = 0; i <=intArray.length-1 ; i++) {
            result *= intArray[i];

        }
        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double result = 0.0;

        for (int i = 0; i <= intArray.length - 1; i++) {
            result += intArray[i];
        }

        return (result / intArray.length);
    }
}
