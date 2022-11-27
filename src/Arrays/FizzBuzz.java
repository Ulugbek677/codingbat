package Arrays;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(1,6);
    }
    public static String[] fizzBuzz(int start, int end) {

        String [] word = new String[end-start];
        int index = 0;
        for (int i = start; i < end ; i++) {
            boolean fizz = i%3==0;
            boolean buzz = i%5==0;
            if(fizz && buzz) word[index]="FizzBuzz";
            else if(fizz) word[index]="Fizz";
            else if(buzz) word[index]="Buzz";
            else word[index] = String.valueOf(i);
            index++;
        }

        return word;
    }
}
