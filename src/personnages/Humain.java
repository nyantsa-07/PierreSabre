package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int argent;
	protected int nbConnaissance = 0;
	private Humain[] connaissance = new Humain[3];

	public Humain(String nom, String boissonPreferee, int argent) {
		super();
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}
	

	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}

	protected void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}

	private String prendreParole() {
		return "(" + nom +") - ";
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " 
	+ boissonPreferee + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPreferee + "! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain ;
	} 
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix>argent) {
			parler("Je n'ai plus que " + argent +" sous en poche. Je ne "
					+ "peux même pas m'offrir " + bien + " à " + prix + " sous");
		} else {
			parler("J'ai " + argent +" sous en poche. Je vais pouvoir"
					+ " m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance<connaissance.length) {
			connaissance[nbConnaissance] = humain;
			nbConnaissance ++;
		}
		else {
			for (int i = 0; i < nbConnaissance-1; i++) {
				connaissance[i] = connaissance[i+1];
			}
			connaissance[nbConnaissance-1] = humain;
		}
	}
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		autreHumain.memoriser(this);
		memoriser(autreHumain);
		
	}
	
	public void listerConnaissance() {
		String texte = "Je connais beaucoup de monde dont: ";
		for (int i = 0; i < nbConnaissance; i++) {
			texte += connaissance[i].getNom();
			if (i<nbConnaissance-1) texte += ", " ;

		}
		parler(texte);
	}
}
