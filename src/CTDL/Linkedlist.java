package CTDL;

public class Linkedlist {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Linkedlist(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            
            System.out.print( temp.value + ";" );
            
            temp = temp.next;
        }
        System.out.print("]");

    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

	public Node findKthFromEnd(int k){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= k ; i++){
            fast = fast.next;
            if(fast == null){
                return null;
            }
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
        
    }
}
