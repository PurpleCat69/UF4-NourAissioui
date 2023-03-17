package actConcessionari;

public class Concesionario{
	private Coche [] nuevoCoche;
	private int contador=0;

		public Concesionario () {
		     this.nuevoCoche =  new Coche [10];
		     contador=0;
		}
		public Concesionario (int max, int contador) {
	        this.nuevoCoche =  new Coche [max];
	        this.contador = contador;
	    }
		public Coche[] getNuevoCoche() {
			return nuevoCoche;
		}
		public void setNuevoCoche(Coche[] nuevoCoche) {
			this.nuevoCoche = nuevoCoche;
		}
		public void nuevoCoche(Coche coche) {
			this.nuevoCoche[contador]=coche;
			this.contador++;
		}
		public Coche buscaCoche(String bastidor) {
			for(Coche c: this.nuevoCoche) {
				if(c.getBastidor() == bastidor) {
					return c;
				}
			}
			return null;
		}
		public String toString() {
	        String result = " ";
	       for(Coche c: this.nuevoCoche) {
	        if (c!=null) {
	        	result = result + c.toString()+"\n";
	        }
	    }
	       return result;
	  }
  }
