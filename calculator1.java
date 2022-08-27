package calcii;
import java.util.Scanner;

public class calculator1 
{
	public static void main(String[] args) 
	{
		char operator1;
		Double number1, number2, result;
	    Scanner input=new Scanner(System.in);
        
	    System.out.println("Welcome To Calculator");
	    
	    System.out.println("Choose an operator: +,-,*,/ or %");
        operator1 = input.next().charAt(0);
        
        System.out.println("Enter First Number : ");
        number1 = input.nextDouble();
        
        System.out.println("Enter Second Number : ");
        number2 = input.nextDouble();
		   
        switch(operator1)
        {
        case '+':
        	result = number1 + number2;
            System.out.println(number1 + "+" + number2 + "=" + result);
            break;
            
        case '-':
        	result = number1 - number2;
            System.out.println(number1 + "-" + number2 + "=" + result);
            break;
            
        case '*':
        	result = number1 * number2;
            System.out.println(number1 + "*" + number2 + "=" + result);
            break;
            
        case '/':
        	result = number1 / number2;
            System.out.println(number1 + "/" + number2 + "=" + result);
            break;
            
        case '%':
        	result = number1 % number2;
            System.out.println(number1 + "%" + number2 + "=" + result);
            break;  
            
         default :
        	 System.out.println("Invalid Operator!");
        	 break;

        
        }
        
        input.close();
 }
}