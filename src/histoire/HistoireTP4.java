package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof;
		prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant commercant;
		commercant = new Commercant("Marco", 20);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();
		
		Yakuza yakuza;
		yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuza.direBonjour();
		yakuza.extorquer(commercant);
		
		Ronin ronin;
		ronin = new Ronin("Roro", "shochu", 60);
		ronin.direBonjour();
		ronin.donner(commercant);
	}

}
