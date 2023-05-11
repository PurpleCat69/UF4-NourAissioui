package UF5_Act5.EmpresaTelematica;

import java.text.ParseException;

public class UserOffer1 extends UserWithOffer{
	
	public UserOffer1(String name, String dni, double priceMinute) {
		super (name, dni, priceMinute);
	}
	
	public double billAmount() {
		double totalMinutes=0;
		double minus=3;
		for (Connection c : connections){
			try {
				totalMinutes += (c.nMinutes()-minus);
			} catch (ParseException error) {
				error.printStackTrace();
			}
			
		}
		return totalMinutes*this.priceMinute;
	}
	
	public String toString() {
		 try {
			return "Dni: "+this.getDni()+"	Nom:"+this.getName()+"	Connexions:"+this.getConnections().size()+"	Minuts:"+this.totalMinutes()+"	Oferta:Si	Factura:"+this.billAmount();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 return"";
	}

}
