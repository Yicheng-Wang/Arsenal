public class Ten {
    static class Solution {
        public static boolean isMatch(String s, String p) {
            int lens = s.length();
            int lenp = p.length();
            char[] schar = s.toCharArray();
            char[] pchar = p.toCharArray();
            boolean[][] memory = new boolean[lens+1][lenp+1];
            memory[0][0] = true;
            for(int i=0;i<lens+1;i++){
                for(int j=1;j<lenp+1;j++){
                    if(pchar[j-1] == '*'){
                        memory[i][j] |= memory[i][j-2];
                        if(i>0 && (schar[i-1] == pchar[j-2] || pchar[j-2] == '.')){
                            memory[i][j] |= memory[i-1][j];
                        }
                    }
                    else{
                        if(i>0 && (schar[i-1] == pchar[j-1] || pchar[j-1] =='.')){
                            memory[i][j] = memory[i-1][j-1];
                        }
                    }
                }
            }
            return memory[lens][lenp];
        }
    }

    public static void main(String[] args) {
        String input = "abbbcb";
        String compare = "a.*cb";
        boolean result = Solution.isMatch(input,compare);
        System.out.println(result);
    }
}
