
public class Test {
    public static void main(String[] args) {
        
        OrderedLinkedList myList = new OrderedLinkedList();
        
        myList.insert(2);
        myList.insert(5);
        myList.insert(1);
        myList.insert(4);
        myList.insert(10);   
        myList.insert(8);
        myList.insert(0);
        myList.insert(11);
        myList.insert(2);
        myList.insert(3);
        myList.insert(7);
        myList.insert(6);
        
        /*DoublyLinkedList myList = new DoublyLinkedList();
        
        myList.pushBack(1);
        myList.pushBack(2);
        myList.pushBack(3);
        myList.pushBack(6);
        myList.pushBack(7);
        myList.pushBack(8);*/
        
        myList.printList();
    }
}
