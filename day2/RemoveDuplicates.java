package week3.day2;

import java.util.HashSet;
import java.util.Set;

import org.apache.tools.ant.taskdefs.Zip.Duplicate;

public class RemoveDuplicates {

	public static void main(String[] args) {

//		Declare a String as PayPal India
		String input = "PayPal";

//		Convert it into a character array
		char[] chara= input.toCharArray();
		
//		Declare a Set as charSet for Character
		Set<Character> charset = new HashSet<Character>();
		
//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();

//		Iterate character array and add it into charSet
		for(int i=0;i<chara.length;i++)
		{
			if (!charset.add(chara[i]))
			{
				dupCharSet.add(chara[i]);
			}
		}

//		Check the dupCharSet elements and remove those in the charSet		
		charset.removeAll(dupCharSet);
		System.out.println(charset);
		
//		print each character for charSet
		for (Character allchar : charset)
		{
			System.out.println(allchar);
		}
		
	}

}
