package proyecto;

public class Customer implements IMyDate {
private String rut;
private String name;
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

}

