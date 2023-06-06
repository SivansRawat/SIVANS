/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode start = new ListNode();
        
        start.next = head;
        
        	// if(head == null) return -1;
    	
    	ListNode fast =  start;
    	
    	ListNode slow = start;
    	
    	for(int i=1;i<=n;++i){
    	    
    	    // if(fast == null) return -1;
    	    
    	    fast = fast.next;
    	    
    	    
    	}
    	
    	
    	while(fast.next!= null){
    	    
    	    fast= fast.next;
    	    
    	    slow = slow.next;
    	}
        
        
        slow.next = slow.next.next;
    	
    	return start.next;
    }
}