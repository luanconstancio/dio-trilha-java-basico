import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta (inteiro)
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        // Solicita e lê o número da agência (texto)
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente (texto)
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo (decimal)
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Mensagem final conforme o exemplo do requisito
        System.out.println("\nOlá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
