public class post4 {
    public static void main(String[] args) {
        int [] nums = {2, 4, 1, 4, 3, 2};
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==4){
                count=i;
            }
        }
        int [] arr = new int [(nums.length-1)-count];
        for(int i =count+1, j=0 ; i<nums.length;i++){
            arr[j++]=nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + ' ');
        }
    }

}
