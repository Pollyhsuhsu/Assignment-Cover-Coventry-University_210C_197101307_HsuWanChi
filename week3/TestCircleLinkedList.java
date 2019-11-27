 
package week3;
import java.util.*;
/**
 * Advanced Exercises - Week 3 - TestJava
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
public class TestCircleLinkedList {
    public static void main (String args[]) {
        /* Class CircularLinkedList */
        circularLinkedList s = new circularLinkedList();
        Scanner input = new Scanner(System.in);
        char ch = ' ';
        int choice = 0;
        /*  Perform list operations  */
        do{
            System.out.println("\nCircular Linked List Operations\n");
            System.out.println("1. Insert at begining");
            System.out.println("2. Insert at end");
            System.out.println("3. Remove form the first node");
            System.out.println("4. Remove form the last node");
            System.out.println("5. Check is circular linked list");
            System.out.println("6. Get the Linked List");     
             System.out.print("Enter Choice : ");
            choice = input.nextInt();  
            System.out.println(); 
            switch (choice)
            {
                case 1 : 
                System.out.print("Enter Number or String element to insert at beginning: ");
                s.addToHead( input.next() );                     
                break;                          
                case 2 : 
                System.out.print("Enter Number or String element to insert at end: ");
                s.addToTail( input.next() );                     
                break;                         
                case 3 : 
                System.out.print("Removing...");
                s.removeFromHead();
                break;                                          
                case 4 : 
                System.out.print("Removing...");
                s.removeFromTail();
                break;
                case 5 : 
                System.out.println("Empty status = "+ s.isCircular());
                break;                   
                case 6 : 
                System.out.println(s);
                break;                         
                default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            System.out.println();
            System.out.println(s);
            /*  Display List  */ 
            System.out.print("\nDo you want to continue (Type y or n)");
            ch = input.next().charAt(0); 
        } while (ch == 'Y'|| ch == 'y');    
        System.out.print("---------Circular Linked List Operations OFF-----------");
    }
} // class TestLinkedList