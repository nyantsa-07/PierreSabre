package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (argent * 10)/100 ;
		argent -= argentDonne;
		parler(beneficiaire.nom + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
		honneur ++ ;
	}
	
}
