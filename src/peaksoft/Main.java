package peaksoft;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[] a = new int[101];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }

        Arrays.stream(a) .filter(x -> x % 2 == 0) .map(x -> x * x)  .max() .ifPresent(System.out::println);
    }
}
