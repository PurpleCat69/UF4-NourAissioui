package UF5_Act2.Notícies;

import java.util.ArrayList;

public class GestorNoticies implements GestorNot {

    protected ArrayList<Noticies> llistanoticies = new ArrayList<Noticies>();
    protected ArrayList<Categoria> llistacategories = new ArrayList<Categoria>();

    public void novaCategoria(String nom) {
    	llistacategories.add(new Categoria(nom));
    }


    public void assignaParaulesCategoria(String categoria, String[] paraules) {
    	for (Categoria c : llistacategories) {
            if (c.toString() == categoria) {
            	for (String p: paraules) {
            		c.getParaules().add(p);
            	}
            }
         }
    }


    public void eliminarParaulesCategoria(String categoria, String[] paraules) {
    	for (Categoria c : llistacategories) {
            if (c.toString() == categoria) {
            	for (String p: paraules) {
            		c.getParaules().remove(p);
            	}
            }
         }
    }


    public void novaNoticia(String texto) {
    	Noticies novanoticia = new Noticies (texto);
    	for(Categoria c: llistacategories) {
    		for(String p: c.getParaules()) {
    			if(texto.contains(p)) {
    				c.getLlistanoticies().add(novanoticia);
    				break;
    			}
    		}
    	}
    	llistanoticies.add(new Noticies(texto));
    }


    public void reassignarCategories() {

    }

    public void veureNoticiesCategoria(String cat) {
        for (Categoria c : llistacategories) {
               if (c.toString() == cat) {
            	   System.out.println("<"+c.getNom()+">"+"\n");
            	   for(Noticies n: c.getLlistanoticies()) {
            		   System.out.println(n);
            	   }
            	   System.out.println("\n");
               }
            }
    }

    public void veureCategoriesNoticies() {
    	System.out.println("Noticies \n"+"=============================");
        for (Noticies n : llistanoticies) {
               System.out.println(n);
        }
    }
	
}
