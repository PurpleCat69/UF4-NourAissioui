package Act7_ActAquari;

import java.util.ArrayList;

public class AquariTest {
	
	public static void dadesOrganisme (Organisme o) {
		if (o instanceof Peix) {
			Peix peix = (Peix)o;
			System.out.println(peix.dadesMostrar());
		}
		if (o instanceof Planta) {
			Planta planta = (Planta)o;
			System.out.println(planta.dadesMostrar());
		}
	}

	public static void main(String[] args) {
	
		ArrayList <Organisme> aquari= new ArrayList <Organisme>();
		
		Peix peix1 = new Peix("peix 1","peixos",'A',12,14,6,7,"Mediterrani",'A',34);
		Peix peix2 = new Peix("peix 2","peixos",'B',11,13,4,6,"Mediterrani",'O',34);
		Peix peix3 = new Peix("peix 3","peixos",'M',2,10,3,5,"Mediterrani",'F',34);

		Planta planta1 = new Planta("planta 1","plantes",'B',18,19,6,9,'T');
		Planta planta2 = new Planta("planta 2","plantes",'M',15,17,7,8,'B');
		Planta planta3 = new Planta("planta 3","plantes",'A',20,23,3,5,'A');
		
		aquari.add(peix1);
		aquari.add(peix2);
		aquari.add(peix3);
		
		aquari.add(planta1);
		aquari.add(planta2);
		aquari.add(planta3);
	
		for (Organisme o : aquari) {
			dadesOrganisme(o);
			System.out.println("********");
		}
	}

}
