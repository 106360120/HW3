package test_p22;
public class test_p22 {
	
	public static void main(String[] args)
	{	
	Car car1;
	car1 = new Car();
	car1.setnumgas(1234, 20.5);
	car1.show();
	System.out.println("指定不正確的值看看");
	car1.setnumgas(1234, -10.5);
	car1.show();
	}
}
class Car{
	private int num;
	private double gas;
	
	public void setnumgas(int n,double g){
		if(g>0 & g<100) {
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，汽油輛設為"+gas);
		}
		else {
			System.out.println(g+"不是正確的量");
			System.out.println("無法更改汽油量");
		}
	}
	public void show() {
		System.out.println("車號為"+num+"，汽油輛為"+gas);
	}
	}
