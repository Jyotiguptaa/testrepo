package lambdaexpression;

interface prime
{
	public boolean isprime(int n);
}
public class Primeno {

	public static void main(String[] args) {
		prime p1=(n)->
		{
			boolean flag=true;
			if(n==1 || n==2)
			{
				flag=true ;
			}
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
				
			}
			return flag;
		};
		boolean primeno=p1.isprime(8);
		System.out.println((primeno==true)?"Prime":"Not Primeno");
		//System.out.println(str4);
	}

}
