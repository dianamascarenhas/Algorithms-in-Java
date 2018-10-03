// Rotate an array of size n by d elements
// Author: Diana Mascarenhas

package arrays;
import java.util.Scanner;

class rotate
{
public static int[] rotate_arr(int arr[], int n, int r)
{
	int j,temp=arr[0];
		for(j=0;j<n-1;j++)
		{
			arr[j] = arr[j+1];	
		}
		arr[j] =temp;
		
	return arr;
}
public void printArray(int arr[])
{
	System.out.println("Array elements after rotation are:");
for(int i=0;i<arr.length;i++)
{
System.out.print("" +arr[i]);	
}
}
}

public class oneDimArrayRotation 
{
public static void main(String args[])
{
Scanner sc =  new Scanner(System.in);
rotate obj = new rotate();
int arr[] = {2,3,4,5,6,7,8,9};
System.out.println("By How many elements is the array supposed to be rotated?");
int n = sc.nextInt();
for(int i=0;i<n;i++)
{
obj.rotate_arr(arr, arr.length, n);
}
obj.printArray(arr);
}
}

/* Output:
By How many elements is the array supposed to be rotated?
3
Array elements after rotation are:
56789234*/
