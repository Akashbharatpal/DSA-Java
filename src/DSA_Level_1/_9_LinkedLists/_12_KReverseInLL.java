/*
* You are given a LL
* You are required to write a function kReverse. The function is expected to tweak the list such that al groups of k elements in the list get reversed and linked. If the last set has less than k elements., leave it as it is (don't reverse).
* */
package DSA_Level_1._9_LinkedLists;

public class _12_KReverseInLL {
    private void kReverse(LinkedList ll, int k){
        LinkedList fnl = new LinkedList();
        while(ll.head != null){
            LinkedList curr = new LinkedList();
            if(k < ll.size) {
                for (int i = 0; i < k; i++) {
                    int val = ll.head.data;
                    ll.removeFirst();
                    curr.addFirst(val);
                }
            } else{
                int os = ll.size;
                for (int i = 0; i < os; i++) {
                    int val = ll.head.data;
                    ll.removeFirst();
                    curr.addLast(val);
                }
            }
            if(fnl.size == 0)
                fnl = curr;
            else{
                fnl.tail.next = curr.head;
                fnl.size += curr.size;
                fnl.tail = curr.tail;
            }
        }
        ll.head = fnl.head;
        ll.tail = fnl.tail;
        ll.size = fnl.size;
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.addLast(11);

        kReverse(ll, 3);
        System.out.println(ll);
    }
}
