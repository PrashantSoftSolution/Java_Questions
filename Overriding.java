class Overriding {
				void demo() {
					System.out.println("Parent class messege ");
}
}

class Child extends Overriding{
	void demo() {
		System.out.println("child class messege ");
	}
	public static void main(String[] args) {
				Child ch= new Child();
				ch.demo();
	}
	
}
/*class Display {
	public static void main(String[] args) {
		Child ch= new Child();
		ch.demo();
	}
}
*/
