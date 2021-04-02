package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {

		int[] nums= {2,7,11,15};
		int target=9;
		Map<Integer, Integer> index=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			index.put(nums[i], target-nums[i]);
			if(index.containsValue(target))
			{
				System.out.println(nums[i]);
			}
		}
	}

}
