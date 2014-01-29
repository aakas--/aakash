
public class TempConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		for(int cel=1;cel<=100;cel++)
		{
			System.out.println("Celcius ="+ cel +" "+ "Fahrenheit ="+ fahr(cel));
		}
				
	}
	
	public static float fahr(float c)
	{
		return(c*9/5+32);
	}

}
