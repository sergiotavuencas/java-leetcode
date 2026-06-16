package algorithms.easy;

import java.util.*;

public class LongestCommonPrefix {
    /* Solução Andreas
    * */
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 1) return strs[0];
//
//        String first = strs[0];
//        StringBuilder sb = new StringBuilder();
//        boolean endResult = false;
//
//        for(int i = 0; i < first.length(); i++) {
//            for(String s : strs) {
//                if(s.length() <= i || s.charAt(i) != first.charAt(i)) {
//                    endResult = true;
//                    break;
//                }
//            }
//
//            if(endResult) return sb.toString();
//
//            sb.append(first.charAt(i));
//        }
//
//        return sb.toString();
//    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        String first = strs[0];
        StringBuilder sb = new StringBuilder();
        boolean endResult = false;

        for(int i = 0; i < first.length(); i++) {
            for(String s : strs) {
                if(s.length() <= i || s.charAt(i) != first.charAt(i)) {
                    endResult = true;
                    break;
                }
            }

            if(endResult) return sb.toString();

            sb.append(first.charAt(i));
        }

        return sb.toString();
    }

    public String testCases() {
        List<String> results = new ArrayList<>();

        Map<Integer, String[]> testCases = new LinkedHashMap<>();

        testCases.put(1, new String[]{"flower", "flow", "flight"});
        testCases.put(2, new String[]{"dog", "racecar", "car"});
        testCases.put(66, new String[]{"a", "ab"});
        testCases.put(67, new String[]{"a", ""});
        testCases.put(86, new String[]{"reflower","flow","flight"});
        testCases.put(91, new String[]{"cir", "car"});

        for (Integer testCase : testCases.keySet()) {
            results.add(longestCommonPrefix(testCases.get(testCase)));
        }

        return results.toString();
    }
}
