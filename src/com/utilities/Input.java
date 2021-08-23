package com.utilities;

import java.util.Scanner;

public class Input {
    private static final Scanner scan = new Scanner(System.in);

    public static String getString(){
        System.out.print("-> ");
        return scan.nextLine();
    }

    public static int getInt(){
        return getInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static int getInt(final int MIN){
        return getInt(MIN, Integer.MAX_VALUE);
    }
    public static int getInt(final double MIN, final double MAX){
        String input;

        boolean validChoice;
        do{
            System.out.print("-> ");
            input = scan.nextLine();

            validChoice =
                    InputValidator.validInt(input) && (Integer.parseInt(input) >= MIN && Integer.parseInt(input) <= MAX);
        }while(!validChoice);

        return Integer.parseInt(input);
    }

    public static double getDouble(){
        return getDouble(Double.MIN_VALUE, Double.MAX_VALUE);
    }
    public static double getDouble(final double MIN){
        return getDouble(MIN, Double.MAX_VALUE);
    }
    public static Double getDouble(final double MIN, final double MAX){
        String input;

        boolean validChoice;
        do{
            System.out.print("-> ");
            input = scan.nextLine();

            validChoice =
                    InputValidator.validDouble(input) && (Double.parseDouble(input) >= MIN && Double.parseDouble(input) <= MAX);
        }while(!validChoice);

        return Double.parseDouble(input);
    }
}
