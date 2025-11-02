package DSA_Level_1._9_LinkedLists;

public class _8_MergeTwoSortedLL {
    private LinkedList mergeTwoSortedLL(LinkedList ll1, LinkedList ll2){
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
    public void main(String[] args){
        LinkedList ll1 = new LinkedList();
        ll1.addLast(10);
        ll1.addLast(20);
        ll1.addLast(30);
        ll1.addLast(40);

        LinkedList ll2 = new LinkedList();
        ll2.addLast(7);
        ll2.addLast(9);
        ll2.addLast(12);
        ll2.addLast(15);
        ll2.addLast(37);
        ll2.addLast(43);
        ll2.addLast(48);
        ll2.addLast(53);



        LinkedList mll = mergeTwoSortedLL(ll1, ll2);
        System.out.println(mll);
    }
}
