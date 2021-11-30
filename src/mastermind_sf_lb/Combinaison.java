/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_sf_lb;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author scottfullagar
 */
public class Combinaison {
    
    public String [] combinaisonSecrete() {
        
        String combSecret[] = new String[4];
        
        //creation tableau contenant les 6 couleurs possibles
        String TabCouleur[] = new String[6];
        TabCouleur[0] = "Rouge";
        TabCouleur[1] = "Jaune";
        TabCouleur[2] = "Vert";
        TabCouleur[3] = "Bleu";
        TabCouleur[4] = "Orange";
        TabCouleur[5] = "Magenta";
        
        //tirage aléatoire des couleurs contenues dans le code
        Random rand = new Random();
        for (int i=0; i < 4; i++) {
            int c = rand.nextInt(5);
            combSecret[i] = TabCouleur[c];
        }
        
        
        System.out.println(Arrays.toString(combSecret));
        return combSecret;
    }
   
    public String [] combinaisonChoisie() {
    
        String [] combChoisie = new String[4]; //tableau de la combinaison entrée par le joueur
        
        Scanner sc = new Scanner(System.in);
        
        //on entre la combinaison choisie par le joueur combChoisie[0] --> combChoisie[4]
        for (int i = 0; i<4; i++) {
            System.out.println("Entrez une couleur parmi celle proposées dans TabCouleur :.....FAIRE LISTE AVEC NUM.....");
            int choixmenu = sc.nextInt();
            combChoisie[i] = "Rouge"; //TabCouleur[choixmenu]; A CONTINUER
        }
        
        System.out.print("combinaison choisie : "+Arrays.toString(combChoisie));
        return combChoisie;
    }
    
}
