/**
 * 
 */

/**
 * @author user
 *
 */
public class StringReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringReverse reverse = new StringReverse();
		System.out.println(getReverseString("Leapfrog"));
	}
/**
 * @param This method 
 * @return
 */
public static String getReverseString(String stringToBeReverse){
	StringBuilder	reverseString=new StringBuilder(stringToBeReverse);
	return reverseString.reverse().toString();
}
}
