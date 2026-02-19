public class TrailingZero {

    public static boolean Trail(int [] nums){
            int evenZero = 0;

            for(int num : nums){
                  if(num % 2 == 0){
                         evenZero++;

                         if(evenZero >= 2) return true;
                  }
            }

            return false;
    }
    public static void main(String[] args) {
               int [] arr = {1,2,3,4,5,7,9};
               System.out.println(Trail(arr));
    }
}
