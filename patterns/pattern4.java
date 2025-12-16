public class pattern4 {
 	public static void main(String[] args) {
		System.out.println();
		
		int n= 5;
		
		for(int row=n;row>=1;row--,System.out.println()) 
		{
			for (int col =row ; col>=1 ; col--) {
				System.out.print(col);
			}
				
		}
	}
   
}
