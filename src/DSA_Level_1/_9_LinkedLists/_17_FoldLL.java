/*
* You are given a LL
* You are required to write a fold function. The function is expected to place last element after 1st element, 2nd last element after 2nd element and so on.
* e.g.
* 1->2->3->4->5
* will fold as
* 1->5->2->4->3
* 1->2->3->4->5->6
* will fold as
* 1->6->2->5->3->4
* */
package DSA_Level_1._9_LinkedLists;

public class _17_FoldLL {
    LinkedList.Node lNode;
    LinkedList ll;
    private void fold(LinkedList.Node node, int count){
        if(node == null) return;
        fold(node.next, count + 1);

        if(count > ll.size/2) {
            LinkedList.Node temp = lNode.next;
            lNode.next = node;
            node.next = temp;
            lNode = temp;
        }
        else if(count == ll.size/2){
            ll.tail = node;
            ll.tail.next = null;
        }
    }
    public void main(String[] args){
        ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        lNode = ll.head;
        fold(ll.head, 0);
        System.out.println(ll);
    }
}
