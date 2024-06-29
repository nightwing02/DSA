package debug;
public class Super{
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int currentArea = Math.min(height[left],height[right])*(right-left);

            maxArea = Math.max(currentArea,maxArea);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;
    }
    public static void main(String args[]){
        Super sol = new Super();
        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = sol.maxArea(height);

        System.out.println("Max Area"+result);
    }
}