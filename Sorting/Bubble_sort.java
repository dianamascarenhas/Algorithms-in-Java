
public class Bubble_sort {

	public static void main(String[] args) {
		int A[]= {3,56,12,67,8,0,-3,6,2,4,12,34,56,7,8,90,34,12,13,14,15,51,0,-86,7,2,43,-800};
		System.out.println("The given array is:");
		print_array(A);
		System.out.println("Sorted array is:");
		//Time needed to sort the numbers
		long startTime = System.currentTimeMillis();
		bubble_sort(A);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Execution Time "+totalTime);
	
	}
	static void print_array(int A[])
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+ "|");			
		}	
		System.out.println();
	}
	//Function to perform Bubble sort
	static void bubble_sort(int p[])
	{
		for(int i=0;i<p.length-1;i++)
		{
			for(int j=0;j<p.length-1-i;j++)
			{
				if(p[j]>p[j+1])
				{
					int temp= p[j];
					p[j]=p[j+1];
					p[j+1]=temp;	
				}	
			}
		}
	print_array(p);// End of for
 }// End of bubble sort


}
