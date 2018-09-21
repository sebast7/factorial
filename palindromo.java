package taller;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class palindromo {
	/**
	 * 
	 * @param this program tells us if the phrase is palindromic or not
	 * @return
	 */
	
	public static boolean palindromo (String frase) 
	{
		for (int i = 0; i < frase.length(); i++) 
		{
			if(frase.charAt(i) != frase.charAt(frase.length()-i -1))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		String frase;
		
		try
		{
			bw.write("escriba la palabara");
			frase=br.readLine();
			
			if(palindromo(frase)== true)
			{
				System.out.println("the phrase is a palindrome" + frase);
			}
			else
			{
				System.out.println("the phrase is not a palindrome" + frase);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
