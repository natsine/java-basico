import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o numero da agencia: ");
        String Agencia = sc.next();
        
        System.out.println("Por favor digite o numero da conta: ");
        int Numero = sc.nextInt();

        System.out.println("Por favor digite o seu nome: ");
        String NomeCliente = "";
        NomeCliente = sc.nextLine();
        NomeCliente += sc.nextLine();

        System.out.println("Por favor digite o saldo: ");
        double Saldo = sc.nextDouble();
        
        sc.close();
        
        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + Agencia + ", conta: " + Numero + ", e seu saldo no valor de " + Saldo + " já está disponível para saque.");
    }
}
