public class Euler1 {
    public static void main(String[] args) {
        int i = 1;
        int i2 = 1;
        int count = 0;
        while(i < 4000000){
            int ph = i;
            i += i2;
            i2 = ph;

            if(i % 2 == 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}
