public class App {
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.arreglo();
    }

    // arreglo BI
    void arreglo() {

        int[][] arrTest = {
                { 1 },
                { 6, 3, 1 },
                { 1, 2, 3, 4 },
                { 0, 5, 3, 0 },
                { 2, 5, 9 },
                { 2, 4, 8, 9, 10 }
        };

        System.out.println("Arreglo original");
        imprimir(arrTest);
        System.out.println("\n\n");

        /**
         * se crea un nuevo arreglo con las mismas filas
         * pero con una nueva columna por cada fila
         * para poder sumar el ultimo digito de la fila actual
         * y agregarselo a la posicion creada.
         */
        
        int tamanio = 0;

        int[][] arrTest2 = new int[6][];
        for (int i = 0; i < arrTest.length; i++) {
            tamanio = (arrTest[i].length) + 1;
            arrTest2[i] = new int[tamanio];
        }

        // copiando los datos del primer arreglo al nuevo y agregando el ultimmo valor.

        for (int i = 0; i < arrTest2.length; i++) {

            tamanio = (arrTest2[i].length) - 1;

            for (int j = 0; j < arrTest2[i].length; j++) {
                // se copia la original
                if (j != tamanio) {
                    arrTest2[i][j] = arrTest[i][j];
                }else{
                    // se agrega el nuevo valor
                    arrTest2[i][j] = ( arrTest[i][(j - 1)] ) + 1;
                }
            }
        }

        System.out.println("Nuevo arreglo con columna modificada\n\n");
        imprimir(arrTest2);
        
    }




    

    void imprimir(int[][] arregloBI){
        for(int i = 0; i < arregloBI.length; i++){
            System.out.print("{");
            for(int j = 0; j < arregloBI[i].length; j++){
                
                
                if(arregloBI[i].length == j+1){
                    System.out.print(arregloBI[i][j]);
                }else{
                    System.out.print(arregloBI[i][j]+",");

                }

            }
            System.out.print("}\n");
        }
    }
}
