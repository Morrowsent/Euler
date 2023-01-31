public class Euler1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10000; i++){
            int sumOne = sumOfDivisors(i);
            int sumTwo = sumOfDivisors(sumOne);
            if(i == sumTwo && sumOne != sumTwo){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int sumOfDivisors(int num){
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
// Solution: 31626
