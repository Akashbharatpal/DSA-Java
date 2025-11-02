/*
* You are required to create LLQueueAdapter class.
* As data member you've linked list available in class.
* here is the list of functions that you are supposed to create
* add -> should accept new data in FIFO manner
* remove -> should remove and return data in FIFO manner if not available print "Queue underflow and return -1
* peek -> should return data in FIFO manner If not available print "Queue underflow" and return -1
* size -> should return the number of elements available int the queue
* */
package DSA_Level_1._9_LinkedLists;

public class _5_LLToQueueAdapter {
    public static class LLQueueAdapter{
        LinkedList queue = new LinkedList();

        public void add(int data){
            queue.addLast(data);
        }

        public int remove(){
            if(queue.size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            int res = queue.head.data;
            queue.removeFirst();
            return res;
        }

        public int peek(){
            if(queue.size == 0){
                System.out.println("Queue Underflow");
                return -1;
            }
            return queue.head.data;
        }

        public int size(){
            return queue.size;
        }
    }
    public void main(String[] args){
        LLQueueAdapter qu = new LLQueueAdapter();
        qu.add(10);
        qu.add(20);
        qu.add(30);

        System.out.println(qu.peek());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.peek());

    }
}
