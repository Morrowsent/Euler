public class Euler1 {
    public static void main(String[] args) {
        int big = 931170240;
        for(int i = 1; i < 2147000000; i++){
            if(divBy20(i) && i < big){
                big = i;
            }
        }
        System.out.println(big);
    }
    public static boolean divBy20(int x){
        for(int j = 1; j <= 20; j++){
            if(x % j != 0){
                return false;
            }
        }
        return true;
    }
}
// Solution: 232792560
