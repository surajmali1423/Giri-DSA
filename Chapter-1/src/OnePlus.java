public class OnePlus {
    public static int [] PlusOne(int [] nums){
         int n = nums.length ;

        for (int i = n - 1; i >= 0 ; i--) {
            if(nums[i] < 9) {
                  nums[i]++;
                  return nums;
            }

            nums[i] = 0;
        }

        int [] newDigit = new int[n+1];
        newDigit[0] = 1;

        return newDigit;
    }
    public static void main(String[] args) {
          int [] arr = { 1 , 3 , 9};
       int [] ans = PlusOne(arr);
         for(int num : ans){
             System.out.print(num + "  ");
         }
    }
}
