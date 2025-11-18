package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire;
	private static final int TAILLE_MEMOIRE=30;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.memoire= new Humain[TAILLE_MEMOIRE];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return nom + " : ";
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + nom + " et j�aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + "�" + prix
					+ "sous.");
		} else {
			perdreArgent(prix);
			parler("J'ai " + argent + "sous en poche. Je vais pouvoir m'offrir un(e)" + bien + " � " + prix);
		}
	}
	
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance < TAILLE_MEMOIRE) {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;
		} else {
			memoire[0]=null;
			Humain temp;
			for (int i=1; i<nbConnaissance;i++) {
				temp = memoire[i];
				memoire[i-1] = temp;
			}
			memoire[TAILLE_MEMOIRE-1]=autreHumain;
		}
			
	}
	public void listerConnaissance() {
		if (nbConnaissance != 0) {
			String text = "";
			for (int i = 0; i<nbConnaissance-1; i++) {
				text += memoire[i].getNom() + ", ";
			}
			parler("Je connais beaucoup de monde dont : " + text + memoire[nbConnaissance-1].getNom());
		}
	}
	
	
	

}
