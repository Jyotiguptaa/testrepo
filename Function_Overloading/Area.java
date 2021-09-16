package sixsept;
//q6
public class Area {

	
	void setDim(int length,int bredth) {
		int areaOfrect=length*bredth;
		System.out.println(areaOfrect);
		
	}
	int getarea()
	{
		int length=12;
		int bredth=4;
		int area=length*bredth;
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj=new Area();
		obj.setDim(4, 6);
		int result=obj.getarea();
		System.out.println(result);
		

	}

}
