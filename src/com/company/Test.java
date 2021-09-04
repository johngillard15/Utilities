package com.company;

import com.utilities.Input;
import com.utilities.Math;
import com.utilities.Convert;
import com.utilities.UI;

import java.util.Arrays;

public class Test {

    public static void testMath(){
        System.out.println(Math.max(1));
    }

    public static void testUI(){
        String[] arr = new String[69];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.toString(i + 1);

        UI.listerator(2, 1, arr);
    }

    public static void testConvert(){
        String[] truthyValues = new String[]{
                "true", "1", "y", "yes"
        };
        String[] falsyValues = new String[]{
                "false", "0", "n", "no"
        };

        String[] arr = Convert.toArray(truthyValues, falsyValues);

        System.out.println(Arrays.toString(arr) + "\tlength " + arr.length);
    }

    public static void testInput(){
        System.out.println("getBoolean");
//        System.out.println(Input.getBoolean(Convert.toArray("y"), Convert.toArray("n")));
        System.out.println(Input.getBoolean("y", "n"));
    }

    public static void main(String[] args) {
	    // write your code here
        testInput();
    }
}
