/*
* You are required to create LLToStackAdapter class
* As data members, you 've a linked list available in the class.
* here is the list of function that you are supposed to complete
* push -> shoudl accept new data in LIFO manner
* pop -> should remove and return data in LIFO manner. If not available. print "Stack underflow" and return -1
* top -> should return data in LIFO manner if not available print "Stack underflow" and return -1
* size -> Should return the number of elements available in stack.
* */
package DSA_Level_1._9_LinkedLists;

public class _4_LLToStackAdapter {
    public static class LLStackAdapter{
        LinkedList stack = new LinkedList();

        public void push(int data){
            stack.addFirst(data);
        }
        public int pop(){
            if(stack.size == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int res = stack.head.data;
            stack.removeFirst();
            return res;
        }
        public int top(){
            if(stack.size == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return stack.head.data;
        }
        public int size(){
            return stack.size;
        }
    }
    public void main(String[] args){
        LLStackAdapter st = new LLStackAdapter();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.top());

    }
}
