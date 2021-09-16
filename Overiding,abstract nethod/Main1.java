package basicone;

//Write a Java program to show 0-arguments constructor.
//Write a Java program to show parameterized constructor.
//Write a Java program to show constructor overloading.




public class Main1 {
	int length;
	int bredth;
    Main1() //default constructor -0 arguments
	{
		System.out.println("Hello I am default contructor");
	}
    Main1(int a,int b) //parameterized constructor
    {
    	int length=a;
    	int bredth=b;
    	int areaofrect=length*bredth;
    	System.out.println("Area of rectangle"+" "+areaofrect);
    }
	Main1(int l,int b,int h) // function Overloading/ Constructor Overloading
	{
		int areaofcuboid=2*(l*b+b*h+h*l);
		System.out.println("Area od cuboid"+areaofcuboid);
	}
	public static void main(String[] args)
	{
		Main1 obj=new Main1();
		Main1 obj2=new Main1(20,30);
		Main1 obj3=new Main1(12,22,24);
		
	}

}
