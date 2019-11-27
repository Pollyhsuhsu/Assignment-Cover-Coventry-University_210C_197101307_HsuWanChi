package week1;

import java.util.Scanner; 
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
public class simCalculator
{
    public static Scanner s = new Scanner(System.in);
    public int a,b;
    public simCalculator() {
        this.a = a;
        this.b = b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        }else{ 
            return a / b;
        }
    }

    // Main drive
    public static void main(String[] args) {
        double first = 0, second = 0, answer = 0;
        int action = 0, operator = 0;
        String question = null, inputOperator = null;
        while(true){
            // Declaring and Initializaing an object
            simCalculator myCalculator = new simCalculator();
            System.out.println();
            System.out.println("---------Calculator is on---------");
            question = "Enter the first number: ";
            first = checkNumber(question);
            question = "Enter the secound number: ";
            second = checkNumber(question);
            do{
                System.out.println("Choose your expression(1-4):");
                System.out.println("1. Addition\n2. Substraction\n3. Multiplcation\n4. Divide");
                question = "Enter Choice : ";
                operator = (int)checkNumber(question);
            }while(operator < 1 || operator > 4);

            switch(operator){
                case 1:
                answer = add(first, second);
                inputOperator = "+";
                break;
                case 2:
                answer = subtract(first, second);
                inputOperator = "-";
                break;
                case 3:
                answer = multiply(first, second);
                inputOperator = "*";
                break;
                case 4:
                answer = divide(first,second);
                inputOperator = "/";
                break;
            }

            System.out.print("\nThe result is given as follows:\n");
            System.out.print(first + " " + inputOperator + " " + second + " = " + answer + "\n");
            System.out.println();
            
            do{
                question = "1-Continue 2-Exit: ";
                action = (int)checkNumber(question);
            } while (action < 1 || action > 2);
            if (action == 2){
                System.out.println("---------Calculator off---------\n");
                System.exit(1);
            }

        }
    }

    
    // Check the input Number
    public static double checkNumber(String Question){
        double number = 0;
        System.out.print(Question);
        boolean flag = false;
        while(!flag){
            try{
                number = Double.parseDouble(s.nextLine());
                flag = true;
            }catch(NumberFormatException e){
                System.err.println("Wrong input! Input only numbers please: " + e.getMessage());
            }catch(ArithmeticException ex){
                System.err.println(ex.getMessage());
            }
        }
        return number;
    }
}

