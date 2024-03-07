import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipC = "Corrente";
        double bal = 0;
        double valR;
        double valT;

        System.out.println("\nDigite seu nome: ");
        String nam = sc.nextLine();

        System.out.println("\n---------------Seus Dados---------------");
        System.out.println("Nome:          " + nam);
        System.out.println("Tipo de Conta: " + tipC);
        System.out.println("Saldo:      R$ " + bal);

        System.out.println("--------O que você deseja fazer?--------");

        System.out.println("1 - Ver saldo");
        System.out.println("2 - Adicionar saldo");
        System.out.println("3 - Retirar saldo");
        System.out.println("4 - Sair");
        int escolha = sc.nextInt();

        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    System.out.println("O saldo da sua conta corrente: R$ " + bal);
                    break;
                case 2:
                    System.out.println("Digite o valor a adicionar: ");
                    valR = sc.nextDouble();
                    bal = valR + bal;
                    System.out.println("Saldo atual: R$ " + bal);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser retirado: ");
                    valT = sc.nextDouble();
                    if (valT > bal) {
                        System.out.println("Valor indisponivel");
                        System.out.println("Faltam: R$ " + (valT - bal));
                        System.out.println("Saldo atual: R$ " + bal);
                    } else {
                        bal = bal - valT;
                        System.out.println("Saldo atual: R$ " + bal);
                    }
                    break;

                default:
                    System.out.println("Por favor digite uma opção valida");
            }

            System.out.println("--------O que você deseja fazer?--------");

            System.out.println("1 - Ver saldo");
            System.out.println("2 - Adicionar saldo");
            System.out.println("3 - Retirar saldo");
            System.out.println("4 - Sair");
            escolha = sc.nextInt();
        }
    }
}