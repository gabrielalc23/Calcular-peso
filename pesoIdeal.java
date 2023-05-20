import java.util.Scanner;

class pesoIdeal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura;
        double peso;
        double imc;

		System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao Sistema de calcular pururuca");
            System.out.println("-----------------------------------------------");
			
        System.out.println("Por favor, insira seu peso:");
        peso = teclado.nextDouble();

        System.out.println("Por favor, insira sua altura:");
        altura = teclado.nextDouble();

        imc = calcularIMC(peso, altura);
        exibirResultadoIMC(imc);
    }

    public static double calcularIMC(double peso, double altura) {
        // Calcula o IMC (BMI)
        return peso / (altura * altura);
    }

    public static void exibirResultadoIMC(double imc) {
        System.out.println("Seu IMC e: " + imc);

        if (imc < 18.5) {
            System.out.println("Voce passa fome seu africano.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu peso esta bom.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Voce esta Gordo.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Voce esta na categoria de obesidade grau I.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Voce esta na categoria de obesidade grau II.");
        } else {
            System.out.println("Voce esta na categoria de obesidade grau III (pururuca alta).");
        }
    } 
}
