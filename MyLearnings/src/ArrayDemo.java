
public class ArrayDemo {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int b[]= {4,5,6};
		int c[]= {3,4,5,6,7};
		int d[][]=
			{
					a,b,c
					
			};
		
		for(int k[]:d)
		{
			for(int l:k)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
