package week1;

/**
 * Advanced Exercises - Week 1 No.1
 * 
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
public class calNumber
{
    // Function to calculate to the following series 
    public static float formula(int n){ 
        float answer = 0;
        answer = (float)n*(n-1)/2;
        return answer;
    }
    // Function to calculate to the following series 
    public static int formula2(int n){
        int answer = 0;
        answer = 2 * n + 26;
        return answer;
    }
    // Drive program
    public static void main(String[] args){
        int [] n = {5,10,20,50,100,500,1000,5000};
        double res = 0;
        int res1 = 0;
        for(int i = 0; i < n.length; i++){
            System.out.print("#The formula 1: "+ formula(n[i]) + '\t');
            System.out.println("#The formula 2: "+ formula2(n[i]));
        }
    }
}
