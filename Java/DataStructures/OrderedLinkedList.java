public class OrderedLinkedList {
    
    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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
        
    }
    
    Node head;
    int size;
    
    public void insert(int data){
        Node current = head;
        Node prev = null;
        Node node = new Node(data);
        if(head == null){
            head = node;
            size++;
        }else{
            if(data < head.getData()){
                node.setNext(head);
                head = node;
                size++;
            }else{
                while(current != null){

                    if(data < current.getData()){
                        prev.setNext(node);
                        node.setNext(current);
                        size++;
                        break;
                    }else{
                        if(current.getNext() == null){
                            current.setNext(node);
                            size++;
                            break;
                        }   
                        prev = current;
                        current = current.getNext();   
                
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
                System.out.println(current.getData());
                current = current.getNext();
            }
        }
    }
}
