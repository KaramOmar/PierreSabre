package histoire;

import personnages.*;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();

        prof.acheter("boisson", 12);
        prof.boire();

        prof.acheter("jeu", 2);
        prof.perdreArgent(2);
        prof.acheter("kimono", 50);

        Commercant marco = new Commercant("Marco", "thé", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();

        Ronin roro = new Ronin("Roro", "shochu", 60);
        roro.direBonjour();
        marco.direBonjour();
        roro.donner(marco);
        roro.provoquer(new Yakuza("Yaku Le Noir", "saké", 100, "Warsong"));
        roro.direBonjour();
        marco.direBonjour();
        
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "saké", 100, "Warsong");
        roro.parler("Je suis Roro, un ronin. Qui es-tu ?");
        yakuLeNoir.parler("Je suis Yaku Le Noir du clan de Warsong.");
        roro.provoquer(yakuLeNoir);
        yakuLeNoir.setReputation(4);
        roro.provoquer(yakuLeNoir);
        yakuLeNoir.setReputation(0);


     
}
}