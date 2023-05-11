package UF5_Act5.EmpresaTelematica;
import java.text.ParseException;
import java.util.*;

public abstract class User {
	private String dni;
	private String name;
	protected double priceMinute;
	protected HashSet<Connection> connections = new  HashSet<Connection>();
	
	public  User (String dni, String name, double priceMinute) {
		this.name=name;
		this.dni=dni;
		this.priceMinute=priceMinute;
		this.connections = new HashSet<Connection>();
	}

	public String getDni() {
		return dni;
	}
	public String getName() {
		return name;
	}
	
    public boolean add(Connection c) {
        return connections.add(c);
    }
    
    public double totalMinutes() throws ParseException {
    	double totalMinutes = 0;
    	for(Connection c : connections) {
    		totalMinutes += c.nMinutes();
    	}
		return totalMinutes;
    }

    public HashSet<Connection> getConnections() {
        return connections;
    }

    public void reset() {
        connections.clear();
    }
    
    public abstract double billAmount();

}
