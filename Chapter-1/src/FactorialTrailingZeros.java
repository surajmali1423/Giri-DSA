public class FactorialTrailingZeros {
    public static int FactorialTrails(int n ){
          int cnt  = 0 ;

          while ( n > 0 ){
                n = n / 5;

                cnt += n;
          }

          return cnt;
    }
    public static void main(String[] args) {
        System.out.println("The Factorial Trailing Zeross : "+FactorialTrails(6));
    }
}
