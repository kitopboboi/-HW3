package HW3;

public class p46 {

	public static void main(String[] args) 
	{
		System.out.println("宣告car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		System.out.println("宣告car2");
		Car car2;
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		car1 = null;
		
		System.out.println("car2的");
		car2.show();

	}

}
