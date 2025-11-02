/*
 * You are given a LinkedList
 * You are required to write reversePI function. The function should be an iterative function and should reverse the contents of linked list by changing the next property of nodes.
 * */
package DSA_Level_1._9_LinkedLists;

public class _3_ReverseLLPointerIterative {
    private void reversePI(LinkedList ll){
        if(ll.size <= 1) return;
        LinkedList.Node curr = ll.head, prev = null, next = curr;
        ll.tail = ll.head; // update tail at the beginning itself.
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ll.head = prev; //update head because many functions are relying on it.
    }

    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);

        System.out.println(ll);

        reversePI(ll);

        System.out.println(ll);
    }
}
