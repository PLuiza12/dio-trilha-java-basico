import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new  Scanner(System.in);

        //Mensagens para o usuário criar a conta
        System.out.println("=== Bem-vindo ao Banco Digital ===");
        System.out.println("Por favor, digite seu nome:  ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua conta:  ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência:  ");
        int agencia = scanner.nextInt();

        System.out.println("Informe o saldo inicial da conta:  ");
        double saldo = scanner.nextDouble();

        //Mensagens para o usuario verificar as informações que foram solicitadas anteriormente
        System.out.println("\n=== Conta Criada com Sucesso! ===");
        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
