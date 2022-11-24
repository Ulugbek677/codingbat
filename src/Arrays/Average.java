package Arrays;

public class Average {
    public static void main(String[] args) {
        int [] nums = {2, 7, 6, 2, 6, 7, 2, 7};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==6) {
                i++;
                while (nums[i]!=7){
                    i++;
                }

            }
            sum+=nums[i];
        }
        if(nums[nums.length-1]==7){
            sum-=7;
        }
        System.out.println(sum);
        System.out.println(20%10);
    }
}
