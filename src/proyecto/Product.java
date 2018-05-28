package proyecto;

public class Product implements IMyDate{
	private String codigo;
	private String name;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getName() {
		return "Product" + name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
