public class Euler1 {
    public static void main(String[] args) {
        int biggestPalin = 0;
        for(int i = 1; i < 1000; i++){
            for(int j = 1; j < 1000; j++){
                if(isPalindrome(i*j)){
                    if(i*j > biggestPalin){
                        biggestPalin = i*j;
                        System.out.println(biggestPalin);
                    }
                }
            }
        }
        System.out.println("answer: " + biggestPalin);
    }
    public static boolean isPalindrome(int num){
        if((num % 1000000)/100000 == num % 10 && (num % 100000)/10000 == (num % 100)/10 && (num % 10000)/1000 == (num % 1000)/100)
        {
            return true;
        }
        return false;
    }
}
// Solution: 906609
