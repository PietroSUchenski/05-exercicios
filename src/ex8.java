import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int valor3, valorDezena;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor contendo três digitos: ");

        valor3 = sc.nextInt();
        valorDezena = sc.nextInt();

       valorDezena = valor3 % 100 / 10;

        System.out.println("dezena = "+ valorDezena);


    }
}
