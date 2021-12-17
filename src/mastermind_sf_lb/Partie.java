/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_sf_lb;

import static java.util.Arrays.compare;

/**
 *
 * @author scottfullagar
 */
public class Partie {
    
    
    public void debuterPartie() {
        
        System.out.println("Bienvenue dans le MasterMind de Scotty & Lélé :) ");
        //on génère une combinaison secrete
        Combinaison cs = new Combinaison();
        cs.combinaisonSecrete();
        
        int coups = 12;//la partie dure au maximum 12 coups
        for (int i = 0; i <coups; i++) {
            Combinaison cc = new Combinaison();
            cc.combinaisonChoisie(); //demande une combinaison au player
            
            //System.out.println(cc.combChoisie);
            
            Combinaison compare = new Combinaison();
            compare.Comparaison(cs.combSecret, cc.combChoisie); //.Comparaison(Combinaison[] combS , Combinaison[] combC);
            
            
            /*Combinaison etregagnant = new Combinaison();
            boolean gagner = etregagnant.Gagner(compare);
            if (gagner == true) {
                System.out.println("Vous avez deviné le code secret !!! ");
            }
            else {
                coups++;
                System.out.println("Retentez votre chance, il vous reste "+coups+"coups. ");
            }
           
        }*/
        
        //faire option "vous avez perdu / gagné" --> creer methode gagner (si gagner == false au bout des 12 coups --> perdu !)
        
        //partie facile / difficile : + ou - --> nb couleur dans TabCouleur & nb coups pour trouver code secret
    }
    
}
