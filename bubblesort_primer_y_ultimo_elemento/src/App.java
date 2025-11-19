import java.util.Arrays;
import java.util.Scanner;

import bubblesort.BubbleSort;

public class App {
    Scanner sc = new Scanner(System.in);
    int numMin;
    int numMax;
    int dif;
    public static void main(String[] args) throws Exception {
        App app = new App();

        int[] arreglo = app.pedirDatos();

        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(arreglo));

        BubbleSort bs = new BubbleSort();
        arreglo = bs.bubbleSort(arreglo);

        app.num_min_max(arreglo);

        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arreglo));

        System.out.println("Numero mayor -> "+app.numMax);
        System.out.println("Numero menor -> "+app.numMax);
        System.out.println("Diferencia de numMax "+app.numMax+" - "+app.numMin+" = "+app.dif);

    }

    private int[] pedirDatos(){
        int size = numero("Ingresa el tamanio del arreglo");
        int[] arreglo = new int[size];

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = numero("Ingresa el valor de la posicion [ "+(i + 1)+" ]");
        }
        return arreglo; 
    }



    private int numero(String txt){
        System.out.println(txt);
        int numero = 0;
        if (!sc.hasNextLine() || !sc.hasNextInt()) {
            sc.nextLine();
        }


        while (!sc.hasNextInt()) {
            System.out.println("Ingresa un valor valido");
            sc.nextLine();
        }
        numero = sc.nextInt();
        return numero;


    }

    private void num_min_max(int[] array){
        this.numMin = array[0];
        this.numMax = array[array.length - 1];
        this.dif = numMax - numMin;
    }
}
