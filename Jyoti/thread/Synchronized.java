package thread;

class table2 {
	void printtablee(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}

class Mythread1 extends Thread
{
	table2 obj1;
	Mythread1(table2 obj1)
	{
		this.obj1=obj1;
	}
	public void run()
	{
		obj1.printtablee(2);
	}
}

class Mythread2 extends Thread
{
	table2 obj2;
	Mythread2(table2 obj2)
	{
		this.obj2=obj2;
	}
	public void run()
	{
		obj2.printtablee(3);
	}
}
public class Synchronized {
	public static void main(String[] args)
	{
		 table2 obj = new table2();// only one object
	        Mythread1 t1 = new Mythread1(obj);
	        t1.setName("Hwllo");
	        Mythread2 t2 = new Mythread2(obj);
	        t2.setName("World");
	        t1.start();
	        t2.start();
	}

}


