/*
 * WordPyramid.java
 * ICS4U
 */
package wordpyramid;

// Being used to get user input without a Scanner
import javax.swing.*;

/**
 *
 * @author cogid4775
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Show an input dialog asking the user to enter a word
        // Make the word lowercase for letter consistency, although not required
        String word = JOptionPane.showInputDialog("Enter a word.").toLowerCase();
        
        // Print the word the user entered
        System.out.println(word);
        
        // call printWordPyramid() to print the rest of the word pyramid
        printWordPyramid(word);
    }
    
    /**
     * Prints the rest of a word pyramid for a given word
     * Takes off the first and last letter and prints the result
     * Repeat with the result
     * Go until there is only 1 or 2 letters left, in which case it cannot be reduced anymore.
     * @param word the word that will be used to print the rest of its word pyramid
     */
    public static void printWordPyramid(String word) {
        // If the word is 2 or less, then it cannot be reduced any more
        if (word.length() > 2) {
            // Trim off the first and last letters
            // By replacing String word with only its middle letters
            word = word.substring(1,word.length()-1);
            // Print the resulting word
            System.out.println(word);
            // Call the method again to repeat
            printWordPyramid(word);
        }
    }
    
}
