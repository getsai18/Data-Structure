import java.util.Arrays;
import java.util.Scanner;

import ordenador.Separador;
import selection_sort.SelectionSort;

public class App {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        App app = new App();
         
        int[] arreglo = app.solicitarN();

        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(arreglo));

        Separador s = new Separador(arreglo);

        int[] Arraypar = s.par();
        int[] Arrayimpar = s.impar();

        SelectionSort ss = new SelectionSort();
        Arraypar = ss.selectionSort(Arraypar);
        Arrayimpar = ss.selectionSort(Arrayimpar);


        System.out.println("\nArreglo de pares ordenados");
        System.out.println(Arrays.toString(Arraypar));

        System.out.println("\nArreglo de impares ordenados");
        System.out.println(Arrays.toString(Arrayimpar));

        


    }



    private int[] solicitarN() {
        int size = numero("Ingresa el tamanio del arreglo");
        int[] arreglo = new int[size];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numero("Ingresa la posicion " + i);
        }
        return arreglo;
    }

    private int numero(String txt) {
        System.out.println(txt);
        if (!sc.hasNextLine() || !sc.hasNextInt()) {
            sc.nextLine();
        }
        
        int numero = 0;
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Ingresa un numero valido");

        }
        numero = sc.nextInt();
        return numero;
    }
}
