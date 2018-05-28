package proyecto;

public class Customer implements IMyDate {
private String rut;
private String name;
private IWebService _ws;

Customer( IWebService iws){
	_ws = iws;
	
}

public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public String getName() {
	return "Customers: " + name;
}
public void setName(String name) {
	this.name = name;
}

	public double getAmount() {
		return 100 * _ws.getTax();
	}
	
	public String ToString() {
		return this.getname() + " Sus Intereses son: " + getAmount();
		
	}
}

