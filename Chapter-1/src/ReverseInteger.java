public class ReverseInteger {
    public static int Reverse(int n ){
          long reverse = 0;
          while(n > 0){
               int digit = n % 10;
               reverse = reverse * 10 + digit;

               n /= 10;
          }
          if(Integer.MAX_VALUE < reverse  || Integer.MIN_VALUE > reverse) return 0;
          return (int)reverse;
    }
    public static void main(String[] args) {
         int n = 1234;
        System.out.println(n+"+ Reverse Number IS : "+Reverse(n));
    }
}
