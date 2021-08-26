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
    public static int getInt(final int MIN, final int MAX){
        String input;

        boolean validChoice;
        do{
            System.out.print("-> ");
            input = scan.nextLine();

            validChoice =
                    InputValidator.validInt(input) && (Integer.parseInt(input) >= MIN && Integer.parseInt(input) <= MAX);

            if(!InputValidator.validInt(input))
                System.out.println("That is not a valid number value. Please try again");
            else if(MIN != Integer.MIN_VALUE && !(Integer.parseInt(input) >= MIN))
                System.out.println("Value must be greater than or equal to " + MIN);
            else if(MAX != Integer.MAX_VALUE && !(Integer.parseInt(input) <= MAX))
                System.out.println("Value must be less than or equal to " + MAX);
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

            if(!InputValidator.validDouble(input))
                System.out.println("That is not a valid number value. Please try again");
            else if(MIN != Double.MIN_VALUE && !(Double.parseDouble(input) >= MIN))
                System.out.println("Value must be greater than or equal to " + MIN);
            else if(MAX != Double.MAX_VALUE && !(Double.parseDouble(input) <= MAX))
                System.out.println("Value must be less than or equal to " + MAX);
        }while(!validChoice);

        return Double.parseDouble(input);
    }
}
