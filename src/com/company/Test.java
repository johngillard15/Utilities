package com.company;

import com.utilities.*;
import com.utilities.Math;

import java.util.Arrays;

public class Test {

    public static void testMath(){
        System.out.println(Math.max(1));
    }

    public static void testUI(){
        String[] arr = new String[69];
        for(int i = 0; i < arr.length; i++)
            arr[i] = "Element " + (i + 1);

        UI.listerator(3, 1, arr);
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
        System.out.println(Input.getBoolean("y", "n"));
    }

    public static void testCLI(){
        System.out.println("Starting...");
        CLI.delay(3);
        System.out.println("Done.");
    }

    public static void testAnsi(){
        System.out.printf("%s, World!", ANSI.format("Hello","LOW_INTESITY"));
    }

    public static void main(String[] args) {
	    // write your code here
        testAnsi();
    }
}
