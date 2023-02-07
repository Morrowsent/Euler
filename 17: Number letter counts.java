public class Euler1 {
    public static void main(String[] args) {
        int count = 11;
        for(int i = 0; i < 1000; i++){
            count+=getString(i).length();
        }
        System.out.println(count);
    }

    public static String getString(int num){
        String numString = "";

        int ones = num % 10;
        int tens = (num % 100 - ones)/10;
        int hundreds = (num - tens - ones)/100;

        if(hundreds != 0){
            switch(hundreds) {
                case 1:
                    numString += "onehundred";
                    break;
                case 2:
                    numString += "twohundred";
                    break;
                case 3:
                    numString += "threehundred";
                    break;
                case 4:
                    numString += "fourhundred";
                    break;
                case 5:
                    numString += "fivehundred";
                    break;
                case 6:
                    numString += "sixhundred";
                    break;
                case 7:
                    numString += "sevenhundred";
                    break;
                case 8:
                    numString += "eighthundred";
                    break;
                case 9:
                    numString += "ninehundred";
                    break;
            }
        }
        if(hundreds != 0 && (tens != 0 || ones != 0)){
            numString += "and";
        }
        if(tens != 0 && tens != 1){
            switch(tens) {
                case 2:
                    numString += "twenty";
                    break;
                case 3:
                    numString += "thirty";
                    break;
                case 4:
                    numString += "forty";
                    break;
                case 5:
                    numString += "fifty";
                    break;
                case 6:
                    numString += "sixty";
                    break;
                case 7:
                    numString += "seventy";
                    break;
                case 8:
                    numString += "eighty";
                    break;
                case 9:
                    numString += "ninety";
                    break;
            }
        }
        if(tens == 1){
            switch (ones){
                case 0:
                    numString += "ten";
                    break;
                case 1:
                    numString += "eleven";
                    break;
                case 2:
                    numString += "twelve";
                    break;
                case 3:
                    numString += "thirteen";
                    break;
                case 4:
                    numString += "fourteen";
                    break;
                case 5:
                    numString += "fifteen";
                    break;
                case 6:
                    numString += "sixteen";
                    break;
                case 7:
                    numString += "seventeen";
                    break;
                case 8:
                    numString += "eighteen";
                    break;
                case 9:
                    numString += "nineteen";
                    break;
            }
            System.out.println(numString);
            return numString;
        }
        if(ones != 0){
            switch (ones){
                case 1:
                    numString += "one";
                    break;
                case 2:
                    numString += "two";
                    break;
                case 3:
                    numString += "three";
                    break;
                case 4:
                    numString += "four";
                    break;
                case 5:
                    numString += "five";
                    break;
                case 6:
                    numString += "six";
                    break;
                case 7:
                    numString += "seven";
                    break;
                case 8:
                    numString += "eight";
                    break;
                case 9:
                    numString += "nine";
                    break;
            }
        }
        System.out.println(numString);
        return numString;
    }
}
