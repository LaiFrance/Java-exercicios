package aula_02_condicionais;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A, B, C;

		System.out.print("Digite o número A: ");
		A = scanner.nextInt();

		System.out.print("Digite o número B: ");
		B = scanner.nextInt();

		System.out.print("Digite o número C: ");
		C = scanner.nextInt();

		if (A + B > C) {
			System.out.println("A Soma de A + B é Maior que C");
		} else if (A + B < C) {
			System.out.println("A Soma de A + B é Menor que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
	}
}
