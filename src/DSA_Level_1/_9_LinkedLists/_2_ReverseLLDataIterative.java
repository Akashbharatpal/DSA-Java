/*
* You are given a LinkedList
* You are required to write reverseDI function. The function should be an iterative function and should reverse the contents of linked list by changing the data property of nodes.
* */
package DSA_Level_1._9_LinkedLists;

public class _2_ReverseLLDataIterative {
    private void reverseDI(LinkedList ll){
        for(int i = 0; i < ll.size/2; i++){
            LinkedList.Node start = ll.getAtNode(i), end = ll.getAtNode(ll.size  - i - 1);
            int temp = start.data;
            start.data = end.data;
            end.data = temp;
        }
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

        System.out.println(ll);

        reverseDI(ll);

        System.out.println(ll);

    }
}
