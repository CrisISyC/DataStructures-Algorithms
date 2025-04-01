class Node{
    
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    
    Node head;
    Node tail;
    
    public void pushBack(int data){
        Node node = new Node(data);
        Node current = head;
        Node prev = null;
        if(head == null){
            head = node;
            tail = node;
        }else{
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            current.next = node;
            current.prev = prev;
            tail = node;
        }
    }
    
    public void printList(){
        Node current = head;
        if(head == null){
            System.out.println("List Empty");
        }else{
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
