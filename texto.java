package taller;
import java.io.*;

/**
* 
* @author Sebastian Beltran
*
*/

public class texto {
	/**
	 * 
	 * @param this program tells us how many times a letter or a word is repeated
	 * @return
	 */
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		String Texto;
		String palabra;
		int cont=0;
		try
		{
			System.out.println("write the text: " );
			Texto=br.readLine();
			System.out.println("write the word or letter you want to find: " );
			palabra =br.readLine(); 
			while (Texto.indexOf(palabra) > -1) 
			{
				Texto = Texto.substring(Texto.indexOf(palabra)+palabra.length(),Texto.length());
				cont++; 
			}
			System.out.println ( "the letter or word " + palabra + " is repeated " + cont + " times");
			bw.flush();
	    }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
