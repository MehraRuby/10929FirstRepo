package FunctionBasedQuestions;

/*function to remove duplicate characters and return unique string as well as 
 * totals characters in a string as a return type
 */

import java.util.TreeSet;

public class RemoveDuplicateCharacters 
{
	
	String[] removeDuplicate(String str)
	{
		int count=0;
		TreeSet<Character> T = new TreeSet<Character>();
		for(int i=0;i < str.length();i++)
		{
			char ch = str.charAt(i);
			T.add(ch);			
		}
		
		String st="";
		for(Character c : T)
		{
			st = st + c;
			count++;
		}
		
		String arr[] = {st,String.valueOf(count)};
		return arr;
			
	}
	

	public static void main(String[] args) 
	{
		RemoveDuplicateCharacters obj = new RemoveDuplicateCharacters();
		String result[] = obj.removeDuplicate("Programming language");
		
		for(String s : result) {
			System.out.println(s);
		}
		
	}

}
