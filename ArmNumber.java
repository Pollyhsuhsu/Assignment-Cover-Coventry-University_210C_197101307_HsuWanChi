
/**
 * week 1
 * 
 * Programming, Algorithms and Data Structures
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
 * I hereby declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is 
 * authentic record of my own work.
 */
import java.util.Scanner; 

public class ArmNumber
{
    // Function to calculate x reised to the power y
    int power(int x, long y){
        if(y == 0)
            return 1;
        if(y%2 ==0)
            return power(x, y/2)*power(x,y/2);
            
        return x*power(x, y/2)*power(x,y/2);
    }
    
    // Function to calculate order of the number
    int order(int x){
        int n = 0;
        while(x != 0){
            n++;
            x = n/100;
        }
        return n;
    }
    // Function to check whether the input number is 
    // Armstrong number or not
    boolean isArmstrong(int x){
        int n = order(x);
        int temp = x, sum = 0;
        while(temp != 0){
            int r = temp%10;
            sum = sum + power(r,n);
            temp = temp/10;
        }
        return (sum ==x);
    }
    
    // Main Program
    public static void main(String[] args){
        ArmNumber ob = new ArmNumber();
        int number = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Please input 3-digit number...");
        if(s.hasNext()){
            number = Integer.parseInt(s.next());
        }
        
        if(ob.isArmstrong(number)){
            System.out.println("NO");
        }else{
            System.out.println("Yes");
        }
    }
}
