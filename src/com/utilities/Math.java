package com.utilities;

public class Math { // TODO: are these more efficient than arr.stream().max/min ?

    public static int max(int... nums) throws IllegalArgumentException {
        if(nums.length <= 1) throw new IllegalArgumentException("Math.max requires at least two arguments." +
                " Argument length: " + nums.length);

        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max)
                max = nums[i];
        }

        return max;
    }

    public static int min(int... nums) throws IllegalArgumentException {
        if(nums.length <= 1) throw new IllegalArgumentException("Math.min requires at least two arguments." +
                " Argument length: " + nums.length);

        int min = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < min)
                min = nums[i];
        }

        return min;
    }
}
