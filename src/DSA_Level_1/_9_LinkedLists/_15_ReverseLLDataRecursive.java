/*
* You are given a LL
* You are required to write a function reverseDR. The function is expected to reverse the LL by using recursion and changing the data property of the member nodes.
* */
package DSA_Level_1._9_LinkedLists;

public class _15_ReverseLLDataRecursive {
    LinkedList.Node lNode;
    int size;
    private void helper(LinkedList.Node node, int count){
        if(node == null) return;

        helper(node.next, count+1);
        if(count >= size/2) {
            int temp = node.data;
            node.data = lNode.data;
            lNode.data = temp;
        }

        lNode = lNode.next;
    }
    private void reverseDR(LinkedList ll){
        lNode = ll.head;
        size = ll.size;
        helper(ll.head, 0);
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        reverseDR(ll);
        System.out.println(ll);
    }
}
