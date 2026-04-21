package personnages;

public class Yakuza extends Humain {
	private String clan ;
	private int reputation = 0 ;
	
	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant commercant) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.nom + ", si tu tiens à la vie donne moi ta bourse !");
		int argentGagne = commercant.seFaireExtorquer();
		argent += argentGagne;
		reputation ++ ;
		parler("J'ai piqué les " + argentGagne +" sous de " + commercant.nom 
				+ ", ce qui me fait " + argent + " sous dans ma poche. Hi! Hi!" );
	}
	
	
}
