import algorithms.easy.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}