import java.util.Arrays;
import java.util.Scanner;

public class Modul3Fase3 {

	public static void main(String[] args) {
		
		
			
			String ciutat1;
			String ciutat2;
			String ciutat3;
			String ciutat4;
			String ciutat5;
			String ciutat6;
			Scanner  nomCiutat = new Scanner(System.in);

		    System.out.println("Introduiex el nom de la 1ª ciutat");
		    ciutat1 = nomCiutat.nextLine();
		    System.out.println("Introduiex el nom de la 2ª ciutat");
		    ciutat2 = nomCiutat.nextLine();
		    System.out.println("Introduiex el nom de la 3ª ciutat");
		    ciutat3 = nomCiutat.nextLine();
		    System.out.println("Introduiex el nom de la 4ª ciutat");
		    ciutat4 = nomCiutat.nextLine();
		    System.out.println("Introduiex el nom de la 5ª ciutat");
		    ciutat5 = nomCiutat.nextLine();
		    System.out.println("Introduiex el nom de la 6ª ciutat");
		    ciutat6 = nomCiutat.nextLine();
		    nomCiutat.close();
		    System.out.println(" "); 
		    System.out.println("Les ciutats són: "+ciutat1+" "+ciutat2+" "+ciutat3+" "+ciutat4+" "+ciutat5+" "+ciutat6);
			
		    System.out.println(" "); 
		    String [] arrayCiutat = {ciutat1,ciutat2,ciutat3,ciutat4,ciutat5,ciutat6};
		    for (int i=0;i<arrayCiutat.length;i++) {
		    	System.out.println("La ciutat que està a la posició "+(i+1)+" al array és : "+arrayCiutat[i]);
		    	}
		    System.out.println(" "); 
		    Arrays.sort(arrayCiutat);
		    for (int i=0;i<arrayCiutat.length;i++) {
		    	System.out.println("L'ordre de les ciutats ordenades alfabeticament és : " + arrayCiutat[i]);
		    }	
		    System.out.println(" "); 
			for (int i=0;i<arrayCiutat.length;i++) {
				System.out.println("Canviem la lletra 'a' pel número 4 : " + arrayCiutat[i].replace('a', '4'));
			}		 
			String[] ArrayCiutatsModificades= new String [arrayCiutat.length]; 
			for (int i=0;i<arrayCiutat.length;i++) {
			ArrayCiutatsModificades[i]= arrayCiutat[i].replace('a','4');
				}
			Arrays.sort(ArrayCiutatsModificades);	 
			System.out.println(" "); 
			System.out.println("Guardem els noms de les ciutats canviades la lletra 'a' pel número 4 a un array nou:");
			for (String j:ArrayCiutatsModificades) {
			System.out.println(j);
			}
			}
			
	}
	
	
		
		
		
