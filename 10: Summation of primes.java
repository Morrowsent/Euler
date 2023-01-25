public class Euler1 {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 0; i <= 2000000; i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(long num){
        if(num % 2 == 0){
            return false;
        }
        for(long j = 3; j <= Math.sqrt(num); j+=2){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}
