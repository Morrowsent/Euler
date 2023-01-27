public class Euler1 {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 2; i <= 2000000; i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(long num){
        for(long j = 2; j <= Math.sqrt(num); j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}
// Solution: 142913828922
