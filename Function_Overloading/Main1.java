package sixsept;
//q3
class Traingle
{
    int s1=3;
    int s2=4;
    int s3=5;
    
    void showarea()
    {
        int Areaoftraingle=(s1*s2)/2;
        System.out.println("Area of traingle"+" "+Areaoftraingle);
    }
    
     void showperimeter()
    {
        int Perimetertraingle=(s1+s2+s3);
        System.out.println("Perimeter of traingle"+" "+Perimetertraingle);
    }
    
   
}
public class Main1
{
	public static void main(String[] args) {
	    Traingle area=new Traingle();
	    
	    area.showarea();
	    area.showperimeter();
	    
	    
	
	}
}

