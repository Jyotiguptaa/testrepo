package sixsept;
//ques1
 class detail
{
    String name;
    int rollno;
    void result(String name,int rollno)
    {
        System.out.println("Name is "+name+"Rollno "+rollno);
    }
}
public class student
{
	public static void main(String[] args) {
	detail obj =new detail();
	obj.result("Jyoti",5);
	}
}
