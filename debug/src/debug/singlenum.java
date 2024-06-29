package debug;

public class singlenum {
	public int singleNum(int[] nums) {
		int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
	}
	
	public static void main(String args[]) {
		singlenum obj = new singlenum();
		int[] nums = {1,4,2,1,2};
		int result = obj.singleNum(nums);
		System.out.println(result);
		
	}
}

		
	

