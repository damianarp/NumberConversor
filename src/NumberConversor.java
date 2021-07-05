// Import this to use JOptionPane.
import javax.swing.*;

public class NumberConversor {
    public static int decimalNumber;
    public static String message;

    // Main method
    public static void main(String[] args) {

        // Show a window where to insert number (which by default, it will be a String) and parse it to Integer to be used.
        String numberStr = JOptionPane.showInputDialog(null, "Insert a number" );

        // Use try-catch to manage the exception.
        try {
            decimalNumber = Integer.parseInt(numberStr); // In case the input be a number, the app to be continued.
        }catch(NumberFormatException e){
            // In case the input not be a number, show a message and restart a main method.
            JOptionPane.showMessageDialog(null, "Error! Please, insert a number" );
            main(args);
            System.exit(0);
        }

        convertNumber();
        showMessage();
    }

    // Message's body and conversions.
    public static void convertNumber(){
        message = "Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        message += "\nOctal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        message += "\nHexadecimal number " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
    }

    // Show message with the conversions done.
    public static void showMessage(){
        JOptionPane.showMessageDialog(null, message);
    }
}