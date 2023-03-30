package Act8_ActivitatInformatica;

import java.util.ArrayList;

public class Botiga {
    private ArrayList<Article> unitats;

    public Botiga() {
        unitats = new ArrayList<Article>();
    }
    public ArrayList<Article> getEstoc() {
        return unitats;
    }
    public void afegirArticle(Article article) {
    	unitats.add(article);
    }
    public void eliminarArticle(Article article) {
    	unitats.remove(article);
    }


    public void llistarEstoc() {
        System.out.printf("CODI		DESCRIPCIO		UNI		CAP/VEL		PREU\n");
        System.out.println("----		----------		----		--------	-----");
        
        int maxcpu=0;
        int maxdiscdur=0;

        for (Article article : unitats) {
            System.out.println(article+"	");

        if (article instanceof DiscDur) {
            DiscDur discDur = (DiscDur) article;
            maxdiscdur+=article.getUnitats();
        }
        if (article instanceof Cpu) {
            Cpu cpu = (Cpu) article;
            maxcpu+=article.getUnitats();

        }
      }
        System.out.println("  ");
        System.out.println("Nombre total de CPUs en estoc: "+maxdiscdur);
        System.out.println("Nombre total de CPUs en estoc: "+maxcpu);
        System.out.println("\n Valor total de l'estoc: "+calcularPreuFinal()+"€");
        System.out.println("------------------------------------------------------");
    }
    
    public float calcularPreuFinal() {
        float valorUnitats = 0;
         for (Article article : unitats) {
             valorUnitats += article.calcularPreuFinal() * article.getUnitats();
         }
         return valorUnitats;
     }
}

