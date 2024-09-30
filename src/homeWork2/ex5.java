package homeWork2;

import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        int[] numb = {2, 1,3, 4, 5, 6,7, 8,9};
        for (int i = 0; i < numb.length/2; i++) {
            int temp = numb[i];
            numb[i] = numb[numb.length - i -1];
            numb[numb.length - i - 1] = temp;


        }
        System.out.println(Arrays.toString(numb));
    }

}
