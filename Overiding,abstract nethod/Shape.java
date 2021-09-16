package basicone;

 class Shapes{
	
	void draw()
	{
		System.out.println("Hi I am draw funct of Shape class");
	}
	void erase()
	{
		System.out.println("Hi I am erase funct of Shape class");
	}

}
class circle extends Shapes
{
	void draw()
	{
		System.out.println("Hi I am draw funct of circle class");
	}
	void erase()
	{
		System.out.println("Hi I am erase funct of circle class");
	}
}

class traingle extends circle
{
	void draw()
	{
		System.out.println("Hi I am draw funct of traingle class");
	}
	void erase()
	{
		System.out.println("Hi I am erase funct of traingle class");
	}
	
}
class square extends traingle
{
	void draw()
	{
		System.out.println("Hi I am draw funct of square class");
	}
	void erase()
	{
		System.out.println("Hi I am erase funct of traingle class");
	}
}
class Shape
{
	public static void main(String[] args)
	{
		Shapes obj1 =new Shapes();
		Shapes obj2 =new traingle();
		Shapes obj3=new circle();
		Shapes obj4=new square();
		obj4.draw();
		obj2.erase();
		
		
		
	}
}
