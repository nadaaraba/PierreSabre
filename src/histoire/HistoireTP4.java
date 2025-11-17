package histoire;

import personnages.Humain;
import personnages.Ronin;

import personnages.Commercant;
import personnages.Yakuza;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("Kombucha", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);

		Commercant marco = new Commercant("Marco", 30);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.parler(marco.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
	}

}
