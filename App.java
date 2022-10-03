import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Requisito 1: Pedir dois numeros
        System.out.println("Insira o primeiro numero para executar a soma: ");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int s = scanner.nextInt();

        int soma = p + s;
        scanner.close();

        System.out.print("A soma dos numeros informados será: " + soma);

    }
}