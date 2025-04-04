#include <iostream>


int main(){


    std:: cout<<"hello World"<<std::endl;

    int array[] = {3,5,6,1,4,9,7,8,2};
    int size = sizeof(array) / sizeof(array[0]);

    for(int i = 1; i < size; i++){
        int key = array[i];
        int j = i-1;
        while(j>=0 && array[j] > key){
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = key;

    }

    for(int i=0; i < size; i++){
        std:: cout<< array[i]<< std:: endl;
    }
    return 0;
}