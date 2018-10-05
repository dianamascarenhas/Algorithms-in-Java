// Using ArrayList to concatenate 2 strings in Java
//Author: Diana Mascarenhas

package chp1Arrays$Strings;

import java.util.ArrayList;

public class stringConcatUsingArrList {
	public static void main(String args[])
	{
		String arr1[] = {"Ed Sheeran", "Camilla"};
		
		String arr2[] = new String[2];
		arr2[0]="Pink";
		arr2[1]="Floyd";
		
		//Creating an ArrayList to concatenate both the strings into one string
		ArrayList<String> al= new ArrayList<String>();
		for(String a:arr1)
		{
			al.add(a);
		}
		for(String b:arr2)
		{
			al.add(b);
		}
		System.out.println("Printing" +al);
		
	}

}
