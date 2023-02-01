import java.math.BigInteger;

public class Euler1 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");

        int numDigits = 0;
        int i = 3;
        while(numDigits < 1001){
            BigInteger temp = new BigInteger("0");
            temp = temp.add(num2);
            num2 = num2.add(num1);
            num1 = temp;
            String num2String = (num2.toString());
            numDigits = num2String.length();
            System.out.println((i) + " : " + numDigits + " : " + num2);
            i++;
        }
    }
}
//Solution: 4782
