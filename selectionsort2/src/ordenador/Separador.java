package ordenador;

public class Separador {
    private int[] array;
    int par; 
    int impar;

    public Separador(int[] array){
        this.array = array;
        this.par = size(array);
        this.impar = array.length - par;
    }

    public int[] par(){
        int[] arrayPar = new int[par];
        int indicePar = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                arrayPar[indicePar] = array[i];
                indicePar++;
            }
        }
        return arrayPar;
    }

    public int[] impar(){
        int[] arrayImpar = new int[impar];
        int indiceImpar = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 != 0){
                arrayImpar[indiceImpar] = array[i];
                indiceImpar++;
            }
        }
        return arrayImpar;
    }



    private int size(int[] array){
        int contadorP = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                ++contadorP;
            }
        }

        return contadorP;
    }
}
