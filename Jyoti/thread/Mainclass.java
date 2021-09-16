package thread;

 class base implements Runnable{
	
	public void run()
	{
		try
		{
			System.out.println("List of Thread running"+Thread.currentThread());
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
		}
	}
	
	
}

public class Mainclass
{
	public static void main(String[] args)
	{
		int noofthread=2;
		for(int i=0;i<noofthread;i++)
		{
			Thread obj=new Thread(new base());
			obj.start();
			obj.setName("Ayush");
			obj.setPriority(8);
			
	}
		
	}
}
