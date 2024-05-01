package Case3;
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        int fac = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Argument cannot be negative");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Argument is too large, it may cause arithmetic overflow");
        }
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}