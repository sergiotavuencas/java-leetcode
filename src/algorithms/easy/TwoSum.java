package algorithms.easy;


import java.util.Arrays;

public class TwoSum {
    // BRUTE FORCE
    public int[] twoSum(int[] nums, int target) {
        for(int fNumber = 0; fNumber < nums.length; fNumber++){
            for(int sNumber = 0; sNumber < nums.length; sNumber++){
                if(nums[fNumber] + nums[sNumber] == target){
                    return new int[]{fNumber, sNumber};
                }
            }
        }

        return new int[]{};
    }

//    public int[] twoSum(int[] nums, int target) {
//        int[] filtered = Arrays.stream(nums)
//                .filter(num -> num < target)
//                .toArray();
//
//        for (int i = 0; i < nums.length; i++){
//            Arrays.stream(filtered).;
//        }
//
//        for(int fNumber = 0; fNumber < filtered.length; fNumber++){
//            for(int sNumber = 0; sNumber < filtered.length; sNumber++){
//                if(filtered[fNumber] + filtered[sNumber] == target){
//                    return new int[]{fNumber, sNumber};
//                }
//            }
//        }
//
//        return new int[]{};
//    }
}
