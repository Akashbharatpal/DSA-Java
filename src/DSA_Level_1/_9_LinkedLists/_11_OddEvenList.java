/*
* You are given a LinkedList
* You are required to write oddEven Function. The function is expected to tweak the list such that all odd values are followed by all even values. The relative order of elements should not change. Also take care of the cases when there are no odd or no even elements. Make sure to properly set head tail and size.
* */
package DSA_Level_1._9_LinkedLists;

public class _11_OddEvenList {
    private void oddEven(LinkedList ll){
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        while(ll.size > 0){
            int val = ll.head.data;
            ll.removeFirst();
            if((val & 1) == 0) even.addLast(val);
            else odd.addLast(val);
        }

        if(odd.size == 0){
            ll.head = even.head;
            ll.tail = even.tail;
            ll.size = even.size;
        }
        else{
            ll.head = odd.head;
            ll.tail = even.tail;
            odd.tail.next = even.head;
            ll.size = even.size + odd.size;
        }
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(1);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        oddEven(ll);
        System.out.println(ll);

        LinkedList ll1 = new LinkedList();
        ll1.addLast(1);
        ll1.addLast(3);
        ll1.addLast(5);
        ll1.addLast(7);
        System.out.println(ll1);


    }
}
