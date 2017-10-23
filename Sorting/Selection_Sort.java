//Key to selection sort is to work with Indices, and not the values of array
public class Selection_Sort
{

	public static void main(String[] args) 
	{
		int A[]= {3,56,12,67,8,0,-3,6,2,4,12,34,56,7,8,90,34,12,13,14,15,51,0,-86,7,2,43,-800,89};
		System.out.println("The given array is:");
		print_array(A);
		System.out.println("Sorted array is:");
		//Time needed to sort the numbers
		long startTime = System.currentTimeMillis();
		selection_sort(A);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Execution Time "+totalTime);
	
	}//End of Main
	static void print_array(int A[])
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+ "|");			
		}	
		System.out.println();
	}
	static void selection_sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int small=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[small])
					small=j;
			}
				int temp=arr[small];
				arr[small]=arr[i];
				arr[i]=temp;
			
		}
		print_array(arr);
	}	
}




