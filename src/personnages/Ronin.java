package personnages;


public class Ronin extends Humain{
	protected int honneur;
	private String nom;
	private String boisson;
	private int argent;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int arg = ((10*argent)/100);
		parler(beneficiaire.getNom() + " prend ces " + arg + " sous.");
		beneficiaire.recevoir(arg);
		argent -= arg;
	}
}
