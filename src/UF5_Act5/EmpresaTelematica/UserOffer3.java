package UF5_Act5.EmpresaTelematica;

import java.text.ParseException;

public class UserOffer3 extends UserWithOffer {
	
	public UserOffer3(String name, String dni, double priceMinute) {
		super (name, dni, priceMinute);
	}

	public double billAmount() {
		double totalBill=0;
		double largerMinute=0;
		for (Connection c : connections){
			try {
				totalBill += c.nMinutes();
				double minutes = c.nMinutes();
				if(minutes>largerMinute) {
					largerMinute=minutes;
				}
			} catch (ParseException error) {
				error.printStackTrace();
			}
		}
		totalBill-=largerMinute;
		return totalBill*this.priceMinute;
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
