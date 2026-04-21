package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+ clan);
	}
	
	public int getReputation() {
		return reputation;
	}	

	public void extorquer(Commercant commercant) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentGagne = commercant.seFaireExtorquer();
		gagnerArgent(argentGagne); 
		reputation++;
		parler("J'ai piqué les " + argentGagne + " sous de " + commercant.getNom()+ ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi! Hi!");
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation ++ ;
		parler("Ce ronin pensait vraiment battre "+ getNom() + " du clan de "
				+ clan + "? Je l'ai dépouillé de ses "+ gain +" sous.");
	}
	
	public int perdre() {
		int perte =getArgent();
		perdreArgent(perte);
		reputation -= 1 ;
		parler("J’ai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de "
				+ clan +".");
		return perte;
	}
}
