package DSA_Level_1._9_LinkedLists;

public class _1_LinkedList {
    public void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.addLast(20);

        System.out.println(ll);
        System.out.println(ll.size);

        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.size);
        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.size);


        ll.addFirst(10);
        System.out.println(ll);
        System.out.println(ll.size);
        ll.addFirst(20);
        System.out.println(ll);
        System.out.println(ll.size);
        ll.addFirst(30);
        System.out.println(ll);
        System.out.println(ll.size);
        ll.addFirst(40);
        System.out.println(ll);
        System.out.println(ll.size);

        System.out.println(ll.getAtNode(0).data);
        System.out.println(ll.getAtNode(3).data);

        ll.addAt(50, 0);
        System.out.println(ll);
        System.out.println(ll.size);
        ll.addAt(10, ll.size);
        System.out.println(ll);
        System.out.println(ll.size);
        ll.addAt(30, 3);
        System.out.println(ll);
        System.out.println(ll.size);

        ll.removeAt(3);
        System.out.println(ll);
        System.out.println(ll.size);
        ll.removeAt(3);
        System.out.println(ll);
        System.out.println(ll.size);
    }
}
