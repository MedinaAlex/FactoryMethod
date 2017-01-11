package Adapteur;

public class Boule {
	
	Piste piste;
	
	public Boule(Piste p){
		this.piste = p;
	}
	
	public String lancer(){
		return piste.toString();
	}

}
