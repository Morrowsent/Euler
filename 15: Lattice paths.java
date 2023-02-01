import java.math.BigInteger;

public class Euler1 {
    public static void main(String[] args) {
        BigInteger fac40 = new BigInteger("1");
        for(int i = 40; i > 0; i--){
            fac40 = fac40.multiply(new BigInteger(Integer.toString(i)));
        }
        BigInteger fac20 = new BigInteger("1");
        for(int i = 20; i > 0; i--){
            fac20 = fac20.multiply(new BigInteger(Integer.toString(i)));
        }
        fac20 = fac20.multiply(fac20);
        BigInteger result = new BigInteger("0");
        result = fac40.divide(fac20);
        System.out.println(result);
    }
}
// Solution: 137846528820
