package Core_Java;

public class Static_Instance_Var {
	
	static int x=100;
	
	int y=10;
	
	static void m1()
	{
		System.out.println("static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Instance_Var obj=new Static_Instance_Var();
		System.out.println(x);
		System.out.println(obj.y);
		m1();
	}

}
