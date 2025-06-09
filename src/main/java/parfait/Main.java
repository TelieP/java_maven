package parfait;

import java.util.Arrays;

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

	}

}
