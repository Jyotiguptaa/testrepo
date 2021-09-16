package sixsept;
//qusn2
class students1
{
    int rollno;
    long phno;
    String Address;
    void samresult(int rollno,long phno,String Address)
    {
        System.out.println("Sam"+" "+rollno+" "+"phoneno "+" "+phno+" "+"Addresssis"+" "+Address);
        
    }
    void Johnresult(int rollno,long phno,String Address)
    {
        System.out.println("John "+" "+rollno+" "+"phoneno "+" "+phno+" "+"Addresssis"+" "+Address);
        
    }
}
public class Main
{
	public static void main(String[] args) {
	students1 sam =new students1();
	students1 john =new students1();
	sam.samresult(1,678678905,"Prem nagar");
	john.Johnresult(2,993456789,"Vijay nagar");
	
	}
}
