public class Euler1 {
    public static void main(String[] args) {
        long triangle = 0;
        for(long i = 10465; i < 90000; i++){
            long sum = 0;
            long numDivisor = 0;
            for(long j = 1; j < i; j++){
                sum += j;
            }
            for(long j = 1; j < Math.sqrt(sum); j++){
                if(sum % j == 0){
                    numDivisor++;
                }
            }
            numDivisor++;
            if(numDivisor > 300){
                System.out.println(sum + ": " + numDivisor + ": " + i);
            }
        }
    }
}
// Solution: 76576500
