package UF5_Act2.Notícies;

public class UsaGestorNoticies {

	public static void main(String[] args) {

		GestorNoticies gestor = new GestorNoticies();

        gestor.novaCategoria("Deportes");
        String[] pDeportes = {"deporte","futbol","deportista","atleta","balon","competicion","partido","olimpico"};
        gestor.assignaParaulesCategoria("Deportes", pDeportes);

        gestor.novaCategoria("Religion");
        String[] pReligion = {"iglesia","biblia","cura","obispo","sagrado","religion","cristiano","Dios"};
        gestor.assignaParaulesCategoria("Religion", pReligion);
        
        gestor.novaCategoria("Politica");
        String[] pPolitica = {"presidente","ministro","politico","partido","congreso","corrupcion","pp","psoe"};
        gestor.assignaParaulesCategoria("Politica", pPolitica);
        
        gestor.novaCategoria("Espectaculo");
        String[] pEspectaculo = {"cine","teatro","actor","artista","actriz","pelicula","oscar","estrella"};
        gestor.assignaParaulesCategoria("Espectaculo", pEspectaculo);
        

        gestor.novaNoticia("El partido del Nastic contra el Barça ha sido todo un espectaculo");
        gestor.novaNoticia("Los colegios publicos se han sumado a la huelga contra la contaminacion y a favor del medio ambiente");
        gestor.novaNoticia("La mocion de censura ha prosperado y ha hecho dimitir al presidente");
        gestor.novaNoticia("Por termino medio los españoles gastan mas dinero en el futbol que en el teatro");
        gestor.novaNoticia("La domotica se consolida como un valor en alza dentro de las nuevas tecnologias");
        gestor.novaNoticia("El Papa nombra a Thanos nuevo ministro de la iglesia");
        gestor.novaNoticia("Cientificos chinos aseguran que han encontrado la cura del cancer");
        gestor.novaNoticia("Se instalan inhibidores de frecuencia para evitar llamadas de telefono en el cine");
        gestor.novaNoticia("Despues del partido la prensa definio a Leo Messi como un artista del balon");
        gestor.novaNoticia("El congreso decidira hoy si aprueba la wifi gratuita");

        gestor.veureNoticiesCategoria("Deportes");
        gestor.veureNoticiesCategoria("Politica");
        gestor.veureCategoriesNoticies();

        System.out.println("=========================================\n");

        String[] paraulesAEliminar = {"partido"};

        gestor.eliminarParaulesCategoria("Politica", paraulesAEliminar);
        gestor.eliminarParaulesCategoria("Deportes", paraulesAEliminar);

        gestor.novaCategoria("Tecnologia");
        String[] pTecnologia = {"telefono","ciencia","tecnologia","ordenador","domotica","informatica","movil","wifi"};
        gestor.assignaParaulesCategoria("Tecnologia", pTecnologia);

        gestor.reassignarCategories();

        gestor.veureNoticiesCategoria("Tecnologia");
        gestor.veureNoticiesCategoria("Politica");
        gestor.veureCategoriesNoticies();

    }

}
