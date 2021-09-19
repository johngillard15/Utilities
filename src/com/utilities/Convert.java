package com.utilities;

import java.util.*;
import java.util.stream.Collectors;

public class Convert {
    private static final TreeMap<Integer, String> numeralValues = new TreeMap<>();

    private static void romanNumeralInit(){
        numeralValues.put(1, "I");
        numeralValues.put(4, "IV");
        numeralValues.put(5, "V");
        numeralValues.put(9, "IX");
        numeralValues.put(10, "X");
        numeralValues.put(40, "XL");
        numeralValues.put(50, "L");
        numeralValues.put(90, "XC");
        numeralValues.put(100, "C");
        numeralValues.put(400, "CD");
        numeralValues.put(500, "D");
        numeralValues.put(900, "CM");
        numeralValues.put(1000, "M");
    }

    public static String toRomanNumeral(int num){
        romanNumeralInit();
        // TODO: handle each place separately then concatenate
        return toRoman(num);
    }

    private static String toRoman(int num){
        int highKey = numeralValues.floorKey(num);
        if(num == highKey)
            return numeralValues.get(num);
        return numeralValues.get(highKey) + toRoman(num - highKey);
    }

    public static int[] toArray(int... ints){
        return ints;
    }

    public static String[] toArray(String... strings){
        return strings;
    }

    public static String[] toArray(String[]... stringArrs){
        List<String> newStrings = new ArrayList<>();

        for(String[] arr : stringArrs)
            newStrings.addAll(Arrays.asList(arr));

        return newStrings.toArray(String[]::new); // new String[0]
    }

    public static List<Integer> toList(int... ints){
        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    public static List<String> toList(String... strings){
        return Arrays.asList(strings);
    }
}
