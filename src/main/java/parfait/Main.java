package parfait;

import java.util.Arrays;

import parfait.object.Voiture;

public class Main {

	public static void main(String[] args) {

		int caisse = 200;
		int montantTel = 1200;
		boolean Asphone = false;

		if (caisse <= montantTel && !Asphone) {
			System.out.println("vous voupez acheter le téphone");
		} else {
			System.out.println("vous ne pouvez pas acheter le téléphone");
		}

		String pseudoss = "Paul,Ali,Andre,Thomas";
		String[] pseudos = pseudoss.split(",");
		System.out.println(pseudos[2]);

		// boucle for pour afficher les nombe de 1 à 20
		// JAMAIS de <=
		for (int i = 1; i <= 20; i++) {
			System.out.println("ceci  est un tour de boucle numéro" + " " + i);

		}

		// créer un tableau et afficher les éléménts qui s'y trouve avec la boucle for
		// en java
		// On en reparle plus tard e ça mais c'est moche :)
		String[] mois = { "janvier", "fevrier", "mars", "mars", "avril" };
		for (int i = 0; i < 4; i++) {
			System.out.println(mois[i]);
		}

		int[] numbers = { 2, 4, 6, 8, 10, 12, 99, 201 };
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);

		/***********************************/
		/************** OBJETS *************/
		/***********************************/

		// Création de 2 voitures
		Voiture v1 = new Voiture("v1", "b1");
		Voiture v2 = new Voiture("v2", "b2");

		// Création d'un tableau de type Voiture
		Voiture[] voitures = new Voiture[2];

		// Ajout des 2 voitures au tableaux
		voitures[0] = v1;
		voitures[1] = v2;

		// Boucle sur le tableau voitures qui affiche le nom de la voiture et sa marque
		// On y accède par les get de la classe Voiture
		for (Voiture voiture : voitures) {
			System.out.println("Mon nom de voiture est " + voiture.getName() 
				+ " et ma marque est " + voiture.getBrand());
		}
		
		// Vieille solution moche
		for (int i = 0; i < voitures.length; i++) {
			System.out.println("Mon nom de voiture est " + voitures[i].getName() 
			+ " et ma marque est " + voitures[i].getBrand());
		}

	}

	
	Voiture V1 = new Voiture("Audi",  "A3");
	
	Voiture V2= new Voiture("KIA", "picanto");
	
	Voiture[] voitures= new Voiture[2];
	
	// Vieille solution moche
	for (int i = 0; i < voitures.length; i++) {
	    System.out.println("Mon nom de voiture est " + voitures[i].getName() 
	            + " et ma marque est " +               voitures[i].getBrand());
	}
	
	
	
	
}
