package selection_sort;

import java.util.Arrays;

public class SelectionSort{
    

    public int[] selectionSort(int[] array){
        int indiceMenor = 0;
        for(int i = 0; i < array.length ; i++){
            indiceMenor = i;

            for(int j = i + 1; j < array.length; j++ ){
                if(array[indiceMenor] > array[j]){
                    indiceMenor = j;
                }
            }

            if(indiceMenor != i){
                
                int temp = array[indiceMenor];
                array[indiceMenor] = array[i];
                array[i] = temp;
            }
        }
         

        return array;
    }



     
}