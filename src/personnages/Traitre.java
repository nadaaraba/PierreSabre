package personnages;

import java.util.Random;

public class Traitre extends Samurai {
	private int niveauTraitrise;
	private Random rnd= new Random();
	
	public Traitre(String maitre, String prenom, String boisson, int money, int niveauTraitrise) {
		super(maitre ,prenom, boisson, money);
		this.niveauTraitrise = niveauTraitrise;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			commercant.perdreArgent(((commercant.getArgent())/10)*2);
			gagnerArgent(((commercant.getArgent())/10)*2);
			niveauTraitrise ++;
			}
		}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami avec personne car je ne connais personne ! Snif.");
			}else {
				int index = new Random().nextInt(nbConnaissance);
		        Humain ami = memoire[index];
		        int don = getArgent() / 20;

		        parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec"+ ami.getNom()+".");
		        parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
		        ami.gagnerArgent(don);
		        perdreArgent(don);
		        
		        ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
		        
		        if (niveauTraitrise > 1) {
		            niveauTraitrise--;
		        }
		        
			}
	
}
}
