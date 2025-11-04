public class Palindromo {
    private String texto;
    private String textoOriginal;
    int size;


    ArrayMyStack<Character> stack = new ArrayMyStack<>();

    public Palindromo(String texto){
        this.texto = texto.toLowerCase().replace(" ","");
        this.textoOriginal = texto;
        size =   this.texto.length();
        insertarTexto();
    }



   private  void insertarTexto(){
    
        for(int i = 0; i < size; i++){
            char letra = texto.charAt(i);
            stack.push(letra);
        }
        

    }

    public void isPalindromo(){

        boolean igual = true;

        for(int i = 0; i < size; i++){
            if(stack.pop() != texto.charAt(i)){
                igual = false;
                break;
            }

            
        }

        if(igual){
                System.out.println("El texto "+textoOriginal+" Es un palindromo");
            }else{
                System.out.println("El texto "+textoOriginal+" no es un palindromo");

            }




    }
    
}
