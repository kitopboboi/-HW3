package HW3;

public class p12 {

	public static void main(String[] args) 
	{
		Car1 car1;
		car1 = new Car1();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();

	}
}
//Car顆別
class Car1
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是"+ this.gas);
	}
	
	void showCar()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}

