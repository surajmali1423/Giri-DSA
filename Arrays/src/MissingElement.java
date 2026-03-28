import java.util.*;

public class MissingElement {
    public static List<Integer> MissingList(int [] arr){
          Arrays.sort(arr);
          int first = arr[0];
          int last = arr[arr.length - 1];
          List<Integer>Result = new ArrayList<>();

          int k = 0;
          for(int i = first ; i <= last; i++){
              if(arr[k] != i) Result.add(i);
              else k++;
          }

          return Result;
    }
    public static void main(String[] args) {
         int [] nums = {1 , 5};

         List<Integer> ans = MissingList(nums);

        System.out.println("The List Is : "+ ans);
    }
}
