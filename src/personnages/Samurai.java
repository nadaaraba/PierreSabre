package personnages;

public class Samurai extends Humain{
	private String seigneur;

	
	public Samurai(String maitre, String prenom, String boisson, int money) {
		super(prenom, boisson, money);
		this.seigneur = maitre;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + this.seigneur);
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du "+boisson+ ".");
	}
}
