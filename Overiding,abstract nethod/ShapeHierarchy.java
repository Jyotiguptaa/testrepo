package basicone;
abstract class twod
{
	abstract void getarea() ;
}
abstract class threed
{
	abstract void getarea();
	
	abstract void getvolume();
	
}
class twodimplementation extends twod {
	
	 void getarea() {
		System.out.println("hello area");
	}
}
class threedimplementation extends threed {
	
	 void getarea() {
		System.out.println("hello area in 3d");
	}

	void getvolume() {
		// TODO Auto-generated method stub
		System.out.println("hello volume in 3d");
		
	}
	 
}


public class ShapeHierarchy  {
	public static void main(String[] args)
	{
		twodimplementation obj=new twodimplementation();
		threedimplementation obj2=new threedimplementation();
		obj2.getarea();
		obj2.getvolume();
		obj.getarea();
		
	}

}
