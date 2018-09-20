package calculadora;
import java.io.*;
 
/**
 * 
 * @author Sebastian Beltran
 *
 */

public class pascal {
	/**
	 * 
	 * @param this program shows the pascal triangle
	 * @return
	 */
	public static int triangulo (int a, int b) 
	{
		if (a==b || b==0 )
		{
			return 1;
			}
		else
		{
			return triangulo (a-1,b-1) + triangulo (a-1,b);
			}
		}
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j <=i; j++)
			{
				System.out.print(triangulo (i,j));
				}
			System.out.println();
			}		
		}
}