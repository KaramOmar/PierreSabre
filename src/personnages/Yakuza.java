package personnages;

public class Yakuza {
	
	private String nom;
    private String boissonPreferee;
    private int argent;
    private String clan;
    private int reputation;
	
    
    public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
        this.nom = nom;
        this.boissonPreferee = boissonPreferee;
        this.argent = argent;
        this.clan = clan;
        this.reputation = 4;
    }
    
   
    public void extorquer(Commercant victime) {
        int montant = victime.seFaireExtorquer();
        argent += montant;
        reputation++;
        System.out.println("(" + nom + ") - J’ai piqué les " + montant + " sous de " + victime.getNom() +
                ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public int getReputation() {
        return reputation;
    }

    public void perdre() {
        argent = 0;
        reputation--;
        System.out.println(nom + " perd tout son argent, perd un point de réputation et annonce sa défaite.");
    }

    public void gagnerArgent(int gain) {
        argent += gain;
    }

    public void gagnerReputation() {
        reputation++;
    }


    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void parler(String phrase) {
        System.out.println(nom + " dit : \"" + phrase + "\"");
    }
}
