public class Euler1 {
    public static void main(String[] args) {
        int limit = 100;
        double sqsum = 0;
        double sumsq = 0;
        for(int i = 1; i <= limit; i++){
            sumsq += Math.pow(i,2);
        }
        for(int i = 1; i <= limit; i++){
            sqsum += i;
        }
        sqsum = Math.pow(sqsum,2);
        System.out.println(sqsum - sumsq);
    }
}
// Solution: 25164150
