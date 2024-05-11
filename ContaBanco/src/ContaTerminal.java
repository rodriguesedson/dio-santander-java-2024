import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //variáveis
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        //TODO: importar scanner
        Scanner scanner = new Scanner(System.in);

        //mensagens ao usuário
        //obter valores digitados no terminal (scanner)
        //Nome do cliente
        System.out.println("Por favor digite o seu nome");
        nomeCliente = scanner.nextLine();

        //Número da agência
        System.out.println("Por favor digite o número da agência da sua conta");
        agencia = scanner.nextLine();

        //Número da conta
        System.out.println("Por favor digite o número da sua conta");
        numeroConta = scanner.nextInt();

        //Saldo
        System.out.println("Por favor digite o saldo da sua conta");
        saldo = scanner.nextDouble();

        //exibir mensagem "Conta criada"
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
