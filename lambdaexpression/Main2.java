package lambdaexpression;
import java.util.Scanner;
/*Write the following methods that return a lambda expression performing a specified action:
PerformOperation isOdd(): The lambda expression must return true if a number is odd or  if it is even.
PerformOperation isPrime(): The lambda expression must return  true if a number is prime or  if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or  if it is
 not
.
Input Format*/
//interface nopara
//{
//	//
//}
interface Odd1
{
	public void PerformOperationisOdd(int n);
}
interface Hello
{
	public void student(int a,int b);
}
//interface Palindrome
//{
//	public void ispalindrome();
//}
public class Main2 {
public static void main(String[] args) {
//	 Odd1 o1=(n)->
//	{
//		if(n%2==0)
//		{
//			System.out.println("Evenno");
//		}
//		else
//		{
//			System.out.println("Oddno");
//		}
//	};
		
	Odd1 o2=(n)->{String str= n%2==0?"Even":"Odd";System.out.println(str);};
	o2.PerformOperationisOdd(5);
	Hello h1=(m1,m2)->{
		int result=m1+m2;
		System.out.println( result>=70?" Can Sit for Placement":"Cannot sit for placement");
	
	};
	h1.student(44, 32);
}
}
