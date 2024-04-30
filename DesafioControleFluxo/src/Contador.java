import java.security.InvalidParameterException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = entrada.nextInt();

        try{
            contar(n1,n2);
        } catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    public static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if (n1 > n2) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        for (int i=n1; i<=n2; i++){
            System.out.println(i);
        }
    }

}