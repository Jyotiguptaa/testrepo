package thread;
//Write a program to illustrate creation of threads using runnable
//class.(start method start each of the newly created thread. Inside the run
//method there is sleep() for suspend the thread for 5000 milliseconds).

class hello implements Runnable
{
	public void run()
	{ try {
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello world");
			Thread.sleep(5000);
		}
	}
	catch(Exception e)
	{
		System.out.println("Exception"+e);
	}
	}
}

public class Mymain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new hello());
		t1.start();

	}

}
