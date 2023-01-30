public class Euler1 {
    public static void main(String[] args) {
        long longestSequence = 0;
        long startingNumber = 0;
        for(long i = 1; i <= 1000000; i++){
            int tempSequence = 0;
            long tempNum = i;
            while(tempNum != 1){
                tempNum = collatzIt(tempNum);
                tempSequence++;
            }
            if(tempSequence > longestSequence){
                longestSequence = tempSequence;
                startingNumber = i;
            }
        }
        System.out.println(startingNumber);
    }
    public static long collatzIt(long num){
        long tempNum = num;
        if(num != 1) {
            if (num % 2 == 0) {
                tempNum /= 2;
            } else {
                tempNum *= 3;
                tempNum++;
            }
        }
        return tempNum;
    }
}
// Solution: 837799
