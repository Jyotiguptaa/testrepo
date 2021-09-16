package basicone;
import java.util.*;
//Write a class, Grader, which has an instance variable, score, an appropriate constructor
//and appropriate methods. A method, letterGrade() that returns the letter grade as
//O/E/A/B/C/F.
//Now write a demo class to test the Grader class by reading a score from the user, using
//it to create a Grader object after validating that the value is not negative and is not
//greater then 100. Finally, call the letterGrade() method to get and print the grade.
public class Grader {
	
	int score;
	String grade;
	Grader(String name,int hind,int maths,int eng)
	{
		int total=hind+maths+eng;
	    score=total/3;
		System.out.println(name+score);
	}
	
	
	void letterGrade()
	{
		if(score>0 && score<=100) {
			
			if(score>=75)
			{
				grade="A";
				System.out.println(grade);
			}
			else if(score>=50 && score<=74)
			{
				System.out.println("B");
			}
			else if(score >=35 && score<=49 )
			{
				System.out.println("C");
			}
			else if(score>=20 && score<=34)
			{
				System.out.println("D");
			}
			else if(score>=10 && score <=9)
			{
				System.out.println("E");
			}
		else
			{
				System.out.println("O");
			}
		}
	else
		{
			System.out.println("Not Valid");
		}
		
		}
	
	}
	


		
		
	


