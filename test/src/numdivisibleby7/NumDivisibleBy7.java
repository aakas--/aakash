/**
 * 
 */
package numdivisibleby7;

/**This is a program to find the number of and sum of all integers greater than 
 * 100 and less than 200 that are divisible by 7.
 * @author aakas
 *
 */
public class NumDivisibleBy7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		System.out.println("Number which is divisble by 7 are");
		for (int i=100;i<=200;i++){
			if(i%7==0){
				count=count+i;
				System.out.println(i);
			}
		
			
		}
			
		System.out.println("Sum of number divisible by 7 is " + count);
		
	}

}
