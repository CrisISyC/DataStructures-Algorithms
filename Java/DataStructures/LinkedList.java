public class LinkedList {
    
    public class Node{
    
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
    
    void pushFront(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }
    
    int topFront(){
        
        return head.getData();
    }
    
    void popFront(){
        head = head.getNext();
    }
    
    void pushBack(int data){
        Node current = head;
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }   
    
    int topBack(){
        Node current = head;
        if(head == null){
            return 0;
        }
        while(current.getNext() != null){
            current = current.getNext();
        }
        return current.getData();
    }
    
    void popBack(){
        Node current = head;
        if(head == null){
            System.out.println("List Empty");
        }else{
            Node prev = current;
            while(current.getNext() != null){
                prev = current;
                current = current.getNext();
            }
            
            prev.setNext(null);
        }
    }
    
    boolean find(int data){
        Node current = head;
        if(head == null){
            return false;
        }else{
            while(current != null){
                
                if(current.getData() == data){
                    return true;
                }else{
                    current = current.getNext();   
                }
            }
        }  
        return false;
    }
    
    boolean Empty(){
        if(head == null){
            return true;
        }
        return false;
    }
    
    void printList(){
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


