package week6;
import java.util.Scanner;

/**
 * Advanced Exercises - Week 6 No.9
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
public class FibonacciSeriesRecursion
{
    public static void main(String[] args){
        System.out.println("First 10 Fibonacci numbers are :");
        for(int num = 1; num<= 10; num++){
            System.out.println("Fibonacci(" +num + ") = " + fib(num));
        }
        System.out.println("*********************************************\n");
        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){
            System.out.print(fib(i) +" ");
        }
    }
    
    /*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */
    public static int fib(int num){
        if(num == 1 || num ==2){ //base case 
            return 1;
        } else{
            return fib(num-1) + fib(num-2);////tail recursion
        }
    }

}
