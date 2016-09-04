package org.entretien;

import java.util.Scanner;

/**
 * @author TOBORI
 *
 */
/**
 * @author TOBORI
 *
 */
public class Joueur {

	// Les attributs
	private String nom;
	private int point;

	// Les Constructeurs

	public Joueur() {
		super();
	}

	public Joueur(String nom, int point) {
		super();
		this.nom = nom;
		this.point = point;
	}

	// Les setters et les getters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// Ajouter un point chaque fois le joueur gagne
	public int gagnerUnPoint(int point) {
		this.point = getPoint() + 1;
		System.out.println("Il a un point de : " + this.point);
		return this.point;

	}

	public void affiche() {
		System.out.println("Le joueur " + getNom() + " son point est : " + getPoint());
	}


	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", point=" + point + "]";
	}

}
