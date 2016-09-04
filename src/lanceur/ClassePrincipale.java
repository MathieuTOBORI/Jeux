package lanceur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.entretien.Joueur;

/**
 * @author TOBORI
 *
 */
public class ClassePrincipale {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		Joueur joueur1 = new Joueur("Djokovic", 0);
		Joueur joueur2 = new Joueur("MacEnroe", 0);
		System.out.println(
				"                    **************************************************************            ");
		System.out.println("Debut du jeux");
		System.out.println("Les joueurs sont: \n" + "- " + joueur1 + "\n" + "- " + joueur2);

		// Ouverture d'un fichier de log

		File resultat = new File("Jeu Gagné par Djokovic.txt");
		FileWriter fw = new FileWriter(resultat);
		fw.write("******************* Debut du jeu***************************" + "\n");

		// Lire les entrer du clavier
		Scanner jeux = new Scanner(System.in);

		while ((joueur1.getPoint() != joueur2.getPoint() + 2) && (joueur2.getPoint() != joueur1.getPoint() + 2)) {

			System.out.println("**********  Saisissez le nom joueur qui a gagné : **********");
			String nomJoueurSaisit = jeux.nextLine();

			System.out.println("le joueur est : " + nomJoueurSaisit);
			if (nomJoueurSaisit.equals("Djokovic")) {
				joueur1.gagnerUnPoint(joueur1.getPoint());
				fw.write(joueur1.getNom() + " " + joueur1.getPoint() + "\n");
				fw.flush();

			} else if (nomJoueurSaisit.equals("MacEnroe")) {
				joueur2.gagnerUnPoint(joueur2.getPoint());
				fw.write(joueur2.getNom() + " " + joueur2.getPoint() + "\n");
				// Forçage de l'écriture
				fw.flush();
			}

		}
		// Donner le nom du gagnant
		if ((joueur1.getPoint() == 2 && joueur2.getPoint() == 0)
				|| (joueur2.getPoint() == 2 && joueur1.getPoint() == 0)) {
			if ((joueur1.getPoint() == joueur2.getPoint() + 2) || (joueur2.getPoint() == joueur1.getPoint() + 2)) {

				System.out.println("********** Saisissez le nom joueur qui a gagné le point: **********");
				String nomJoueurSaisit = jeux.nextLine();

				System.out.println("le joueur est : " + nomJoueurSaisit);
				if (nomJoueurSaisit.equals("Djokovic")) {
					joueur1.gagnerUnPoint(joueur1.getPoint());
					fw.write(joueur1.getNom() + " " + joueur1.getPoint() + "\n");
					fw.flush();

				} else if (nomJoueurSaisit.equals("MacEnroe")) {
					joueur2.gagnerUnPoint(joueur2.getPoint());
					fw.write(joueur2.getNom() + " " + joueur2.getPoint() + "\n");
					// Forçage de l'écriture
					fw.flush();

				}
			}

		}

		// Résultat du jeu affiché dans la console
		System.out.println("Le resultat du jeu est : ");
		joueur1.affiche();
		joueur2.affiche();

		System.out.println("********* ************** Fin du jeu********************************");

		fw.write("**************************** Fin du jeu************************************");
		fw.close();

	}
}
