import com.adrar.Playeur;

public class Main {
    public static void main(String[] args) {

        // Joueur est un type désormais
        Playeur playeur1 = new Playeur();
        Playeur playeur2 = new Playeur();
        // les joueurs sont des objets maintenant

        //modification attribut nom Joueur
        playeur1.setName("Sam");
        playeur2.setName("Frodo");

        //affichage attribut nom joueur
        System.out.println("joueur 1 est "+ playeur1.getName());
        System.out.println("joueur 2 est "+ playeur2.getName());

        // changement de l'attribut nom
        playeur1.setName("Samsagace");


        //appel des methodes et fonctions
        playeur2.play();
        playeur1.initCards();
        System.out.println(playeur1.getName() +" tire la carte "+playeur1.drawCard()+".");
    }

}
