package personnages;

public class Humain {
	protected String nom;
	protected String boissonPreferee;
	protected int argent;

	public Humain(String nom, String boissonPreferee, int argent) {
		super();
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
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
}
