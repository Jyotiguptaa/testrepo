package thread;
class table
{
	void printtable(int n){
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
		}
		try
		{
			Thread.sleep(6000);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



class Thread1 extends Thread {
table t1;
Thread1(table t1)
{
	this.t1=t1;
}
public void run()
{
	t1.printtable(5);
}

}
class Thread2 extends Thread
{
	table t2;
	Thread2(table t2)
	{
		this.t2=t2;
	}
	public void run()
	{
		t2.printtable(6);
	}
}


class Asynchronus{
	public static void main(String[] args)
	{
		table obj = new table();// only one object
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
	}
}
