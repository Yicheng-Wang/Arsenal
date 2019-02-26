public class Ninteen {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    static class Solution {
        static public ListNode removeNthFromEnd(ListNode head, int n) {
            int i=0;
            ListNode mark = head;
            while(head.next!=null){
                head = head.next;
                i++;
            }
            head = mark;
            if(n==i+1){
                return mark.next;
            }
            int j=0;
            while(j<i-n){
                head = head.next;
                j++;
            }
            head.next = head.next.next;
            return mark;
        }
    }

    public static void main(String[] args) {
         ListNode begin = new ListNode(0);
         ListNode keep = begin;
        for(int i=1;i<6;i++){
            ListNode add = new ListNode(i);
            begin.next = add;
            begin = begin.next;
        }
        ListNode result =  Solution.removeNthFromEnd(keep,1);
        System.out.println(result);
    }
}
