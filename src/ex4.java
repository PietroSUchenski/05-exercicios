import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMin;
        int quilowatts;
        double valorKwatt, conta;

        System.out.print("Digite o sálario minimo: ");
        salarioMin = sc.nextDouble();
        System.out.print("Digite a quantidade de quilowatts gasta: ");
        quilowatts = sc.nextInt();

        valorKwatt = salarioMin / 7 / 100;
        conta = quilowatts * valorKwatt;

        System.out.println("O Valor da conta R$: "+ conta);
        System.out.println("Valor do quilowatt R$: " + quilowatts);
        System.out.println("Valor da conta com 10% de desconto R$ " + conta * 0.90);


    }
}
