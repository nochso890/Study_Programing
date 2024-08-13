import java.util.Arrays;
import javax.sound.midi.Soundbank;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void reverseNumber(){
        long number = 12345;
        long reversedNumber = 0;

        while(number > 0){
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }


        System.out.println(reversedNumber);
    }

    @Test
    void pushSpelling(){
        String spelling = "AB";

    }

    @Test
    void quadrangleDot(){
        int[][] v = {{1,4},{3,4},{3,10}};
//        int[][] v = {{5,4},{9,4},{9,10}};
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            x ^= v[i][0];
            y ^= v[i][1];
        }

        System.out.println("The fourth point is: (" + x + ", " + y + ")");
    }

    @Test
    void chageArray(){
        int[][] queries = {{0,3},{1,2},{1,4}};
        int[] arr = {0, 1, 2, 3, 4};

        for(int i = 0; i < queries.length; i++){
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
