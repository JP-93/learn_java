public class controlefluxo {
    public static void main(String[] args){
        int idade = 16;
        int quantidadePessoas = 3;
        if (idade >= 18){
            System.out.println("ok");
        }else {
            if(quantidadePessoas >= 2){
                System.out.println("Acompanhado entra");
            }else {
                System.out.println("block");
            }
        }
    }
}
