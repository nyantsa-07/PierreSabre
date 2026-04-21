package personnages;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonPreferee, int argent) {
		super(seigneur, nom, boissonPreferee, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler(" Mais je suis un traître et mon niveau de traîtrise est : "+ niveauTraitrise 
				+". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise>3) {
			int argentRanconner = commercant.getArgent() * 2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler();
		} else {

		}
	}
}
