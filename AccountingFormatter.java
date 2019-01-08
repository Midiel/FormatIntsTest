/*
 * Midiel Rodriguez
 */
package formatintstest;

import java.text.DecimalFormat;         // Needed to format an integer.

/**
 * This class formats negative numbers with parenthesis.
 * It implements the NumberFormatter interface.
 *
 * @author Midiel Rodriguez
 * @version 1.0 February 22, 2018
 */
public class AccountingFormatter implements NumberFormatter {
    
    // To format negative numbers using parenthesis.
    DecimalFormat formatter = new DecimalFormat("#;(#)");
    
    /**
     * This method accepts an integer as argument. Then formats the
     * negative numbers with parenthesis.
     * 
     * @param n an integer to be formated
     * @return a string with the formated number
     */
    @Override
    public String format (int n) {
        return formatter.format(n);
    }    
}
