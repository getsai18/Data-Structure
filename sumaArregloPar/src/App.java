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
                { 1, 2, 3, 4 }, // par -> agrega (1+4)=5
                { 0, 5, 3, 0 }, // par -> agrega (0+0)=0
                { 2, 5, 9 }, // impar -> agrega 0
                { 2, 4, 8, 9, 10 } // impar -> agrega 0
        };

        int[][] nuevoArr = new int[6][];


        for(int i = 0; i < arr.length; i++){
            nuevoArr[i] = new int[ (arr[i].length) + 1];
        }

        for(int i = 0; i < nuevoArr.length; i++){
            for(int j = 0; j < nuevoArr[i].length; j ++){

                if(arr[i].length % 2 == 0){

                    if( arr[i].length == j){
                        nuevoArr[i][j]  = arr[i][0] + arr[i][ ( arr[i].length - 1) ];
                    }else{
                        nuevoArr[i][j] = arr[i][j];
                    }

                }else{
                    
                    if(arr[i].length == j){
                        nuevoArr[i][j] = 0;
                    }else{
                        nuevoArr[i][j] = arr[i][j];
                    }
                }
            }
        }


        for(int i = 0; i < nuevoArr.length; i++){
            System.out.print("{");
            for(int  j = 0; j < nuevoArr[i].length; j++){
                System.out.print(nuevoArr[i][j]+" ");
            }
            System.out.print("}\n");
        }



    }
}
