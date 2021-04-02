package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {

//		PseudoCode:
		
//			1. Create a String with your name as value
			String name = "swatishharikrishnan";
		
//			2. Convert the string into a char array
			char[] character= name.toCharArray();
			
//			3. Create an empty Map<Character,Integer>
			Map<Character, Integer> charoccur= new HashMap<Character, Integer>();
			
//			4. Iterate over the array
			for(int i=0;i<character.length;i++)
			{
				if(charoccur.containsKey(character[i]))
				{
					charoccur.put(character[i], charoccur.get(character[i])+1);
				}
				else
				{
					charoccur.put(character[i], 1);
				}
			}
			System.out.println(charoccur);
	}

}
