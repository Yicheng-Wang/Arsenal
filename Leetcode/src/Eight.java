public class Eight {
    static class Solution {
        static public int myAtoi(String str) {
            int len = str.length();
            char[] array = new char[len];
            array = str.toCharArray();
            int i=0;
            int begin = 0;
            while(i<len && array[i] == ' ')
                i++;
            begin = i-1;
            if(i<len && (array[i]=='+'|| array[i]=='-' || (array[i]>='0'&&array[i]<='9'))){
                if(array[i]=='+' || (array[i]>='0'&&array[i]<='9')){
                    if(array[i]=='+') {
                        begin++;
                        i++;
                        if (i>=len || !(array[i] >= '0' && array[i] <= '9'))
                            return 0;
                    }
                    int result = 0;
                    while(i<len && array[i] >= '0' && array[i] <= '9'){
                        result = result *10 + array[i]-'0';
                        i++;
                        if (i-begin>=10){
                            if((i<len && result ==214748364 && array[i]>= '8' && array[i] <= '9')||(i<len && result >=214748365 && array[i]>= '0' && array[i] <= '9')){
                                return 2147483647;
                            }
                        }
                    }
                    return result;
                }
                else{
                    i++;
                    begin++;
                    if(i>=len || !(array[i] >= '0' && array[i] <= '9')){
                        return 0;
                    }
                    int result = 0;
                    while(i<len && array[i] >= '0' && array[i] <= '9'){
                        result = result *10 + array[i]-'0';
                        i++;
                        if (i-begin>=10){
                            if((i<len && result ==214748364 && array[i] == '9')||(i<len && result >=214748365 && array[i]>= '0' && array[i] <= '9')){
                                return -2147483648;
                            }
                        }
                    }
                    result = -result;
                    return result;
                }
            }
            else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        String str = "20000000000000000000";
        int result = Solution.myAtoi(str);
        int test = 2147483647;
        System.out.println(test);
        System.out.println(result);
    }
}
