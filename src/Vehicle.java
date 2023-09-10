import java.lang.reflect.Field;

public class Vehicle {
	int speed = 123334234;
	byte wheels = 4;
	short weight = 2000;
	char fuel = 'D';
	boolean running = false;
	long serial = 123545626345234L;
	double fuelReamining = 100.123456778;
	String make = "Toyota";
	Vehicle toy;
	void accelerate() {
		int count = 0;
		
	}
	public static void main (String[] args) {
		Vehicle myCar = new Vehicle();
		Class<?> clazz = myCar.getClass();
		Field[] fields = clazz.getDeclaredFields();
		PrintValue printer = new PrintValue();
		for (Field field: fields) {
			field.setAccessible(true);
			String fieldName = field.getName();
			printer.printValue(fieldName);
		}
	}
};