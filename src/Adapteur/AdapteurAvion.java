package Adapteur;

public class AdapteurAvion implements Piste{
	int longueur;
	int largeur;
	PisteAvion p;
	
	public AdapteurAvion(PisteAvion p) {
		this.p = p;
	}

	@Override
	public int getLargeur() {
		return p.getDemiLargeur()*2;
	}
	
	@Override
	public int getLongueur() {
		return p.getDemiLongueur()*2;
	}

	@Override
	public String toString() {
		return "PisteAvion [Largeur=" + getLargeur() + ", Longueur=" + getLongueur() + "]";
	}
	
	

}
