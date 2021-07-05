// Import this to use JOptionPane.
import javax.swing.*;

public class NumberConversor {
    public static void main(String[] args) {
        convertNumber();
        showMessage();
    }

    // Show a window where to insert number (which by default, it will be a String) and parse it to Integer to be used.
    public static String numberStr = JOptionPane.showInputDialog(null, "Insert a number" );
    public static int decimalNumber = Integer.parseInt(numberStr);
    public static String message;

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