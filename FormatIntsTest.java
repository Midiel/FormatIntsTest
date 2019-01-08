/* Midiel Rodriguez
 * Course: COP337 - Spring 2018
 * Assignemnt: Assignment 4
 * 
 * The purpose of this program is to format numbers.
 *
 * This programs creates an array of 6 integers. Then formats the all
 * the numbers in: decimal, accounting and base format.
 * It then prints all the formated numbers in a table.
 *
 * Disclaimer:
 * I hereby certify that this code is my work and my work alone and understand
 * the syllabus regarding plagiarized code.
 * Copyright 2018 Midiel
 */
package formatintstest;

/**
 * This program formats 6 numbers to decimal, accounting and base format.
 *
 * @author Midiel Rodriguez
 * @version 1.0 February 22, 2018
 */
public class FormatIntsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        final int BASE = 20;          // Constant that represents the base.
        
        // Array of 6 integers to be formatted.
        int numbers[]= {8, 100, -10, 45, 0, 1000000};
        
        // Create instances of the 4 formatters.
        DefaultFormatter defaultFmt = new DefaultFormatter();
        DecimalSeparatorFormatter decimalFmt = new DecimalSeparatorFormatter();
        AccountingFormatter accountingFmt = new AccountingFormatter();
        BaseFormatter baseFmt = new BaseFormatter(BASE);   // Pass BASE to const

        // Display a header for the table.
        System.out.printf("%15s", "Default");
        System.out.printf("%15s", "Decimal");
        System.out.printf("%15s", "Accounting");
        System.out.printf("%15s", "Base(" + BASE + ")");
        System.out.println();
        System.out.printf("%15s", "===========");
        System.out.printf("%15s", "===========");
        System.out.printf("%15s", "===========");
        System.out.printf("%15s", "===========");
        System.out.println();
        
        /*
         * Loop that sends all the numbers to displayNumbers method to be 
         * formated and displayed.
         */
        for(int value : numbers) {
           displayNumbers(value, defaultFmt);
           displayNumbers(value, decimalFmt);
           displayNumbers(value, accountingFmt);
           displayNumbers(value, baseFmt);
           System.out.println();
        }
    }
    
    /**
     * This method takes an integer and a NumberFormatter object as argument
     * and prints each number formated in a separate line right aligned.
     * 
     * @param number integer that represents the number to be formated
     * @param formatter a NumberFormatter object to format the numbers
     */
    private static void displayNumbers(int number, NumberFormatter formatter) {
        // Sends the numbers to be formatted.
        String display = String.format("%15s", formatter.format(number));
        // Displays/prints the formatted numbers.
        System.out.print(display);
    }    
}
