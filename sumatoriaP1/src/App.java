public class App {
    public static void main(String[] args) throws Exception {

        
        App p = new App();

        int[][] arrTest = {
                { 1, 3, 7, 8 },
                { 0, 6, 3, 1 },
                { 1, 2, 3, 4 },
                { 0, 5, 3, 0 },
                { 2, 5, 9, 0 }
        };

        p.imprimir(arrTest);



        
        int suma = p.suma(arrTest);
        System.out.println("\nLa suma del arreglo bi = "+suma+"\n");





    }

    void imprimir(int[][] arr){
        for(int[] fila: arr){
            System.out.print("{");
            for(int valor: fila){
                System.out.print(" "+valor+" ");
            }
            System.out.print("}\n");
        }

    }

    int suma(int[][] arrTest){
        int suma = 0;
        for(int i = 0; i < arrTest.length; i++){
            for(int j = 0;  j < arrTest[i].length; j++){
                suma += arrTest[i][j];
            }
        }
        return suma; 
    }
}
