package halfAdder;

/**
 * This exception is generated when user enters a number other than binary digits {0, 1};
 */
public class NotBinaryDigitException extends Exception {
    NotBinaryDigitException(){
        System.err.println("GIVE ONLY BINARY DIGITS {0, 1}");
    }
}
