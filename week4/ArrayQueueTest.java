package week4;
import java.util.*;
/**
 * Advanced Exercises - Week 4 - No.5 - ArrayQueueTest
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
public class ArrayQueueTest
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ArrayQueue q = null;
        int choice = 0;
        char ch = ' ';
        System.out.println("\nInterview waiting list Operations(FIFO)\n");
        String qSize = "Enter the size of the waiting list(Press enter to use default size):";
        q = checkSize(qSize,q);
        do{
            System.out.println("\n1. Insert the name of waiting");
            System.out.println("2. Remove the fist in the waiting list");
            System.out.println("3. Check the waiting is full");
            System.out.println("4. Check how many people is waiting");
            System.out.println("5. Check the array queue is Empty");
            System.out.println("6. Get the full waiting list");   
            choice = sc.nextInt();  
            System.out.println();
            switch (choice)
            {
                case 1 : 
                System.out.print("Enter name: ");
                String name = sc.next();
                q.enQueue(name);                    
                break;                          
                case 2 : 
                System.out.println("----The Front person is " + "\""+ q.front() +"\"" + "----");
                while(!q.isEmpty()){
                    System.out.println("Removing:" + "\""+ q.front() + "\"");
                    q.deQueue();
                    break; 
                } 
                break;                         
                case 3 : 
                System.out.println("Full status = "+q.isFull()); 
                break;                                          
                case 4 : 
                System.out.print(q.size()+" people(s)");
                break;
                case 5 : 
                System.out.println("Empty status = "+q.isEmpty()); 
                break;                   
                case 6 : 
                break;                         
                default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            System.out.println(q);
            
            System.out.print("\nDo you want to continue (Type y or n)");
            ch = sc.next().charAt(0); 
        } while (ch == 'Y'|| ch == 'y'); 
    }

    public static ArrayQueue checkSize(String Question,ArrayQueue q){
        System.out.print(Question);
        String size = sc.nextLine();
        if(!size.isEmpty() && size != null){
            q = new ArrayQueue(Integer.parseInt(size));
        }else{
            q = new ArrayQueue();
        }
        return q;
    }
}