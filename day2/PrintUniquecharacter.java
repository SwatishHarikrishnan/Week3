package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniquecharacter {

	public static void main(String[] args) {

		String companyName = "TESTLEAF";
		char[] character= companyName.toCharArray();
		Set<Character> unique= new HashSet<Character>();
		for(int i =0;i<companyName.length();i++)
		{
			if(unique.add(character[i]))
			{
				System.out.print(character[i]);
			}
		}
	}

}
