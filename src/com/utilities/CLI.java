package com.utilities;

import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * <p>Provides tools that help to improve the output of a terminal based program.</p>
 *
 * @since 1/8/2021
 * @author John Gillard
 * @version 1/8/2021
 */

public class CLI {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * <p>Simply prints 40 blank lines to mimic a clear screen function.</p>
     */
    public static void cls(){
        int newLines = 40;
        System.out.print("\n".repeat(newLines));
    }

    /**
     * <p>Uses Scanner to wait for user input to continue program execution.</p>
     */
    public static void pause(){
        System.out.println("\nPress enter to continue...");
        scan.nextLine();
    }

    // TODO: make a wait method

    /**
     * <p>Waits a defined number of seconds.</p>
     *
     * @param seconds the number of seconds to wait
     */
    public static void delay(int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
