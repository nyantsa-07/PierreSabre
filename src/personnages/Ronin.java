package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (getArgent() * 10)/100 ;
		perdreArgent(argentDonne);
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
		honneur ++ ;
	}
	
	public void provoquer(Yakuza adversaire) {
		if (honneur >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakuza!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur ++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			perdreArgent(getArgent());
			honneur -= 1;
			adversaire.gagner(perte);
		}
	}
	
}
