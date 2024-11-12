package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String string : array) {
            if (string == value) {
                return true;
            }
        }
            return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i]; // Fill the new array
        } return reversed;
    }
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = StringArrayUtils.reverse(array);
        int compare = Arrays.compare(array, reversed);
        if (compare == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Set<Character> charSet = new HashSet<>();
        for (String string : array) {
            for (char c : string.toLowerCase().toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    charSet.add(c);
                }
            }
        } return charSet.size() == 26;
    }


        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int valueCount = 0;
        for (String string : array) {
            if (string == value) {
                valueCount += 1;
            }
        } return valueCount;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newGuy = new ArrayList<>();
        for (String string : array) {
            if (string != valueToRemove) {
                newGuy.add(string);
            }
        }
        return newGuy.toArray(new String[0]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 0;
        String[] noDupes = new String[array.length-counter];
        for (int i = 0; i<array.length-1; i++){
            if (array[i] == array[i+1]){
                counter+=1;
            }
        }

//        ArrayList<String> noDupes = new ArrayList<>();
//        for (int i=0; i<array.length-1; i++) {
//            if (!Objects.equals(array[i], array[i + 1])) {
//                noDupes.add(array[i]);
//            } else {noDupes.add(array[i]);}
//        } return noDupes.toArray(new String[0]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
