class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        int sum =0;
        for(int i = 0;i<len;i++){
            sum = sum + num[i];
        }
        sum = sum + k;
        String temp = Integer.toString(sum);

        int[] num = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++){
            num[i] = temp.charAt(i) - '0';  
        }
        List<Integer> list=new ArrayList<>(Arrays.asList(num));

       return list;
    }
}
