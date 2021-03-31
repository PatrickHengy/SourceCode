/* Excercise 2.15 Java Homework by Patrick
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Excercise215Assignment;
import java.util.Scanner; 

/**
 *
 * @author PC4
 */
public class Excercise215 {
    
    public static void main(String[] args) { 
        //create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: "); //prompt
        int number1 = input.nextInt(); //Gets first num from user, stores in num1
        
        System.out.print("Enter second integer: "); //prompt
        int number2 = input.nextInt(); //Gets 2nd number
        
        int sum = number1 + number2; //adds numbers, stores them in sum
        
        int divided = number1 / number2; //divides the two numbers
        
        int difference = number1 - number2; //subtracts the two numbers
        
        int multiplied = number1 * number2; //Multiplies the two numbers
        
        System.out.printf("Sum is %d%n", sum); //display sum
        
        System.out.printf("Quotient is %d%n", divided); //display divided number
        
        System.out.printf("Difference is %d%n", difference); //display subtracted number
        
        System.out.printf("Product is %d%n", multiplied); //display multiplied num/product
        
        
    
        
    
    }
    
}
