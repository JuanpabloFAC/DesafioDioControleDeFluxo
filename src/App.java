import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int parametro1 = sc.nextInt();
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1  > parametro2){
            throw new ParametrosInvalidosException("O parâmetro 1 é maior que o Parâmetro 2, por favor, corrija isso!");
        } else {
            int contagem = parametro2 - parametro1;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        }

        
    }

}
