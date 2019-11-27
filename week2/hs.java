package week2;
import java.util.*;

/**
 * 在这里给出对类 hs 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class hs
{
    // Function to return sum of 
    // 1/1 + 1/2 + 1/3 + ..+ 1/n
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a integer for Function to return sum of 1/1 + 1/2 + 1/3 + ..+ 1/n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Sum is "+h(n));
    }

    public static double h(int n){
        double i = 1, s = 0.0; 
        while (n>0){
            s = s + 1/i; 
            i++;
            n--;
        }
        return s;
    }
}
