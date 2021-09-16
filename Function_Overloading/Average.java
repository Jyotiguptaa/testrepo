package sixsept;
//qusm 8th
import java.util.*;
public class Average {
	void calculate(int a,int b,int c)
	{
		int average=(a+b+c)/3;
		System.out.print("Average is"+average);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no");
		int first=sc.nextInt();
		System.out.println("Enter 2nd no");
		int second=sc.nextInt();
		System.out.println("Enter 3rd no");
		int third=sc.nextInt();
		Average obj=new Average();
		obj.calculate(first,second,third);

	}

}
