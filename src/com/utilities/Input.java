package com.utilities;

import java.util.Scanner;

public class Input {
    private static final Scanner scan = new Scanner(System.in);

    public static String getString(){
        return scan.nextLine();
    }

    public static int getInt(){
        return getInt(Integer.MAX_VALUE);
    }
    public static int getInt(int max){
        String input;

        boolean validChoice;
        do{
            input = scan.nextLine();

            validChoice = InputValidator.validateInt(input) && Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= max;
        }while(!validChoice);

        return Integer.parseInt(input);
    }

    public static double getDouble(){
        return getDouble(Double.MAX_VALUE);
    }
    public static Double getDouble(double max){
        String input;

        boolean validChoice;
        do{
            input = scan.nextLine();

            validChoice = InputValidator.validateDouble(input) && Double.parseDouble(input) >= 1 && Double.parseDouble(input) <= max;
        }while(!validChoice);

        return Double.parseDouble(input);
    }
}
