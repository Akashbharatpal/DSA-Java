/*
* You are given two LL
* you are required to write a function addLL. The function is passed two LL which represents two numbers. the first element is the most significant digit and the last element is the least significant digit. The function is expected to tadd the two LL and return a new LL.
*
* The following approached are not allowed.
* 1. Don't reverse the LL in order to access them from least significant digit to most significant.
* 2. Don't use arrays or explicit extra memory
* 3. Don't convert LL to number, add them up and convert the result back to a LL.
*
* Hint - YOu are expected to take help of recursion to access digits from least significant to most significant you have to tackle the challenge of unequal size of lists and manage carry where required.
* */
package DSA_Level_1._9_LinkedLists;

public class _18_AddTwoLL {
    private int addLLHelper(LinkedList.Node n1, int p1, LinkedList.Node n2, int p2, LinkedList res){
        if(n1 == null && n2 == null) return 0;
        int c = 0;
        if(p1 > p2){
            c = addLLHelper(n1.next, p1-1, n2, p2, res);
            int digit = n1.data + c;
            res.addFirst(digit % 10);
            return digit / 10;
        }else if(p1 < p2){
            c = addLLHelper(n1, p1, n2.next, p2-1, res);
            int digit = n2.data + c;
            res.addFirst(digit % 10);
            return digit / 10;
        }else {
            c = addLLHelper(n1.next, p1-1, n2.next, p2-1, res);
            int digit = n1.data + n2.data + c;
            res.addFirst(digit % 10);
            return digit / 10;
        }
    }

    private LinkedList addLL(LinkedList ll1, LinkedList ll2){
        LinkedList res = new LinkedList();
        int carry = addLLHelper(ll1.head, ll1.size, ll2.head, ll2.size, res);
        if(carry > 0)
            res.addFirst(carry);
        return res;
    }
    public void main(String[] args){
        LinkedList ll1 = new LinkedList(), ll2 = new LinkedList();
        ll1.addLast(9);
        ll1.addLast(9);
        ll1.addLast(8);
        ll1.addLast(5);

        ll2.addLast(4);
        ll2.addLast(6);

        System.out.println(addLL(ll1, ll2));
    }
}
