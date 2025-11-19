import java.util.Arrays;

import insertionsort.InsertionSort;

public class App {
    double tempMin;
    double tempMax;
    double rango;
    int size;
    public static void main(String[] args) throws Exception {
        App app = new App();
        double[] temperaturas = {1000.01, 4.1, 5.55, 42.7, 1.2, 8.8, 3.1, 0.3, 100.4   };

        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(temperaturas));

        System.out.println("Arreglo ordenado");
        InsertionSort is = new InsertionSort();
        is.insertionSort(temperaturas);
        System.out.println(Arrays.toString(temperaturas));

        app.temp_min_max(temperaturas);
        System.out.println("Temperatura minima "+app.tempMin );
        System.out.println("Temperatura maxima "+app.tempMax );
        System.out.println("Rango "+app.rango );

        app.calcularTop(temperaturas);
    }

    public void temp_min_max(double[] array){
        tempMax = array[array.length - 1];
        tempMin = array[0];
        rango = tempMax - tempMin;
        size = array.length;
    }

    public void calcularTop(double[] array){
        if(size == 0){
            System.out.println("Top vacio");
        }
        int particionB = size / 2;
        int particionA = size - particionB;

        System.out.println("Top de temperaturas");

        for(int i = 0; i < particionA && i < 3; i++){
            System.out.println(" ["+(i + 1)+"] Top Altos "+array[--size]);
        }

        System.out.println("-------------------------");

        
       for(int i = 0; i < particionB&& i < 3; i++){
        System.out.println(" ["+(i + 1)+"] Top bajos "+array[i]);
       }
    }
}
