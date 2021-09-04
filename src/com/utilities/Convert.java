package com.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert {

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

        return newStrings.toArray(new String[0]);
    }

    public static List<Integer> toList(int... ints){
        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    public static List<String> toList(String... strings){
        return Arrays.asList(strings);
    }
}
