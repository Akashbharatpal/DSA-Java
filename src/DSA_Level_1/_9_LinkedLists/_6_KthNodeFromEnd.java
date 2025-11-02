/*
* You are required to write function KthFromLast. The function should be an iterative function and should return kth node from end of linked list. Also, make sure to not use size data member directly or indirectly (by calculating size via making a traversal) k is a 0-based index. Assume that valid values of k will be passed.
* */
package DSA_Level_1._9_LinkedLists;

import java.util.Scanner;

public class _6_KthNodeFromEnd {
    private int KthFromLast(LinkedList ll, int k){
        LinkedList.Node forward = ll.head;
        for(int i=0; i<k; i++)
            forward = forward.next;
        LinkedList.Node backward = ll.head;
        while(forward != null){
            forward = forward.next;
            backward = backward.next;
        }

        if(backward != null)
            return backward.data;
        return -1;
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

        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();

        System.out.println(KthFromLast(ll, k));
    }
}
