import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.printf("Cliente: %s\n", nomeCliente);
        System.out.printf("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt
        System.out.printf("Número da conta: %d\n", numeroConta);
        System.out.printf("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.nextLine();
        System.out.printf("Número da Agência: %s\n", numeroAgencia, "\n");
        System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$: %.2f já está disponível para saque.\n",
        nomeCliente, numeroAgencia, numeroConta, saldo
        );
        scanner.close();
    }
}
