package eigthsept;

//Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for
//class B and display the text “call me from B”.
abstract class base {
	abstract void display();
	void show() {
		
	}

}

class B extends base {

	void display() {
		System.out.println("Call me from B");

	}
}
public class AbstractMaindemo {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();

	}
}