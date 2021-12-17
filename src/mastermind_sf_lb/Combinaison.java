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
    
    public
            String combSecret[] = new String[4];
    public
            String combChoisie[] = new String[4];
    

    public String[] combinaisonSecrete() {

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
        for (int i = 0; i < 4; i++) {
            int c = rand.nextInt(5);
            combSecret[i] = TabCouleur[c];
        }

        System.out.println("La combinaison secrète tirée aléatoirement est : " + Arrays.toString(combSecret));
        return combSecret;
    }

    public String[] combinaisonChoisie() {

        //on remet le tabcouleur ici en attendant de trouver une nouvelle organisation dans le code pour y acceder sans le remettre dans chaque méthode (ex --> creer une nouvelle classe de Couleur et methode TabCouelur)
        String TabCouleur[] = new String[6];
        TabCouleur[0] = "Rouge";
        TabCouleur[1] = "Jaune";
        TabCouleur[2] = "Vert";
        TabCouleur[3] = "Bleu";
        TabCouleur[4] = "Orange";
        TabCouleur[5] = "Magenta";

     
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un numéro pour choisir une combinaison de couleur :\n0. Rouge\n1. Jaune\n2. Vert \n3. Bleu\n4. Orange\n5. Magenta");
        for (int i = 0; i < 4; i++) {
            int num = i + 1;
            System.out.println("choix de la couleur n° " + num + ": ");
            int choixmenu = sc.nextInt();
            combChoisie[i] = TabCouleur[choixmenu]; //A CONTINUER
        }
        System.out.println("La combinaison choisie est : " + Arrays.toString(combChoisie));

        return combChoisie;
    }

    //compare la combinaison secrete et la combinaison choisie
    //renvoie le nombre de bonnes couleurs et le nombre de bonne couleur+placement
    public int[] Comparaison(String[] combS, String[] combC) {

        int nbCoul_OK = 0;
        int nbCoul_PlacmtOK = 0;
        //permet de checker le placement & couleur
        boolean[] BoolC = new boolean [4]; 
        boolean[] BoolS = new boolean [4]; 
        
       /* 
        for (int i=0; i<4; i++){
            
            for (int j=0; j<4; j++) { //A CORRIGER pour rendre nb coul OK fonctionnel
                //on détermine le nb de couleurs présentent à la fois dans la comb Chosie et Secrete
                if ( MorganS[i].equals(MorganC[j]) ) { //combC[j].equals(combS[i])
                    nbCoul_OK +=1;
                    System.out.println("+1 couleur OK");
                }
                
                //on détermine le nb de couleurs présentent à la fois dans la comb Chosie et Secrete & aussi bien placées!
                if ( (combC[j].equals(combS[i])) && (combC[i].equals(combS[i])) ) {
                    System.out.println("+1 couleur placée OK");
                    nbCoul_PlacmtOK+=1;
                }
            }
            
        }*/
       
        int [] NB_OK = new int[2];
        NB_OK[0] = nbCoul_OK;
        NB_OK[1] = nbCoul_PlacmtOK;
        int[] arrayNB_OK = new int[] {nbCoul_OK, nbCoul_PlacmtOK};
        System.out.println("nb de couleurs OK : "+arrayNB_OK[0] + ", nb de coul+placement OK : "+ arrayNB_OK[1]);
        return arrayNB_OK;
    }


    public boolean Gagner(int [] nbOK) {
        //on veut récuperer le NB_OK de comparaison et l'affecter à nb_ok local
        int [] NB_OK = nbOK;
        int[] arrayGagnant = new int[] {4, 4};
        //ensuite on compare si nb_ok dis qu'il y a un gagnant ou pas
        if ( NB_OK.equals(arrayGagnant) ) {
            return true; //le code est deviné !
        }
        else {
            return false;
        }
    } 
    
    
}
