public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        App p = new App();
        p.ejercicio();

    }

    void ejercicio() {
        int[][] arr = {
                { 1 }, // impar -> agrega 0
                { 6, 3, 1 }, // impar -> agrega 0
                { 1, 2, 3 }, // par -> agrega (1+4)=5
                { 0, 5, 3, 0 }, // par -> agrega (0+0)=0
                { 2, 5, 9 }, // impar -> agrega 0
                { 2, 4, 8, 9, 10, 1 } // impar -> agrega 0
        };

        int[][] nuevoArr = new int[6][];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length % 2 == 0) {
                    nuevoArr[i] = new int[(arr[i].length) + 1];

                } else {
                    nuevoArr[i] = new int[arr[i].length + 1];
                    nuevoArr[i][nuevoArr[i].length - 1] = 0;
                }
            }
        }

        for (int i = 0; i < nuevoArr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                nuevoArr[i][j] = arr[i][j];

                if (arr[i].length %2 == 0) {
                    if (nuevoArr[i].length - 1 == j + 1) {
                        nuevoArr[i][nuevoArr[i].length - 1] = arr[i][j] + arr[i][0];
                    }
                }

            }

        }

        for (int[] fila : nuevoArr) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
