/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastermind_sf_lb;

/**
 *
 * @author leaburriat
 */
public class Mastermind_SF_LB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Combinaison cs = new Combinaison();
        cs.combinaisonSecrete(); //génère une combinaison secrete
        
        Combinaison cc = new Combinaison();
        cc.combinaisonChoisie();
        
    }
    
}
