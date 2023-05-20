import java.util.Scanner;

class Invasao {
    public static double calcularPesoMasculino(double altura) {
        return 22 * (altura * altura);
    }

    public static double calcularPesoFeminino(double altura) {
        return 21 * (altura * altura);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao Sistema de Invasao de Privacidade");
            System.out.println("-----------------------------------------------");

            System.out.println("Qual e o sexo?");
            System.out.println("[1] - Masculino");
            System.out.println("[2] - Feminino");
            System.out.println("[0] - Sair");

            int sexo = teclado.nextInt();

            if (sexo == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (sexo != 1 && sexo != 2) {
                System.out.println("Entrada invalida. Digite novamente.\n");
                continue;
            }

            System.out.println("Informe sua altura:");
            double altura = teclado.nextDouble();

            switch (sexo) {
                case 1:
                    double pesoMasculino = calcularPesoMasculino(altura);
                    System.out.println("Seu peso ideal masculino e: " + pesoMasculino);
                    break;

                case 2:
                    double pesoFeminino = calcularPesoFeminino(altura);
                    System.out.println("Seu peso ideal feminino e: " + pesoFeminino);
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.\n");
                    break;
            }
        }
    }
}
