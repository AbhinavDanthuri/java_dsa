public class two_sum_II {

    public static int[] Twosum(int[]numbers,int target){
        int left=0,right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target)
                return new int[]{left+1,right+1};
            else if(sum<target)
                left++;
            else right--;
        }
        return new int[]{-1,-1};

    }

    public static void main(String args[]){
        int nums[]={2,3,5,6,7};
        int target=9;
        int[] result=Twosum(nums,target);
        System.out.println(result[0]+","+result[1]);

    }
}
