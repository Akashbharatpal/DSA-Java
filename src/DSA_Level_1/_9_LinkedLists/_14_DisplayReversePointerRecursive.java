/*
* You are given LL
* You are required to write reversePR function. The function are expected to reverse the LL by using recursion and changing the next data member of nodes.
* */
package DSA_Level_1._9_LinkedLists;

public class _14_DisplayReversePointerRecursive {
    private void helper(LinkedList.Node head){
        if(head.next == null) return;
        helper(head.next);
        head.next.next = head;
    }
    private void displayReversePointerRecursive(LinkedList ll){
        LinkedList.Node temp = ll.tail;
        helper(ll.head);
        ll.head.next = null;
        ll.tail = ll.head;
        ll.head = temp;
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        displayReversePointerRecursive(ll);
        System.out.println(ll);
    }
}
