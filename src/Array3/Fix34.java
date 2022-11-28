package Array3;

import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args) {
        int [] arr = {1,3,1,4};
        System.out.println(Arrays.toString(fix(arr)));
    }
    public static int[] fix(int [] nums){
        int j = 1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == 3 && nums[i+1] != 4)
            {
                for(; nums[j] != 4; j++);
                nums[j] = nums[i+1];
                nums[i+1] = 4;
            }
        }
        return nums;
    }
}
