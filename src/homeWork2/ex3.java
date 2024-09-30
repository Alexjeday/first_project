package homeWork2;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random random = new Random(1);
        int intCountTries = 1;
        while (random.nextInt(1000) != 999) {
            intCountTries++;
        }
        System.out.println(intCountTries);

    }
}
