package HW3;

public class p15 {

	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
	}
}

//Car顆別
class Car
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設爲" + num + ", 汽油量設爲" + gas);
	}
	
	void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}