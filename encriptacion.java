package calculadora;

import java.io.*;
/**
 * 
 * @author Sebastian Beltran
 *
 */
public class encriptacion {
	
	/**
	 * 
	 * @param This program enters a text encrypts it and at the same time decrypts it
	 * @return
	 */
	public static String convertirletras(String original)
	{
		String modified=original;
		
		modified=modified.replace("a", "4");
		modified=modified.replace("e", "3");	
		modified=modified.replace("i", "1");
		modified=modified.replace("o", "0");
		modified=modified.replace("u", "9");
		return modified;
	}
	
	public static String convertirnumeros(String convert) 
	{
		convert=convert.replace("4", "a");
		convert=convert.replace("3", "e");
		convert=convert.replace("1", "i");
		convert=convert.replace("0", "o");
		convert=convert.replace("9", "u");
		
		return convert;
	}
	
	public static String desconvert(String semid) 
	{
		return semid;
	}

	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		try
		{
			bw.write("\n" +"Enter the text you want to encrypt\n");
			bw.flush(); 
			String text=br.readLine();
			text=text.toLowerCase();
			bw.write("\n"+ "lowercase text: "+text+"\n");
			bw.flush();
			String t3xt =convertirletras(text);
			bw.write("\n" + "Text with replaced vowels: "+t3xt+"\n");
			bw.flush();
			
			char encrypt []=t3xt.toCharArray();
			char decrypt []=t3xt.toCharArray();
			
			
			for(int i=0;i<encrypt.length;i++) 
			{
				encrypt[i]=(char) (encrypt [i] + (char) +5 );	
			}
			bw.write("\n" + "encrypted text: " + "\n");
					
			String encrypted=String.valueOf(encrypt);
			bw.write (encrypted);
			bw.flush();
			
			bw.write("\n" + "the decrypted text is: ");
			
			bw.flush();
			
			for(int j=0;j<decrypt.length;j++)
			{
				decrypt[j]=(char)(encrypt[j]+(char)-5);
			}
			
			String decrypted=String.valueOf(decrypt);
			String convert=convertirnumeros(decrypted);
			bw.write(convert);
			bw.flush();
		}
		catch(Exception ex) 
		{
			
		}
	}
}