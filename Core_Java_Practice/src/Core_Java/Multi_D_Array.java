package Core_Java;

public class Multi_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] n = {{10,20,30},{40,50,60},{80,90,100}};
		for (int i = 0; i < n.length; i++) 
		{
			for (int j = 0; j < n[i].length; j++) 
			{
				System.out.print(n[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
