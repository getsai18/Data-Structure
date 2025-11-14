public class EliminarDuplicados {
    public static void main(String[] args) {

        int[] arreglo = {4, 2, 9, 2, 4, 7, 1};

         
        System.out.println("Arreglo original:");
        imprimir(arreglo);

        
        bubbleSort(arreglo);

       
        System.out.println("\nArreglo ordenado:");
        imprimir(arreglo);

      
        int[] sinDuplicados = eliminarDuplicados(arreglo);

     
        System.out.println("\nArreglo sin duplicados:");
        imprimir(sinDuplicados);
    }

  
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
 
    public static int[] eliminarDuplicados(int[] arr) {
         
        int contador = 1;  

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                contador++;
            }
        }

     
        int[] resultado = new int[contador];
        resultado[0] = arr[0];

        int index = 1;

        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                resultado[index] = arr[i];
                index++;
            }
        }

        return resultado;
    }

  
    public static void imprimir(int[] arr) {
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
