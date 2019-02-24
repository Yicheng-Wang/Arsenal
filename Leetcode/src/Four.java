public class Four {
    static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double result = 0;
            int len1 = nums1.length;
            int len2 = nums2.length;
            int totallen = len1+len2;
            int[] toge = new int[totallen];
            int i=0,j=0;
            int index = 0;
            while(i<len1 && j<len2){
                if(nums1[i]<nums2[j]){
                    toge[index] = nums1[i];
                    i++;
                    index++;
                }
                else{
                    toge[index] = nums2[j];
                    j++;
                    index++;
                }
            }
            if(i==len1){
                while(j<len2){
                    toge[index] = nums2[j];
                    j++;
                    index++;
                }
            }
            else{
                while(i<len1){
                    toge[index] = nums1[i];
                    i++;
                    index++;
                }
            }

            boolean one = (len1+len2)%2 == 1;
            if(one){
                result = toge[(len1+len2)/2];
            }
            else{
                result = ((double)toge[(len1+len2)/2] + (double)toge[(len1+len2)/2-1])/2;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] first = {};
        int[] second = {2,3};
        double mid = Solution.findMedianSortedArrays(first,second);
        System.out.println(mid);
    }
}
