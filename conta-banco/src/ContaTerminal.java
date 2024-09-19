import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Solicitando e capturando os dados do usuário
        try ( // Criação do objeto Scanner para capturar os dados via terminal
                Scanner scanner = new Scanner(System.in)) {
            // Solicitando e capturando os dados do usuário
            System.out.println("Por favor, digite o número da conta:");
            int numero = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha
            System.out.println("Por favor, digite o número da agência:");
            String agencia = scanner.nextLine();
            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Por favor, digite o saldo da conta:");
            double saldo = scanner.nextDouble();
            // Exibindo a mensagem final com os dados fornecidos
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            // Fechando o scanner
        }
    }
}

