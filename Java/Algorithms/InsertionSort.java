package Algorithms;

public class InsertionSort {
    
    int[] array;

    public InsertionSort(int[] array){
        this.array = array;
    }
        

    public void increasingSort(){

        for(int i = 1; i < array.length; i++){
            
            int key = array[i];
            int j = i-1;
            
            while(j>=0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public void decreasingSort(){

        for(int i = 1; i < array.length; i++){
            
            int key = array[i];
            int j = i-1;
            
            while(j>=0 && array[j] < key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }    

    public void printList(){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}