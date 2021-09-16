package sixsept;
//q4
class Trangle
{
  int s1;
  int s2;
  int s3;
  
  Trangle(int side1,int side2,int side3)
  {
      s1=side1;
      s2=side2;
      s3=side3;
  
  }
  void print()
  {
       int peri=s1+s2+s3;
       int area=(s1*s2)/2;
       System.out.println("Perimeter of traingle"+" "+peri);
       System.out.println("Area of traingle"+" "+area);
  
  }
 
}
public class Traingle1
{
	public static void main(String[] args) {
	    Trangle area=new Trangle(5,6,4);
	    
	    area.print();
	    //area.showperimeter();
	    
	    
	
	}
}
