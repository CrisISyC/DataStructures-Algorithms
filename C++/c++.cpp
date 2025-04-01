#include <iostream>

class Node{

    private: 
    
    int data;
    Node *next;
    
    public:
    
    Node(int data){
        this->data = data;
        this->next = nullptr;
    }

    int getData(){
        return this->data;
    }

    void setData(int data){
        this->data = data;
    }

    Node *getNext(){
        return this->next;
    }

    void setNext(Node *next){
        this->next = next;
    }
};  

class LinkedList{

    Node *head = nullptr;

    public:
    LinkedList(){
        this->head = nullptr;
    }

    void pushBack(int data){
        Node *newNode = new Node(data);
        Node *ptr = this->head;
        if(this->head == nullptr){
            this->head = newNode;
        }else{
            while(ptr->getNext() != nullptr){
                ptr = ptr->getNext();
            }
            ptr->setNext(newNode);
        }
    }

    void printList(){
        Node *ptr = this->head;
        if(ptr == nullptr){
            std:: cout << "List Empty" <<std::endl;
        }else{
            while(ptr != nullptr){
                std:: cout << ptr->getData() << std::endl;
                ptr = ptr->getNext();
            }
        }
    }

    void popBack(){
        Node* ptr = this->head;
        Node* prev = nullptr;
        if(ptr == nullptr){
            std:: cout << "List Empty" <<std::endl;
        }else{
            while(ptr->getNext() != nullptr){
                prev = ptr;
                ptr = ptr->getNext();
            }
            prev->setNext(nullptr);
        }
    }
};


int main() {

    LinkedList myList;

    myList.pushBack(1);
    myList.pushBack(3);
    myList.pushBack(2);
    
    myList.printList();

    myList.popBack();

    myList.printList();
    return 0;
}
