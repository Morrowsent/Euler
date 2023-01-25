public class Euler1 {
    public static void main(String[] args) {
        long max = 10001;
        int count = 1;
        int i = 2;
        while(count < max){
            if(isPrime(i)){
                count++;
                System.out.println(count + ": "+ i);
            }
            i++;
        }
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
