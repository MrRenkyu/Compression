package CompressClass;

import java.util.ArrayList;

public class RLE {

	//Methode pour calculer le nombre de fois qu'un caractere se repete 	
	public static String printRLE(String str)
	{
		int n = str.length();
		for (int i = 0; i < n; i++) {

			// Compteur de caractere recurrent
			int count = 1;
			while (i < n - 1 && 
					str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			// Affichage du nombre puis du caractère
			System.out.print(count);
			System.out.print(str.charAt(i));
			
		}
		return "";
	}
	
}
