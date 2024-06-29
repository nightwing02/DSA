package debug;

public class prac {
	public static void main(String args[]) {
		int nums[] = {12,3,5,4,6};
		int n=nums.length;
		for(int i=0;i<n;i++)
		System.out.println(nums[i]);
		if(nums[n-1]!=0) {
			nums[n-1]=nums[n-1]+1;
		}else {
			
		}
		System.out.println("After operation");
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
	}
}
