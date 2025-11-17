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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = 2*honneur;
		if (force>=adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			int arg = adversaire.perdre();
			argent += arg;
			honneur++;
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			honneur--;
			argent -= argent;
			
			
			
		}
	}
}
