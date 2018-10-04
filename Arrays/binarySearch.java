// Binary Search in Java
//Author: Diana Mascarenhas

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch 
{
	
public static void main(String args[])
{
Search obj= new Search();
int a[]= {14,1,19,34,-4,9,87,2};
Scanner sc= new Scanner(System.in);
System.out.println("Enter element to be searched");
int search = sc.nextInt();
Arrays.sort(a);
System.out.println("Sorted array is as shown:");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");	
}
System.out.println();
int x = obj.binSearch(a, 0, a.length-1, search);
if(x== -1)
	System.out.println("Element Not found");
else
	System.out.println("Element Found at "+x);
}

}

class Search
{
	public int binSearch(int a[], int low, int high, int x)
	{
		int mid;
		if(high>=low)
		{
		mid = low +(high-1)/2;
		if(a[mid]==x)
			return mid;
		else if(x>a[mid])
			return binSearch(a, mid+1, high, x);
		else
			return binSearch(a, low, mid-1, x);	
		}
		return -1;
	}
}



