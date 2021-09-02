package com.company;

import com.utilities.UI;

public class Test {

    public static void main(String[] args) {
	    // write your code here
        String[] arr = new String[69];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.toString(i + 1);

        UI.listerator(2, 1, arr);
    }
}
