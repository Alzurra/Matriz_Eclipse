package Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int mat[][] = new int[n][n];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		System.out.println();

		for (int l = 0; l < n; l++) {
			for (int c = 0; c < mat.length; c++) {
				System.out.print("[" + mat[l][c] + "]" + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Diagonal da Matriz");
		for (int i = 0; i < mat.length; i++) {
			System.out.print("[" + mat[i][i] + "]" + " ");
		}

		System.out.println();

		System.out.println("Número negativos e positivos dentro da matriz");
		System.out.println();
		int contn = 0;
		int contp = 0;

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] < 0) {
					contn++;
					System.out.println("NEGATIVO: " + "[" + mat[l][c] + "]" + " ");
				} else {
					contp++;
					System.out.println("POSITIVO: " + "[" + mat[l][c] + "]" + " ");
				}
			}
		}

		System.out.println();

		System.out.println("Total de números positivos: " + contp);
		System.out.println();
		System.out.println("Total de números negativos: " + contn);
	}

}
