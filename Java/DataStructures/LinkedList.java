public class LinkedList {
    
    public class Node{
    
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
    Node head;
    
    void pushFront(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    
    int topFront(){
        
        return head.data;
    }
    
    void popFront(){
        head = head.next;
    }
    
    void pushBack(int data){
        Node current = head;
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }   
    
    int topBack(){
        Node current = head;
        if(head == null){
            return 0;
        }
        while(current.next != null){
            current = current.next;
        }
        return current.data;
    }
    
    void popBack(){
        Node current = head;
        if(head == null){
            System.out.println("List Empty");
        }else{
            Node prev = current;
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            
            prev.next = null;
        }
    }
    
    boolean find(int data){
        Node current = head;
        if(head == null){
            return false;
        }else{
            while(current != null){
                
                if(current.data == data){
                    return true;
                }else{
                    current = current.next;   
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
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}


