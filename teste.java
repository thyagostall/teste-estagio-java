import java.io.Console;
import java.util.Scanner;

import java.util.InputMismatchException;

class Imc {
	public static void main(String[] args) {
		Float peso;
		Float altura;
		Float imc;

		String situacao;
		String nome;

		Scanner s = new Scanner(System.in);

    // Ler a entrada dos dados
		try {
			System.out.print("Informe seu nome:\n> ");
			nome = s.next();

			System.out.print("Informe seu peso (em kg):\n> ");
			peso = s.nextFloat();

			System.out.print("Informe sua altura (em m):\n> ");
			altura = s.nextFloat();

	    // Realizar o cálculo do IMC
			imc = peso / (altura * altura);

			if (imc < 17.0) {
				situacao = "Muito abaixo do peso";
			} else if (imc < 18.5) {
				situacao = "Abaixo do peso";
			} else if (imc < 25) {
				situacao = "Peso normal";
			} else if (imc < 30) {
				situacao = "Acima do peso";
			} else if (imc < 35) {
				situacao = "Obesidade I";
			} else if (imc < 40) {
				situacao = "Obesidade II (severa)";
			} else {
				situacao = "Obesidade III (mórbida)";
			}

	    // Exibir IMC
	    // Exibir situação do usuário
			System.out.printf("%s, sua situação é: %s (IMC: %.2f)\n", nome, situacao, imc);
		} catch (InputMismatchException e) {
			System.out.println("Verifique os valores digitados. Possivelmente o separador de decimal está incorreto.");
		}
	}
}
