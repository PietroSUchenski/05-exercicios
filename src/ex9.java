import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variaveis
        int valor3;
        int unindade, dezena, centena;
        int valorInvertido;

        System.out.println("Digite um unico valor contendo três digitos: ");
        valor3 = sc.nextInt();

        unindade = valor3 % 10;
        dezena = valor3 / 10 % 10;
        centena = valor3 / 100;

        valorInvertido = unindade * 100 + dezena * 10 + centena;

        System.out.println(valorInvertido);


    }
}
