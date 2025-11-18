package personnages;

public class Yakuza extends Humain {
	
	protected String clan;
	protected int reputation; 
	private String nom;
	private String boisson;
	private int argent;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.argent=argent;
		this.boisson=boisson;
		this.nom= nom;
		this.clan=clan;
		this.reputation=0;
	
	}
	
	public int getReputation() {
		return reputation;
		
	}
	public void extorquer(Commercant victime) {
		int arg = victime.seFaireExtorquer();
		argent += arg;
		reputation++;
		parler("J'ai piqué les " + arg + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		reputation -=1;
		parler("J’ai perdu mon duel et mes "+ argent +" sous, snif... J'ai déshonoré le clan de "+ clan + ".");
		int arg = argent;
		argent -= argent;
		return arg;
		
	}
	public void gagner(int gain) {
		argent += gain;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + this.clan);
		
	}
	
}