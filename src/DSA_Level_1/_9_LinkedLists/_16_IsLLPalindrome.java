/*
* You are given a LL
* You are required to write isPalindrome function. The function is expected to check if the LL is a palindrome or not and return true or false accordingly.
* */
package DSA_Level_1._9_LinkedLists;

public class _16_IsLLPalindrome {
    LinkedList.Node lNode;
    private boolean isPalindrome(LinkedList.Node node){
        if(node == null) return true;
        boolean res = isPalindrome(node.next);
        if(!res || node.data != lNode.data)
            return false;

        lNode = lNode.next;
        return true;
    }
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(50);
        ll.addLast(40);
        ll.addLast(30);
        ll.addLast(20);
        ll.addLast(10);

        lNode = ll.head;
        System.out.println(isPalindrome(ll.head));
    }
}
