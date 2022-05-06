package Familia52;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main (String[] args) {
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		c = leia.nextInt();
		System.out.println("\nO maior número é: ");		
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		if(b>=a && b>=c) {
			System.out.println(b);
		}
		if(c>=a && c>=b) {
			System.out.println(c);
		}
	}
}
