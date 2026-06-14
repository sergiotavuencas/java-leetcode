package algorithms.easy;

import java.util.*;

public class LongestCommonPrefix {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        } else if (strs.length == 1) {
//            return strs[0];
//        }
//
//        String result = "";
//        List<String> prefixes = new ArrayList<>();
//        List<String> twoPrefixes = Arrays.stream(strs)
//                .filter(str -> str.length() >= 2)
//                .map(str -> str.substring(0, 2))
//                .toList();
//        List<String> onePrefixes = Arrays.stream(strs)
//                .filter(str -> str.length() >= 1)
//                .map(str -> str.substring(0, 1))
//                .toList();
//        Integer twoPrefixesFrequency = 0;
//        Integer onePrefixesFrequency = 0;
//        String twoPrefix = "";
//        String onePrefix = "";
//
//        if (twoPrefixes.size() <= 1 && onePrefixes.size() <= 1) {
//            return result;
//        }
//
//        for (String prefix : twoPrefixes) {
//            Integer frequency = Collections.frequency(twoPrefixes, prefix);
//
//            if (frequency > twoPrefixesFrequency && frequency > 1) {
//                twoPrefixesFrequency = frequency;
//                twoPrefix = prefix;
//            }
//        }
//
//        for (String prefix : onePrefixes) {
//            Integer frequency = Collections.frequency(onePrefixes, prefix);
//
//            if (frequency > onePrefixesFrequency && frequency > 1) {
//                onePrefixesFrequency = frequency;
//                onePrefix = prefix;
//            }
//        }
//
//        if (twoPrefixesFrequency > onePrefixesFrequency || twoPrefixesFrequency == onePrefixesFrequency) {
//            return twoPrefix;
//        } else if (twoPrefixesFrequency < onePrefixesFrequency) {
//            return onePrefix;
//        } else {
//            return result;
//        }
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        Integer wordIndex = 0;
        Integer letterIndex = 0;
        String currentWord = "";
        Character currentLetter = ' ';
        Character previousLetter = ' ';
        String result = "";

//        while (true) {
//            if (strs[wordIndex].replace(" ", "").isEmpty()) {
//                break;
//            } else {
//                currentWord = strs[wordIndex];
//
//                if (letterIndex < currentWord.length()) {
//                    currentLetter = currentWord.charAt(letterIndex);
//
//                    if (wordIndex < strs.length) {
//                        wordIndex++;
//                    }
//                }
//
//                result += currentLetter;
//                previousLetter = currentLetter;

//            }
//        }

        for (letterIndex = 0; ;) {
            for (wordIndex = 0; wordIndex < strs.length; wordIndex++) {
                currentWord = strs[wordIndex];

                if (currentWord.charAt(letterIndex) != ' ') {
                    currentLetter = currentWord.charAt(letterIndex);
                }
            }
        }

        return result;
    }

    public String testCases() {
        List<String> results = new ArrayList<>();

        Map<Integer, String[]> testCases = new LinkedHashMap<>();

        testCases.put(1, new String[]{"flower", "flow", "flight"});
//        testCases.put(2, new String[]{"dog", "racecar", "car"});
//        testCases.put(66, new String[]{"a", "ab"});
//        testCases.put(67, new String[]{"a", ""});
//        testCases.put(86, new String[]{"reflower","flow","flight"});
//        testCases.put(91, new String[]{"cir", "car"});

        for (Integer testCase : testCases.keySet()) {
            results.add(longestCommonPrefix(testCases.get(testCase)));
        }

        return results.toString();
    }
}
