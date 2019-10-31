package test_p15;
public class test_p15 {
	
	public static void main(String[] args)
	{	
	Car car1;
	car1 = new Car();
	int number = 1234;
	double gasline = 20.5;
	car1.setnumgas(number,gasline);
	}
}
class Car{
	int num;
	double gas;
	
	void setnumgas(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油輛設為"+gas);
	}
	
	}
