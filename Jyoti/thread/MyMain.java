package thread;
//Create a class called MyCurrentDate that implements Runnable interface.
//The MyCurrentDate class displays the current date and time 10 times, with 100 milli seconds interval - use sleep() method for this interval.
//Create a class called MyMain, which contans main() method, in which 3 instances of MyCurrentDate threads are being run.
class MyCurrentDate implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Curremt date is 12-09-2021");
		}
	
	try
	{
		Thread.sleep(100);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
public class MyMain {
	public static void main(String[] args)
	{
		 Thread obj=new Thread(new MyCurrentDate());
		obj.start();
		 
	}

}
