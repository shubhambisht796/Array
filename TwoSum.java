
/* 
	Two Sum 
	
*/
public class TwoSum{
	public static int twoSum(int[] nums, int target){
		int [] result = new int[2];
		for(int i = 0; i< nums.length; i++){
			for(int j = i+1; j< nums.length-1; j++){
				if(nums[i] + nums[j] == target){
					return result{i,j};
				}
			}
		}
		return result{-1,-1};
	}

	public static void main(String [] args){
		int [] arr = new int [];
	
	}
}
