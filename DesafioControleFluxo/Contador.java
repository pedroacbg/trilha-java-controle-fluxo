import java.util.Scanner;

public class Contador {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = sc.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException exception){
            exception.printStackTrace();
        }
    }

    static void contar(int parametro1, int parametro2 ) throws ParametrosInvalidosException {
        if(parametro2 < parametro1){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametro2 - parametro1;
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
