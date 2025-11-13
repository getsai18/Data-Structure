import java.util.Arrays;
import java.util.Scanner;

public class App {
    static String[] nombres;
    static int[] calificaciones;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        App main =new App();
        main.inicializar();
        main.llenarCampos();
        sort(calificaciones);
    }

    





    void llenarCampos(){
        System.out.println("Llenar campos");
        String nombre = "";
        int calificacion = 0;


        for(int i = 0; i < nombres.length; i++){
            nombre = cadena("Ingresa el nombre del alumno");
            calificacion = numero(nombre+" Ingresa tu calificacion");
            nombres[i] = nombre;
            calificaciones[i] = calificacion;
        }

    }



    public void inicializar(){
        int tamanio = numero("¿Cuántas calificaciones deseas registrar?");
        nombres = new String[tamanio];
        calificaciones = new int[tamanio];

    }



    int numero(String contexto){
        int numero = 0;

        while (numero <= 0 || numero > 50) {
            System.out.println(contexto);
            numero = sc.nextInt();
        }
        return numero;
    }

    String cadena(String contexto){
        sc.nextLine();
        System.out.println(contexto);
        String text = sc.nextLine();
        return text;
    }


    public static void sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n -1; i++){
            int minIndex = i;// seleciona el primero menor
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;// indice del mmenor dentro de la parte no ordenada
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


            String tem2  = nombres[minIndex];
            nombres[minIndex] = nombres[i];
            nombres[i] = tem2;
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(i+" -> "+nombres[i] +" tieness una calificacion de "+arr[i]);
        }
    }

}
