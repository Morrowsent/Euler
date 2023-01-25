public class Euler1 {
    public static void main(String[] args) {
        int product = 0;
        for(int a = 1; a < 1000; a++){
            //System.out.println("A: "+a);
            for (int b = 1; b < 1000; b++){
                //System.out.println("B: "+b);
                for(int c = 1; c < 1000; c++){
                    //System.out.println("C: "+c);
                    if((Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2)) && a+b+c == 1000){
                        product = a*b*c;
                        System.out.println(a+" "+b+" "+c);
                        break;
                    }
                }
            }
        }
        System.out.println("Product: " + product);
    }
}
