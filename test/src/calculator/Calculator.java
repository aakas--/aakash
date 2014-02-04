package calculator;
import java.util.Scanner;


/**This is a  program which uses switch statement to develop a simple calculator for +, -, *, /, and % operators.
 * @author aakas
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 0;
		float a;
		float b;
		Scanner input= new Scanner(System.in);
		
        System.out.println("Enter the first number");
        a= input.nextFloat();
        System.out.println("Enter the second number");
        b= input.nextFloat();
        
		System.out.println("Enter number: 1. to Add, 2. to Subtract, 3. to Multiply, 4. Divide, 5. to Modulo");
		i= input.nextInt();
		
		switch(i){
		
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
		default:
			System.out.println("Invalid input");
			break;
			}
		

	}

}
