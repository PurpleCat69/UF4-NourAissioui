package UF5_Act1.Figures;

import java.util.ArrayList;

public class ProvaInterficie {
	
	public static void main(String[] args) {
		
		ArrayList <Figura> llistat= new ArrayList <Figura>();
		
		Figura quad= new Quadrat(3.5f);
        Figura circ = new Cercle (3.5f); 
        Figura rect = new Rectangle (2.25f, 2.55f); 
        
        llistat.add(quad);
        llistat.add(circ);
        llistat.add(rect);
        
        for(Figura resultat : llistat) {
        	System.out.print(resultat);
        }
        
	}
}
