package sixsept;
//q5
public class Rectangle {
int Area(int l,int b)
{
	int area=l*b;
	return area;
	
}
public static void main(String[] args)
{
	Rectangle obj=new Rectangle();
	int result=obj.Area(3,2);
	System.out.println("Areaof rect"+result);
}
}
