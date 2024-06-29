package debug;

public class Answer {
	public int[] twosum(int[] nums,int target) {
		
		int n = nums.length;
		for(int i = 0;i<n-1;i++) {
			for(int j = i;j<n;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
	}	
	public static void main(String args[]) {
		Answer sol = new Answer();
		int[] nums = {2,5,48,6,2,4,5};
		int target = 9;
		int[] result = sol.twosum(nums, target);
		System.out.print(result[0]+" "+result[1]);
		
	}
}
