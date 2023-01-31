import java.math.BigInteger;

public class Euler1 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2");
        for(int i = 1; i < 1000; i++){
            num = num.add(num);
        }
        System.out.println(num);
        String numString = num.toString();
        int sum = 0;
        for(int i = 0; i < numString.length(); i++){
            sum += Integer.parseInt(numString.substring(i,i+1));
        }
        System.out.println(sum);
    }
}
// Solution: 1366
