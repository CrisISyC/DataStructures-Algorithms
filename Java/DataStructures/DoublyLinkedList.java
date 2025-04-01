class Node{
    
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getPrev(){
        return this.prev;
    }

    public void setPrev(Node prev){
        this.prev = prev;
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
            while(current.getNext() != null){
                prev = current;
                current = current.getNext();
            }
            current.setNext(node);
            current.setPrev(prev);
            tail = node;
        }
    }
    
    public void printList(){
        Node current = head;
        if(head == null){
            System.out.println("List Empty");
        }else{
            while(current != null){
                System.out.println(current.getData());
                current = current.getNext();
            }
        }
    }
}
