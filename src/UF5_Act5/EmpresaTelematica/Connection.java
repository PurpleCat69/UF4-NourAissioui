package UF5_Act5.EmpresaTelematica;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;

public class Connection {
	private String iniDateTime;
	private String endDateTime;
	
	public Connection(String iniDateTime, String endDateTime) {
		this.iniDateTime=iniDateTime;
		this.endDateTime=endDateTime;
	}
	
	public long nMinutes() throws ParseException {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyy-hh:mm");
		Date fecha1 = formatoFecha.parse(iniDateTime);
		Date fecha2 = formatoFecha.parse(endDateTime);
		long tiempo= (long) TimeUnit.MILLISECONDS.toMinutes(fecha2.getTime()-fecha1.getTime());
		return tiempo;
	}

}
