package thread;

class threadsleepddemos extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<5;i++)
			{
				Thread.sleep(5000);
				System.out.println(i);			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught"+e);
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
		threadsleepddemos  obj=new threadsleepddemos();
		obj.start();

	}

}
