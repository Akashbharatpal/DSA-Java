/*
* You are given a LL
* You are required to write mergeSort function. The function is static and is passed the head and tail of an unsorted list. The function is expected to return a new sorted list the original list must not change.
* */
package DSA_Level_1._9_LinkedLists;

public class _9_MergeSortLL {
    private LinkedList merge(LinkedList ll1, LinkedList ll2 ){
        LinkedList res = new LinkedList();
        LinkedList.Node h1 = ll1.head, h2 = ll2.head;
        while (h1 != null && h2 != null){
            if(h1.data <= h2.data){
                res.addLast(h1.data);
                h1 = h1.next;
            }else {
                res.addLast(h2.data);
                h2 = h2.next;
            }
        }
        while(h1 != null){
            res.addLast(h1.data);
            h1 = h1.next;
        }
        while(h2 != null){
            res.addLast(h2.data);
            h2 = h2.next;
        }
        return res;
    }
    private LinkedList mergeSort(LinkedList.Node head, LinkedList.Node tail){
        if(head == tail) return new LinkedList(new LinkedList.Node(head.data));

//        find the mid
        LinkedList.Node fast = head, slow = head;
        while(fast.next != tail.next && fast.next.next != tail.next){
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedList first = mergeSort(head, slow);
        LinkedList second = mergeSort(slow.next, tail);

        return merge(first, second);
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(8);
        ll.addLast(1);
        ll.addLast(7);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(3);

        System.out.println(mergeSort(ll.head, ll.tail));
    }
}
