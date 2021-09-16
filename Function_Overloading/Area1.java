package sixsept;
//7th
import java.util.*;
public class Area1 {
	

   int returnArea(int l,int b) {
	int area=l*b;
	return area;
}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter Bredth");
		int bredth=sc.nextInt();
	    Area1 obj =new Area1();
	    int result=obj.returnArea(length, bredth);
	    System.out.println("Area of Rectangle "+result);
	
	}

}
