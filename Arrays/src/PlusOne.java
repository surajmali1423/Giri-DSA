public class PlusOne {
    public static int [] onePlus(int [] arr){
          int n = arr.length;

          for (int i = n - 1; i >= 0; i--){
               if(arr[i] < 9){
                   arr[i]++;
                   return arr;
               }

               arr[i] = 0 ;
          }

          int [] Result = new int[n+1];
          Result[0] = 1;

          return Result;
    }
    public static void main(String[] args) {
         int [] arr = { 9 , 9 , 1};
         int [] ans = onePlus(arr);

         for (int x : ans){
             System.out.print(x+" ");
         }
    }
}
