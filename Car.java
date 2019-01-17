package Task;

public class Car extends Vehicle {
	Engine e;
	Fuel f;
	final int reg_no;
	Car(Engine e1, Fuel f1, int tire) {
		e = e1;
		f = f1;
		wheels = tire;
		reg_no = (int)(Math.random()*10000);
	}

	public static void main(String args[]) {
		Fuel f = new Electric();
		Engine e = new HondaEngine();

		Car Car1 = new Car(e, f, 4);

		Car1.e.runs();
		Car1.f.burn();
		System.out.println(Car1.reg_no);
	}
}
