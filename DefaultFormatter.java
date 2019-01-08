/*
 * Midiel Rodriguez
 */
package formatintstest;

/**
 * This class formats an integer in the usual way.
 * It implements the NumberFormatter interface.
 *
 * @author Midiel Rodriguez
 * @version 1.0 February 22, 2018
 */
public class DefaultFormatter implements NumberFormatter {
        
    /**
     * This method accepts an integer as parameter that represents
     * the integer and formats it the usual way. It returns a string
     * of the formated string.
     *
     * @param n an integer to format
     * @return a string contained the formated integer
     */
    @Override
    public String format (int n) {
         return String.valueOf(n);
    }   
}
