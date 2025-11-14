
import java.util.Scanner;

public class App {
    String[] nombres;
    int[] calificaciones;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        App main =new App();
        main.inicializar();
        main.llenarCampos();
        sort(main.calificaciones, main.nombres);
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


    public static void sort(int[] calificaciones, String[] nombres){
        int n = calificaciones.length;

        for(int i = 0; i < n -1; i++){
            int minIndex = i;// seleciona el primero menor
            for(int j = i + 1; j < calificaciones.length; j++){
                if(calificaciones[j] < calificaciones[minIndex]){
                    minIndex = j;// indice del mmenor dentro de la parte no ordenada
                }
            }
            int temp = calificaciones[minIndex];
            calificaciones[minIndex] = calificaciones[i];
            calificaciones[i] = temp;


            String tem2  = nombres[minIndex];
            nombres[minIndex] = nombres[i];
            nombres[i] = tem2;
        }


        System.out.println("\n--------------------------------");
        for(int i = 0 ; i < calificaciones.length; i++){
            System.out.println(i+" -> "+nombres[i] +" tieness una calificacion de "+calificaciones[i]);
        }
        System.out.println("--------------------------------");
    }

}
