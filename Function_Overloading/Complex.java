package sixsept;
//q9
import java.util.*;
public class Complex {
	void add(double a,double b)
	{
		double sum=a+b;
		System.out.println("Add"+sum);
	}
	
	void difference(double a,double b) {
		double diff=a-b;
		System.out.println("Sub"+diff);
		
	}
	
	void product(double a,double b)
	{
		double prod=a*b;
		System.out.println("Product"+prod);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr real part");
		double real=sc.nextDouble();
		System.out.print("Enetr complex part");
		double imag=sc.nextDouble();
		Complex obj=new Complex();
		obj.add(real, imag);
		obj.difference(real, imag);
		obj.product(real, imag);
		
		
		
	}

}
