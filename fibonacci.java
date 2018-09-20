package calculadora;
 
/**
 * 
 * @author Sebastian Beltran
 *
 */

public class fibonacci {
	/**
	 * 
	 * @param this program performs the fibonacci series recursively
	 * @return
	 */
	public static int fibonacci (int numero) 
	{
		if(numero == 0) 
			return 1;
		else
			if(numero == 1)
				return 1;
			else
				return fibonacci (numero-1) + fibonacci (numero-2);
		}
	public static void main(String[] args) 
	{
		int n = 0;
		while(n!=9)
		{
			System.out.println("The fibonacci series is : " + n + " es " + fibonacci (n));
			n++;
		}
	}
}
