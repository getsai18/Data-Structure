package insertionsort;

 

public class InsertionSort {
    public double[] insertionSort(double[] array){
        for(int i = 0; i < array.length - 1 ; i++){
            int j = i + 1;
            while (j > 0 && array[j] < array[j - 1]) {
                double temp = array[j];
                array[j] = array[j  - 1];
                array[j - 1] = temp;
                j--;
            }
        }






        return array;// -------------------
    }
     

     
}
