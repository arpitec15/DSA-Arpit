package recursion;

import java.util.ArrayList;
import java.util.List;

public class Q7Subset {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> out = new ArrayList<>();
        helper(0, nums, new ArrayList(), out);
        System.out.println(out);
    }

    private static void helper(int ind, int[] nums, List<Integer> list, List<List<Integer>> out) {

        out.add(new ArrayList<>(list));
        for(int i = ind; i < nums.length; i++) {
            list.add(nums[i]);
            helper(i+1, nums, list, out);
            list.remove(list.size()-1);
        }


    }

}
