import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeventyEight {
    static class Solution {
        public static List<List<Integer>> subsets(int[] nums) {
            int len = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            for(int i=0;i<=len;i++){
                List<Integer> inter = new ArrayList<>();
                if(i==0)
                    result.add(inter);
                else{
                    int now = result.size();
                    for(int j=0;j<now;j++){
                        List<Integer> plus = new ArrayList<>();
                        int lastlen = result.get(j).size();
                        for(int k=0;k<lastlen;k++) {
                            plus.add(result.get(j).get(k));
                        }
                        plus.add(nums[i-1]);
                        result.add(plus);
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        list = Solution.subsets(nums);
        System.out.println(list);
    }
}
