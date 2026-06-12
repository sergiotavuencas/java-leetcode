package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
//    public int romanToInt(String s) {
//        Map<Character, Integer> romanNumbers = new HashMap<>();
//        romanNumbers.put('I', 1);
//        romanNumbers.put('V', 5);
//        romanNumbers.put('X', 10);
//        romanNumbers.put('L', 50);
//        romanNumbers.put('C', 100);
//        romanNumbers.put('D', 500);
//        romanNumbers.put('M', 1000);
//
//        char[] reversed = new StringBuilder(s).reverse().toString().toCharArray();
//        int previousNumber = 0;
//        int result = 0;
//
//        for (int index = 0; index < reversed.length; index++) {
//            if (previousNumber > romanNumbers.get(reversed[index])) {
//                result -= romanNumbers.get(reversed[index]);
//            } else {
//                result += romanNumbers.get(reversed[index]);
//            }
//
//            previousNumber = romanNumbers.get(reversed[index]);
//        }
//
//        return result;
//    }

//    public int romanToInt(String s) {
//        Map<Character, Integer> romanNumbers = new HashMap<>();
//        romanNumbers.put('I', 1);
//        romanNumbers.put('V', 5);
//        romanNumbers.put('X', 10);
//        romanNumbers.put('L', 50);
//        romanNumbers.put('C', 100);
//        romanNumbers.put('D', 500);
//        romanNumbers.put('M', 1000);
//
//        int nextNumber = 0;
//        int result = 0;
//
//        for (int index = 0; index < s.length(); index++) {
//            if (index + 1 < s.length()) {
//                nextNumber = romanNumbers.get(s.charAt(index+1));
//            }
//
//            if (nextNumber > romanNumbers.get(s.charAt(index))) {
//                result -= romanNumbers.get(s.charAt(index));
//            } else {
//                result += romanNumbers.get(s.charAt(index));
//            }
//        }
//
//        return Math.abs(result);
//    }

    public int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int previousNumber = 0;
        int result = 0;

        for (int index = s.length() - 1; index >= 0; index--) {
            if (previousNumber > romanNumbers.get(s.charAt(index))) {
                result -= romanNumbers.get(s.charAt(index));
            } else {
                result += romanNumbers.get(s.charAt(index));
            }

            previousNumber = romanNumbers.get(s.charAt(index));
        }

        return result;
    }
}
