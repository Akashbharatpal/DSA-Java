/*
* You are given a LL
* You are required to write a function displayReverseRecursive. The function is expected to print in reverse the LL without actual reversing it.
* */
package DSA_Level_1._9_LinkedLists;

public class _13_DisplayReverseRecursive {
    private void displayReverseRecursive(LinkedList.Node head){
        if(head == null) return;
        displayReverseRecursive(head.next);
        System.out.println(head.data);
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        displayReverseRecursive(ll.head);

    }
}
