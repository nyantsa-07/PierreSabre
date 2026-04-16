package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentperdu = argent;
		argent = 0 ;
		parler(" J’ai tout perdu! Le monde est trop injuste.. ");
		return argentperdu;
		
	}
	
	public void recevoir(int argentRecu) {
		argent += argentRecu;
		parler(argentRecu + " sous ! Je te remercie généreux donateur!");
	}

}
