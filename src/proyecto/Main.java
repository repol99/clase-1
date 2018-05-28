package proyecto;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMyDate di;
		java.util.List<IMyDate> lstObjects = new ArrayList<IMyDate>();
		
		Product p = new Product();
		p.setCodigo("myCode");
		p.setName("martillo");
		lstObjects.add(p);
/*		
		Customer c = new Customer();
		c.setRut("1.9");
		c.setName("Don pepe");
		lstObjects.add(c);
*/
		
		Employee e = new Employee();
		e.setRut("2.7");
		e.setName("Juanito");
		lstObjects.add(e);
		
		Car car = new Car();
		car.setCode("mycodecar");
		car.setName("Ford");
		lstObjects.add(car);
		
		for( IMyDate cur : lstObjects) {
			System.out.println(cur.getname());
		}
		
		WebServiceMock wsm = new WebServiceMock();
		
		Customer cc = new Customer(wsm);
		System.out.println(cc.getAmount());
		
	}
}
