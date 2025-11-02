/*
* You are given a LL
* You are required to write findIntersection function. The function is passed 2 LL which start separately but merge at a node and become common thereafter. The function is expected to find the point where two LL merge. You are not allowed to use arrays to solve the problem.
* */
package DSA_Level_1._9_LinkedLists;

public class _19_IntersectionOfLL {
    private LinkedList.Node findIntersection(LinkedList ll1, LinkedList ll2){
        LinkedList.Node h1 = ll1.head, h2 = ll2.head;
        if(ll1.size > ll2.size){
            for(int i=0; i<ll1.size - ll2.size; i++)
                h1 = h1.next;
        } else if( ll1.size < ll2.size){
            for(int i=0; i<ll2.size-ll1.size; i++)
                h2 = h2.next;
        }

        while(h1 != null && h2 != null && h1 != h2){
            h1 = h1.next;
            h2 = h2.next;
        }
        return h1;
    }
    public void main(String[] args){
        LinkedList ll1 = new LinkedList(), ll2 = new LinkedList(), ll3 = new LinkedList();
        ll1.addLast(10);
        ll1.addLast(20);
        ll1.addLast(30);
        ll1.addLast(40);
        ll1.addLast(50);
        ll1.addLast(60);
        ll1.addLast(100);


        ll2.addLast(60);
        ll2.addLast(20);
        ll2.addLast(30);
        ll2.addLast(40);

        ll3.addLast(70);
        ll3.addLast(80);
        ll3.addLast(90);

        ll1.tail.next = ll3.head;
        ll1.size += ll3.size;
        ll1.tail = ll3.tail;

        ll2.tail.next = ll3.head;
        ll2.size += ll3.size;
        ll2.tail = ll3.tail;

        System.out.println(findIntersection(ll1, ll2));
    }
}
