package com.company;

import com.utilities.CLI;
import com.utilities.Math;
import com.utilities.UI;

public class Test {

    public static void main(String[] args) {
        System.out.println(Math.max(1));

        CLI.pause();

	    // write your code here
        String[] arr = new String[69];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.toString(i + 1);

        UI.listerator(2, 1, arr);
    }
}
