public class MaxSubArrays {
    public static int MaxSub(int [] arr){

        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;


        for(int i = 0 ; i < arr.length; i++){
              CurrSum += arr[i];

              if(CurrSum > MaxSum) MaxSum = CurrSum;
              if(CurrSum < 0 ) CurrSum = 0;
        }

        return MaxSum;
    }
    public static void main(String[] args) {
           int [] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("The Count Of the MAximum SubArrays Is : "+MaxSub(arr));
    }
}
