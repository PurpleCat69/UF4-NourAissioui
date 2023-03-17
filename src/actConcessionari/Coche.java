package actConcessionari;

public class Coche {
	private String bastidor;
	private String marca;
	private String modelo;

	public Coche (String bastidor) {
		this.bastidor = bastidor;
	}
	public Coche (String bastidor, String marca, String modelo){
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {
        return "Coche: "+ marca + ". Modelo: " + modelo + ". Bastidor: "+bastidor;
    }
}
