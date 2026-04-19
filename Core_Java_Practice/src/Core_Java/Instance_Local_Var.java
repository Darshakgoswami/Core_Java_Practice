package Core_Java;

public class Instance_Local_Var {
	
	int x=200;
	
	void m1()
	{
		int y=100;
		System.out.println(x+y);
	}
	
	void m2()
	{
		int z=10;
		System.out.println(x+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Local_Var obj = new Instance_Local_Var();
		obj.m1();
		obj.m2();
	}

}
