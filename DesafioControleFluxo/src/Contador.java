import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.printf("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.printf("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método contar com os parâmetros fornecidos
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");
        }
        int contagem = parametroDois - parametroUm;
        System.out.println("=====*Contagem Iniciada*=====");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Contando: " + i);
        }
    }
}
