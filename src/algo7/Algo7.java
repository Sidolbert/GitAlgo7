package algo7;

import java.util.Scanner;

/*
 * Faire choisir à l’utilisateur un nombre compris entre 0 et 100
L’algorithme doit proposer des nombres l utilisateur doit indiquer si le nombre qu il a choisi est supérieur,
i nférieur ou égal au nombre proposé
Si l'algo trouve le nombre en moins de 5 essais vous perdez sinon vous gagnez
 */
public class Algo7 {
	public static void main(String[] args) {
		//fonction principale du programme
		int min=0, max=100, answer;
		System.out.println("Bienvenue ! Imaginez un nombre entre "+ min +" et " + max + ", je vais essayer de le deviner");
		System.out.println("Repondez Higher/Lower/Victory");
		String between, endgame="";
		for(int i=0;i<5;i++) {
			//génération d'un nombre aléatoire
			//answer = (int)(Math.random()*101);
			//avec arrondi pour plus de finesse
			answer = (int)Math.round(Math.random()*(max-min)+min);
			//version sans aléatoire :
			//answer = Math.round((max+min)/2);
			
			System.out.println("votre nombre est-il " + answer + " ?");
			Scanner lecteur = new Scanner(System.in);
			between = lecteur.nextLine();
			switch(between) {//condition qui permet de vérifier des valeurs uniques
			case "Higher"://si between == "Higher" ->on entre dans ce code
				min = answer+1;
				break;//le break nous sort du switch
			case "Lower"://si between == "Lower" ->on entre dans ce code
				max = answer-1;
				break;
			case "Victory"://si between == "Victory" ->on entre dans ce code
				System.out.println("Bravo ! J'ai trouvé !");
				i +=5;
				endgame ="win";
				break;
			default ://si on est entré nulle part au-dessus on entre dans default
				System.out.println("Je n'ai pas compris, je réessaye");
				i--;//si l'entrée était invalide on a fait un tour pour rien : le compteur ne doit pas monter ce tour-ci
			}
		}
		if(endgame != "win") {
			System.out.println("Vous êtes très fort");
		}
	}
}
