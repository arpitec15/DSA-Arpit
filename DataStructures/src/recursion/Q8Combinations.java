package recursion;

import java.util.ArrayList;
import java.util.List;

public class Q8Combinations {

    public static void main(String[] args) {
        List<List<Integer>> out = new ArrayList<>();
        helper(1, new ArrayList<Integer>(), out, 4, 2);
        System.out.println(out);
    }
    private static void helper(int ind, List<Integer> list, List<List<Integer>> out, int n, int k) {

        if(list.size() == k) {
            out.add(new ArrayList<>(list));
            return;
        }

        for(int i = ind; i <= n; i++) {
            list.add(i);
            helper(i+1, list, out, n, k);
            list.remove(list.size()-1);
        }
    }
}
