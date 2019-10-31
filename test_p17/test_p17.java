package test_p17;

public class test_p17 {
	
	public static void main(String[] args)
	{	
	Car car1;
	car1 = new Car();
	car1.setnumgas(1234,20.5);
	int number = car1.getnum();
	double gasline = car1.getgas();
	System.out.println("調查樣品得知");
	System.out.println("將車號"+number+"，汽油輛是"+gasline);
	}
}
class Car{
	int num;
	double gas;
	
	int getnum() {
		System.out.println("調查車號");
		return num;
	}
	double getgas() {
		System.out.println("調查車油量");
		return gas;
	}
	
	void setnumgas(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油輛設為"+gas);
	}
	
	}
