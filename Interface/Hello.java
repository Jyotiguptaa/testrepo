package basicone;
//Write a java program in which you will declare two
//interface sum and Add inherits these interface through class A1
//and display their content.
interface Sum1{
	void sumnumbers();
}
interface add
{
	void addstrings();
}
class A1 implements Sum1,add
{
	public void sumnumbers()
	{
		int a=2;
		int b=3;
		int total=a+b;
		System.out.println(total);
	}


	public void addstrings() {
		// TODO Auto-generated method stub
			String a1="e3";
			String b1="ee";
			String total=a1+b1;
			System.out.println(total);
		}	
		
}	

public class Hello {
	public static void main(String[] args) {
A1 ob=new A1();
ob.sumnumbers();
ob.addstrings();

}
}