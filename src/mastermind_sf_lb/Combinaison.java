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
        
        System.out.println("La combinaison secrète tirée aléatoirement est : "+Arrays.toString(combSecret));
        return combSecret;
    }
   
    
    
    public String [] combinaisonChoisie() {
    
        //on remet le tabcouleur ici en attendant de trouver une nouvelle organisation dans le code pour y acceder sans le remettre dans chaque méthode (ex --> creer une nouvelle classe de Couleur et methode TabCouelur)
        String TabCouleur[] = new String[6];
        TabCouleur[0] = "Rouge";
        TabCouleur[1] = "Jaune";
        TabCouleur[2] = "Vert";
        TabCouleur[3] = "Bleu";
        TabCouleur[4] = "Orange";
        TabCouleur[5] = "Magenta";
        
        
        String [] combChoisie = new String[4]; //tableau de la combinaison entrée par le joueur
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez un numéro pour choisir une combinaison de couleur :\n0. Rouge\n1. Jaune\n2. Vert \n3. Bleu\n4. Orange\n5. Magenta");
       
        for (int i = 0; i<4; i++) {
            int num = i+1;
            System.out.println("choix de la couleur n° "+ num +": ");
            int choixmenu = sc.nextInt();
            combChoisie[i] = TabCouleur[choixmenu]; //A CONTINUER
        }
        
        System.out.print("La combinaison choisie est : "+Arrays.toString(combChoisie));
        return combChoisie;
    }
    
}
