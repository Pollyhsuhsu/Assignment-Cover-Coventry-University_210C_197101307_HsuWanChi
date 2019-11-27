
package week6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 * Advanced Exercises - Week 6 No.8
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
public class Test
{   public static Scanner s = new Scanner(System.in);

    public static void main(String args[]) 
    { 
        binarySearchRecursive ob = new binarySearchRecursive(); 
        int[] arr = new int[5];
        //int[] x = {10,11,12,18,20,21};
        int n = arr.length;
        String Question = "Generating 5 integer number...";
        arr = genNumber(Question,arr);
        String Question1 = "Enter the number you want to search...";
        int num = checkNumber(Question1);
        //int n = arr.length - 1; 
        int result = ob.binarySearch(arr, 0, n - 1, num); ; 
        if (result != -1) {
            System.out.println("looking " + num + " in array..." + Arrays.toString(arr)); 
            System.out.println("Element found at index " + result); 

        }else{
            System.out.println("Sorry, number "+ num +" not found in array"); 
        }
    } 

    public static int[] genNumber(String Question, int[] arr){
        Random rand = new Random();
        int number = 0;
        int index = 0;
        System.out.println(Question);
        while(index < arr.length){
            number = (int)(Math.random()*100 + 1);
            System.out.println("#Number" + index +": " + number);
            arr[index] = number;  
            index++;
        }      
        return arr;
    }

    public static int checkNumber(String Question){
        int number = 0;
        System.out.println(Question);
        boolean flag = false;
        while(!flag){
            try{
                number = Integer.parseInt(s.nextLine());
                if (number < 1)
                    throw new ArithmeticException("Must be an integer of one or more.");
                else{
                    flag = true;
                }    
            }catch(NumberFormatException e){
                System.err.println("Wrong input! Input only integer numbers please: " + e.getMessage());
            }catch(ArithmeticException ex){
                System.err.println(ex.getMessage());
            }
        }
        return number;
    }
}
