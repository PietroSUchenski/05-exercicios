import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorAula, porcentagemInss;
        int horasTrab;
        double salarioBruto, salarioLiquido;
        double valorDesconto;



        System.out.println("Digite o valor da hora aula: ");
        valorAula = sc.nextDouble();
        System.out.println("Total de horas trabalhadas: ");
        horasTrab = sc.nextInt();
        System.out.println("Porcentagem de desconto do inss: ");
        porcentagemInss = sc.nextDouble();

        salarioBruto = horasTrab * valorAula;
        valorDesconto = salarioBruto * porcentagemInss / 100;
        salarioLiquido = salarioBruto - valorDesconto;

        System.out.println("Salario Liquido: " +
                String.format("%.2f", salarioLiquido));





    }
}

