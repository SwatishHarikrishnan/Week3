package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> input1 = new ArrayList<String>();
		input1.add("HCL"); //adding index 0 as HCL
		input1.add("Wipro"); //adding index 1 as wipro
		input1.add("Aspire Systems"); // adding index 2 as aspire systems
		input1.add("CTS"); // adding index 3 as CRS

//		get the length of the array		
		//System.out.println("The length of the array is : " +input.length); //array
		System.out.println("The length of the array is : " +input1.size()); //list - finding the total size of it

//		sort the array			
		//Arrays.sort(input);
		Collections.sort(input1); //sorted the input
		//System.out.println(input1);
		//Collections.sort(input1, Collections.reverseOrder());
		//System.out.println(input1);
		
//		Iterate it in the reverse order and printing the array
		
//		for(int i=input.length-1;i>=0;i--)
//		{
//			System.out.print(" " +input[i]);
//		}
		for(int i=input1.size()-1;i>=0;i--)
		{
			System.out.print(" " +input1.get(i));	//iterated over the loop and printing from index 		
		}
		

//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
