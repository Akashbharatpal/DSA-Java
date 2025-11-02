/*
* You are given a ll
* You are required to write a mid function. The function should be an iterative function and should return the mid of ll. also make sure to no use size data member directly (by calculating size ia making traversal). In ll of odd size mid is unambigous. in ll of even size consider end of first half as mid.
* */
package DSA_Level_1._9_LinkedLists;

public class _7_MiddleOfLL {
    private int middle(LinkedList ll){
        LinkedList.Node fast = ll.head, slow = ll.head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        return slow.data;
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
        ll.addLast(80);
        ll.addLast(90);

        System.out.println(middle(ll)); //for odd size

        ll.addLast(100);

        System.out.println(middle(ll)); // for even size

    }
}
