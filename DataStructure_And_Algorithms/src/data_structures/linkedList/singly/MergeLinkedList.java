package data_structures.linkedList.singly;


class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeLinkedList {
	
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        if(list1 == null && list2 == null){
	            return null;
	        }else if(list2 == null){
	            return list1;
	        }else if(list1 == null){
	            return list2;
	        }
	        
	        ListNode prev = null;
	        ListNode head = list1;
	        while(list1 != null && list2 != null){
	            if(list1.val <= list2.val){
	                prev = list1;
	                list1 = list1.next;
	            }else{
	                ListNode temp = list2.next;
	                list2.next = list1;
	             
	                if(prev == null){
	                	head = list2;
	                    prev = list2;
	                }else{
	                    prev.next = list2;
	                }
	                list2 = temp;
	            }
	        }
	        
	        prev.next = list2;
	        
	        
	        return head;
	    }
	 
	 public static void main(String[] args) {
		 long sum = 0;
		 sum = (long) (sum+ Math.pow(10, 0)*3);
		 int val = (int) (sum % 10);
	 }
}
