package personnages;

public class Commercant {
    private String nom;
    private String boisson;
    private int argent;
	private String boissonPreferee;
    
    public Commercant(String nom, String boisson, int argent) {
        this.nom = nom;
        this.boisson = boisson;
        this.argent = argent;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getArgent() {
        return argent;
    }
    
    public void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }
    
    public void boire() {
        parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
    
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix;
            parler("Je viens d'acheter " + bien + " pour " + prix + " sous.");
        } else {
            parler("Je n'ai pas assez d'argent pour acheter " + bien + ".");
        }
    }
    
    public int seFaireExtorquer() {
        int argentPerdu = argent;
        argent = 0;
        parler("J'ai tout perdu! Le monde est trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
    	gagnerArgent(argent);
        System.out.println(getNom() + " : " + argent + " sous ! Je te remercie généreux donateur !");
    }

	private void gagnerArgent(int argent) {
		// TODO Auto-generated method stub
		 this.argent += argent;
	        System.out.println(nom + " a gagné " + argent + " sous. Il possède maintenant " + this.argent + " sous.");
	    }


	
	 
	   public void direBonjour() {
	        System.out.println(this.getNom() + " : Bonjour ! Je m’appelle " + this.getNom() + " et j’aime boire du " + this.boissonPreferee + ".");
	    }
}

 