import java.io.OutputStream;

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

        System.out.println("Arreglo\n");
        p.imprimirArr(arrTest);

        int suma = 0;
        for(int i = 0; i < arrTest.length; i++){
            for(int j = 0; j < arrTest[i].length; j++){
                if(i == j){
                    continue;
                }else{
                    suma += arrTest[i][j];
                }
            }
        }

        System.out.println("\nLa suma del arreglo sin incluir la diagonal principal es: "+suma+" \nFIN");







    }


    void imprimirArr(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print("{");
            for(int j = 0; j < arr[i].length; j++){
                if((j + 1) == arr[i].length){
                    System.out.print(arr[i][j]);
                }else{
                    System.out.print(arr[i][j]+",");
                }
            }
            System.out.println("}");
        }
    }


    
    

}
