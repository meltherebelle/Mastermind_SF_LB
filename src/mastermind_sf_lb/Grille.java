/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_sf_lb;
import java.util.Random;

/**
 *
 * @author scottfullagar
 */
public class Grille {

    Cellule CelluleJeu[][] = new Grille[12][4];
    Grille Code[][] = new Grille[1][4];
    

    public Grille() {
        for (int line = 0; line < 12; line++) {
            for (int column = 0; column < 4; column++) {
                CellulesJeu[line][column] = new Cellule();
            }
        }
    }
    
    public String [] Code() {
        
        String Code[] = new String[4];
        
        //creation tableau contenant les 6 couleurs possibles
        String TabCouleur[] = new String[4];
        TabCouleur[0] = "Rouge";
        TabCouleur[1] = "Jaune";
        TabCouleur[2] = "Vert";
        TabCouleur[3] = "Bleu";
        TabCouleur[4] = "Orange";
        TabCouleur[5] = "Magenta";
        
        //tirage aléatoire des couleurs contenues dans le code
        Random rand = new Random();
        for (int i=0; i < 6; i++) {
            int c = rand.nextInt(6);
            Code[i] = TabCouleur[c];
            
        }
        
        System.out.println(Code);
        
        return Code;
    }
    
    
}
