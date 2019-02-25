public class Fourteen {
    static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            int len = strs.length;
            if(len<=0)
                return "";
            String common = strs[0];
            for(int i=1;i<len;i++){
                int most = common.length();
                int j=0;
                while(j<most && j<strs[i].length()){
                    if(strs[i].charAt(j)==common.charAt(j))
                        j++;
                    else {
                        common = common.substring(0, j);
                        break;
                    }
                }
                if(j<=common.length()){
                    common = common.substring(0, j);
                }
            }
            return common;
        }

    }

    public static void main(String[] args) {
        String[] test = {"aabc","aab"};
        String result = Solution.longestCommonPrefix(test);
        System.out.println(result);
    }
}
