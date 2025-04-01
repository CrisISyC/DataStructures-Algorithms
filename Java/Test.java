import Algorithms.InsertionSort;

public class Test {
    public static void main(String[] args) {
        
        /*LinkedList myList = new LinkedList();*/
        /*DoublyLinkedList myList = new DoublyLinkedList();*/
        /*OrderedLinkedList myList = new OrderedLinkedList();*/

        /*Insertion Sort */
        int[] array = {5,2,6,7,9,1,4,8,3};
        InsertionSort insertionSort = new InsertionSort(array);
        System.out.println("Original Array");
        insertionSort.printList();

        System.out.println("Increasing Sort");
        insertionSort.increasingSort();
        insertionSort.printList();

        System.out.println("Decreasing Sort");
        insertionSort.decreasingSort();
        insertionSort.printList();
        
    
        /* Ordered
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
        myList.printList();*/
        
        /* Doubly and LinkedList
        myList.pushBack(1);
        myList.pushBack(2);
        myList.pushBack(3);
        myList.pushBack(6);
        myList.pushBack(7);
        myList.pushBack(8);

        myList.pushFront(1);
        myList.pushFront(2);
        myList.pushFront(3);
        myList.pushFront(6);
        myList.pushFront(7);
        myList.pushFront(8);
        myList.printList();*/

    }
}
