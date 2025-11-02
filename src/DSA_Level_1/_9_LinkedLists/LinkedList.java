package DSA_Level_1._9_LinkedLists;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(){}

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return this.data + " -> ";
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    LinkedList(){}

    LinkedList(Node node){
        this.head = node;
        this.tail = node;
        this.size++;
    }

    private void addLastNode(Node node){
        if(tail == null) this.head = node;
        else this.tail.next = node;

        this.tail = node;
        this.size++;
    }

    public void addLast(int data){
        Node node = new Node(data);
        addLastNode(node);
    }

    @Override
    public String toString() {
        StringBuilder rstr = new StringBuilder();
        Node temp = this.head;
        while(temp != null){
            rstr.append(temp);
            temp = temp.next;
        }
        rstr.append("null");
        return rstr.toString();
    }

    public void removeFirst(){
        if(this.head == null) return;
        this.head = this.head.next;
        this.size--;
    }

    private void addFirstNode(Node node){
        if(this.head == null) this.tail = node;
        else node.next = this.head;
        this.head = node;
        this.size++;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        addFirstNode(node);
    }

    public Node getAtNode(int idx){
        if(idx >= this.size) return null;
        Node curr = this.head;
        while(idx-- >= 1) // wanted to keep zero based indexing.
            curr = curr.next;
        return curr;
    }

    public void removeLast(){
        if(this.tail == null) return;
        else if(size == 1){
            this.tail = null;
            this.head = null;
        }
        else {
            Node secondLast = getAtNode(size - 2);
            this.tail = secondLast;
            secondLast.next = null;
        }
        this.size--;
    }

    private void addAtNode(Node node, int idx){
        if(idx > size || idx < 0) return;
        else if(idx == 0)
            addFirstNode(node);
        else if(idx == size)
            addLastNode(node);
        else{
            Node prev = getAtNode(idx - 1); //zero based indexing
            Node temp = prev.next;
            prev.next = node;
            node.next = temp;
            this.size++;
        }
    }

    public void addAt(int data, int idx){
        Node node = new Node(data);
        addAtNode(node, idx);
    }

    public void removeAt(int idx){
        if(idx > size || idx < 0) return;
        else if(idx == 0) removeFirst();
        else if(idx == size) removeLast();
        else{
            Node prev = getAtNode(idx - 1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            this.size--;
        }
    }
}
