package HW3;

public class p17 {

	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234, 20.5);
		int number = car1.getGas();
		System.out.println("調查樣品車時的知");
		System.out.println("車號是" + number + ", 汽油量是" + gasoline);
	}
}

//Car顆別
class Car
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設爲" + num + ", 汽油量設爲" + gas);
	}
}