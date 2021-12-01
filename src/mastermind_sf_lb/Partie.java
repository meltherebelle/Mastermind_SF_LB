/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_sf_lb;

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
        
        //la partie dure au maximum 12 coups
        for (int i = 0; i <12; i++) {
            Combinaison cc = new Combinaison();
            cc.combinaisonChoisie(); //demande une combinaison au player
            
            Combinaison compa = new Combinaison();
            compa.Comparaison(cs, cc);
            
        }
        
        //faire option "vous avez perdu / gagné" --> creer methode gagner (si gagner == false au bout des 12 coups --> perdu !)
        
        //partie facile / difficile : + ou - --> nb couleur dans TabCouleur & nb coups pour trouver code secret
    }
    
}
