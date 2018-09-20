package calculadora;
 
/**
 * 
 * @author Sebastian Beltran
 *
 */

public class factorial {
	/**
	 * 
	 * @param This program performs a factorial operation through recursion
	 * @return
	 */
	public static int factorial (int numero) 
	{
		if (numero > 0) 
			return numero * factorial(numero-1);
		else
			return 1;
		}
	public static void main(String[] args) 
	{
		System.out.println("the factorial of 4 is: " + factorial(4));
		}
}
