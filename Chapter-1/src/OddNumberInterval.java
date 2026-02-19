public class OddNumberInterval {

    public static int OddCount(int low , int high){
          return (((high + 1) / 2 ) - (low/2) );
    }
    public static void main(String[] args) {

           int low =  3;
           int high = 11;

        System.out.println(OddCount(low , high));
    }


}
