package Adapteur;

public class PisteBowling implements Piste{
	
	int longueur;
	int largeur;
	
	public PisteBowling(int longueur,int largeur){
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "PisteBowling [longueur=" + getLongueur() + ", largeur=" + getLargeur() + "]";
	}

	@Override
	public int getLargeur() {
		return largeur;
	}

	@Override
	public int getLongueur() {
		return longueur;
	}
	
	

}
