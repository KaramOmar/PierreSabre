package personnages;


public class Ronin {
    private String nom;
    private String boissonPreferee;
    private int argent;
    private int honneur;
    
    public Ronin(String nom, String boissonPreferee, int argent) {
        this.nom = nom;
        this.boissonPreferee = boissonPreferee;
        this.argent = argent;
        this.honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
        int argentDonne = this.argent / 10;
        beneficiaire.recevoir(argentDonne);
        this.perdreArgent(argentDonne);
        System.out.println(this.nom + " donne " + argentDonne + " sous à " + beneficiaire.getNom() + ".");
    }

    public int getArgent() {
        return this.argent;
    }

    public void perdreArgent(int argentPerdu) {
        this.argent -= argentPerdu;
        System.out.println(this.nom + " perd " + argentPerdu + " sous.");
    }

    public void boire() {
        System.out.println(this.nom + " boit un verre de " + this.boissonPreferee + ".");
    }

    public void acheter(String item, int prix) {
        if (this.argent >= prix) {
            this.argent -= prix;
            System.out.println(this.nom + " achète un " + item + " pour " + prix + " sous.");
        } else {
            System.out.println(this.nom + " n'a pas assez d'argent pour acheter un " + item + ".");
        }
    }

    public void parler(String phrase) {
        System.out.println(this.nom + " dit : \"" + phrase + "\"");
    }

    public void direBonjour() {
        System.out.println("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boissonPreferee + ".");
    }

    public int getHonneur() {
        return this.honneur;
    }
    public void setHonneur(int honneur) {
    	this.honneur = honneur;
    	}

    public void perdre(Yakuza adversaire) {
    	adversaire.gagnerArgent(this.argent);
    	adversaire.gagnerReputation();
    	this.argent = 0;
    	this.honneur--;
    	System.out.println(this.nom + " perd tout son argent, perd un point de réputation et annonce sa défaite.");
    	}

    public void gagner(Yakuza adversaire, int gain) {
    	this.argent += gain;
    	this.honneur++;
    	adversaire.perdre();
    	System.out.println(this.nom + " prend " + gain + " sous à " + adversaire.getNom() + ", gagne en réputation et crie sa victoire.");
    	}

    public void provoquer(Yakuza adversaire) {
    	int force = this.honneur * 2;
    	if (force >= adversaire.getReputation()) {
    		this.gagner(adversaire, adversaire.getArgent());
    	} else {
    		this.perdre(adversaire);
    	}
    }
  
}
    