public class Insertion_Sort 
{
	public static void main(String[] args) 
	{
		int A[]= {3,56,12,67,8,0,-3,6,2,4,12,34,56,7,8,90,34,12,13,14,15,51,0};
		System.out.println("The given array is:");
		print_array(A);
		System.out.println("Sorted array is:");
		//Time needed to sort the numbers
		long startTime = System.currentTimeMillis();
		insertion_sort(A);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Execution Time "+totalTime);
	}
	//Function to print contents of array
	static void print_array(int A[])
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+ "|");			
		}	
		System.out.println();
	}
	//Function to perform insertion sort
	static void insertion_sort(int p[])
	{
		int n=p.length;
		for (int j=1;j<n;j++)
	{
		int key=p[j]; //Compare p[1] with p[0]
		int i=j-1;
		while(i>-1 && p[i]>key)// Ascending order insertion sort, for descending, reverse to p[i]<key
		{
			p[i+1]=p[i];
			i--;
		}
		p[i+1]=key;
		
	}
	print_array(p);// End of for
 }// End of insertion sort
}//End of Class
