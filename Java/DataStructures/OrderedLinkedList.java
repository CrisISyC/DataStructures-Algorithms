public class OrderedLinkedList {
    
    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    
    Node head;
    int size;
    
    public void insert(int data){
        Node current = head;
        Node prev = null;
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            if(data < head.data){
                node.next = head;
                head = node;
            }else{
                while(current != null){

                    if(data < current.data){
                        prev.next = node;
                        node.next = current;
                        break;
                    }else{
                        if(current.next == null){
                            current.next = node;
                            break;
                        }   
                        prev = current;
                        current = current.next;   
                
                    }     
                }    
            }
        }
    }
    
    int length(){
        return size;
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
