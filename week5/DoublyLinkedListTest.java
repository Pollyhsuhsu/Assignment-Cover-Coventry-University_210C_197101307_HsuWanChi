package week5;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * Advanced Exercises - Week 5 - DoublyList
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
public class DoublyLinkedListTest
{
    public static void main(String [] args) {
        DoublyList d = new DoublyList();
        ArrayList<String> words = new ArrayList<String>();
        String text = readFile("/Users/pollyhsu/Desktop/A-paragraph.txt");
        words = getWords(words, text);
        Collections.sort(words);
        for (String word : words) {
            d.insertAtRightSpot(word);
        }   
        d.print();
        System.out.println("\n\n"+d);
    }

    public static String readFile(String fileName){
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        String contents = sb.toString();
        return contents;
    }

    public static ArrayList<String> getWords(ArrayList<String> words, String text) {

        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }

        return words;
    }
}

