/*
 * Midiel Rodriguez
 */
package formatintstest;

/**
 * This class formats the number as base n, where n is
 * any number between 2 and 36 that is provided in the constructor.
 * It implements the NumberFormatter interface.
 *
 * @author Midiel Rodriguez
 * @version 1.0 February 22, 2018
 */
public class BaseFormatter implements NumberFormatter {
    
    // To hold the passed base.
    int base = 0;
    
    /**
     * The constructor accepts as argument the base.
     * 
     * @param base the base that will be used to format the number
     */
    public BaseFormatter (int base) {
        this.base = base;   
    }
    
    /**
     * This method formats a number as the base passed to the constructor.
     * 
     * @param n an integer containing the number to be formatted
     * @return a string with the formated number
     */
    @Override
    public String format(int n) {
        // Passes the number to be formated and the base.
        return Integer.toString(n, base);
    }
    
    /**
     * Getter to return the base.
     * 
     * @return an integer that represents the base
     */
    public int getBase() {
        return base;
    }  
}
