public class pattern {
		
	public static void main(String[] args) {
		System.out.println();
		
		int n= 5;
		
		for(int row=n;row>=1;row--,System.out.println()) 
		{
			for (int col =row ; col<=n ; col++) {
				System.out.print(col);
			}
				
		}
	}
}