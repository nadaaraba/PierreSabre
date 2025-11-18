package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Samurai;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Traitre;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samurai akimoto = new Samurai("Miyamoto","Akimoto","saké",80);
		Traitre masako = new Traitre("Miyamoto","Masako","whisky", 100,3);
		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
		masako.direBonjour();
		masako.boire();
		masako.ranconner(kumi);
		masako.faireLeGentil();
		}
}
