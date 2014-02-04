/**
 * 
 */
package stringmupulation;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class StringManupulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String title = null;
		String firstName = null;
		String lastName = null;
		String emailId;
		
		System.out.println("Enter Title");
		title= input.next();
		System.out.println("Enter First Name");
		firstName= input.next();
		System.out.println("Enter Last Name");
		lastName= input.next();
		
		System.out.println(title.concat(firstName).concat( lastName));
		
		

		
		

	}

}
