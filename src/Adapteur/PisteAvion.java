package Adapteur;

public class PisteAvion {
	
	int longueur;
	int largeur;
	
	public PisteAvion(int longueur,int largeur){
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public String toString() {
		return "PisteAvion [longueur=" + getDemiLongueur() + ", largeur=" + getDemiLargeur() + "]";
	}
	
	public int getDemiLongueur() {
		return longueur / 2;
	}

	public int getDemiLargeur() {
		return largeur / 2;
	}

}
