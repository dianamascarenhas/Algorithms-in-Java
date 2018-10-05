
//Concatenate Strings using StringBuilder(non thread safe)
//Author: Diana Mascarenhas

public class stringConcatUsingStringBuilder 
{
	public static void main(String args[])
	{
		String a[] = {"I love java", "Programming is Fun"};
		String b[] = {"Practice","Makes a Man Perfect"};
		// StringBuilder is not thread Safe, and hence is faster
		//if you are in a single threaded environment or don’t care about thread safety, you should use StringBuilder else use StringBuffer
		//StringBuilder is more faster than StringBuffer, all methods of StringBuffer are synchronized and thread safe
		StringBuilder sb= new StringBuilder();
		for(String word: a)
		{
			sb.append(word).append("\n");
		}
		for(String word: b)
		{
			sb.append(word).append("\n");
		}
		System.out.println(sb.toString());
		System.out.println("Inserting at position 3");
		sb.insert(10, "a lot of");
		System.out.println(sb.toString());
	}
}
