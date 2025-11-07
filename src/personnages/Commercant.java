package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int ar = getArgent();
		perdreArgent(ar);
		parler("J'ai tout perdu! Le monde est vraiment trop injuste.");
		return ar;

	}

	public void recevoir(int argent) {
		parler(argent + " sous! Je te remercie généreeux ronin!");
		gagnerArgent(argent);
	}

}
