package week4;
import javax.swing.JOptionPane;
/**
 * Advanced Exercises - Week 4 - No.5 - SimpleInput
 * 210CT - Programming, Algorithms and Data Structures
 * 2019-20 Year 1
 * 
 * @Name       : Hsu Wan Chi
 * @Class      : BSc(Hons) Computer
 * @Student ID : 197101307
 * @Date       : 24-Oct-2019
 * 
 * DECLARATION
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement 
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. 
 * I hereby declare that the work submitted for the “210CT - Programming, Algorithms and Data Structures” is 
 * authentic record of my own work.
 */

public abstract class SimpleInput {

    public static int getInteger(String prompt) {
        do {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
            }
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid integer!");
            }
        } while (true);
    }

    public static float getFloat(String prompt) {
        do {
            try {
                return Float.parseFloat(JOptionPane.showInputDialog(null, prompt));
            }
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid number!");
            }
        } while (true);
    }

    public static String getString(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }

    public static char getChar(String prompt) {
        String s;
        do {
            s = JOptionPane.showInputDialog(null, prompt);
            if (s.length() == 1)
                return s.charAt(0);
        } while (true);
    }

} // class SimpleInput