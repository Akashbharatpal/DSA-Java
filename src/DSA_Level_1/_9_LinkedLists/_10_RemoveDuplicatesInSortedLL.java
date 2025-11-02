/*
* You are given a LinkedList
* You are required to write a function removeDuplicate. The function is called on a sorted list. The function must remove all duplicated from the list in linear time and constant space.
* */
package DSA_Level_1._9_LinkedLists;

public class _10_RemoveDuplicatesInSortedLL {
    private void removeDuplicate(LinkedList ll){
        LinkedList res = new LinkedList();
        while(ll.size > 0){
            int val = ll.head.data;
            ll.removeFirst();
            if(res.size == 0 || res.tail.data != val)
                res.addLast(val);
        }
        ll.head = res.head;
        ll.tail = res.tail;

    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(5);

        System.out.println(ll);
        removeDuplicate(ll);
        System.out.println(ll);
    }
}
