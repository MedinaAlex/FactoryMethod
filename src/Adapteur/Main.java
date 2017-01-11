package Adapteur;

public class Main {

	public static void main(String[] args) {
		
		Piste piste1 = new PisteBowling(10,10);
		PisteAvion pisteAvion = new PisteAvion(100,100);
		AdapteurAvion adapter = new AdapteurAvion(pisteAvion);
		
		Boule b = new Boule(piste1);
		System.out.println(b.lancer());
		
		Boule b2 = new Boule(adapter);
		System.out.println(b2.lancer());

	}

}
