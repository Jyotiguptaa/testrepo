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
interface Odd
{
	public int PerformOperationisOdd(int n);
}
//interface Prime
//{
//	public void isPrime();
//}
//interface Palindrome
//{
//	public void ispalindrome();
//}
public class MainFirst {
public static void main(String[] args) {
	 Odd o1=(n)->
	{
		if(n%2==0)
		{
			return 0;
		}
		else
		{
		return 1;
		}
	};
		
	int result=o1.PerformOperationisOdd(5);
	System.out.println("Given no. is "+(result==0?"Even":"Odd"));
}
}
