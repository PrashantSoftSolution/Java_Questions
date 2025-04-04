
class Overloading {
	void demo(int x, float y) {
		
			System.out.println("1st Done");
		}
	void demo(String x,  double y) {
		
		System.out.println("2nd Done");
	}
	void demo(float x, int y) {
		System.out.println("3rd Done");	
	}
}

class Demo1 extends Overloading{
			public static void main(String[] args) {
				  
				Overloading obj = new Overloading();
				obj.demo("Bacche", 2.9);
				
			}
}

