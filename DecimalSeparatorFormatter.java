/*
 * Midiel Rodriguez
 */
package formatintstest;

import java.text.DecimalFormat;         // Needed to format an integer.

/**
 * This class formats an integer with decimal separators.
 * It implements the NumberFormatter interface.
 *
 * @author Midiel Rodriguez
 * @version 1.0 February 22, 2018
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
    
    /**
     * This method accepts an integer as argument. Then formats the
     * integer to a string with decimal separators.
     * 
     * @param n an integer to be formated
     * @return a string with the formated number
     */
    @Override
    public String format (int n) {
        DecimalFormat formatter = new DecimalFormat("#,##0");
        return formatter.format(n);    
    }        
}
