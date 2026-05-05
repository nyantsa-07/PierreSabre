package personnages;
import java.util.*;

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
		if (niveauTraitrise<3) {
			int argentRanconner = commercant.getArgent() * 2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			niveauTraitrise ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer!" 
			+ " Donne-moi " + argentRanconner + "sous ou gare à toi! ");
			parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me démasquer!");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! snif");
		} else {
			int don = getArgent()*1/20;
			Random nb= new Random();
			int nbRandom =nb.nextInt(nbConnaissance);
			Humain ami = connaissance[nbRandom];
			String nomAmi = ami.getNom();
			parler("il faut absolument remonnter ma cote de confiance. Je vais faire ami ami avec"
					+ nomAmi +".");
			parler("Bonjour l'ami!" + " Je voudrais vous aider en vous donnant " 
					+ don +" sous");
			ami.gagnerArgent(don);
			perdreArgent(don);
			parler("Merci " + getNom()+" .Vous êtes quelqu'un de bien!");
			niveauTraitrise --;
		}
	}
}
