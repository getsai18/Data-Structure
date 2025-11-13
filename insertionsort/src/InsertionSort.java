import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] arr){
        int n= arr.length;


        for(int i = 1; i < n ; i++){//comenzamos desde el segundo elemento
            int temp = arr[i];// el primer elemento de la parte desordenada (comparativo)
            int j = i - 1;// comenzamos desde el ultimo elemento de la parte  ordenada
            while (j >= 0 && arr[j] > temp) {// recorrer la parte ordenada
                arr[j + 1] = arr[j];// recorrer la derecha los elementos mahores atem
                j--;
            }
            //inserta e elemento en su posicion
            arr[j + 1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
