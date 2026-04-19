package Core_Java;

public class Local_Static_Instance_Var {
	
	static int x=10;
	
	int y=10;
	
	void m1()
	{
		int z=100;
		System.out.println(x+y);
		System.out.println(x+y+z);
	}
	
	static void m2()
	{
		int w=20;
		Local_Static_Instance_Var obj1=new Local_Static_Instance_Var();
		System.out.println(w+obj1.y);
		System.out.println(x+w);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local_Static_Instance_Var obj=new Local_Static_Instance_Var();
		System.out.println(obj.y);
		System.out.println(x);
		obj.m1();
		m2();
	}

}
