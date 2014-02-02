/**
 * 
 */
package palindrome;

import java.util.Scanner;

/**
 * @author aakas
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer num;
		System.out.println("Please enter 5 digit number");
		Scanner input= new Scanner(System.in);
		num= input.nextInt();
		
		int len= String.valueOf(num).length();
		
	//System.out.println(reversDigits(num));
			
		if(len==5){
			result(num);
				
		}
		else{
			System.out.println("Invalid Input");
				
		}
	}
	
	
	private static void result(int number){
		Integer reverseDigit= reversDigits(number);
		if(number== reverseDigit)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
			
		
		
	}
	
	public static int reversDigits(int number) {
		int reversedNumber=0;
		while(number > 0){
            
            int temp = number%10;
           
            //create the reversed number
            reversedNumber = reversedNumber * 10 + temp;
            number = number/10;
             }
		return reversedNumber;
	}

}
