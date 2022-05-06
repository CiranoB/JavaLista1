package Familia52;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main (String[] args) {
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		c = leia.nextInt();
		System.out.println("\nNumerando por ondem crescente: ");		
		if(a>=b && a>=c) {
			System.out.println("\n"+a+" ");
			if(b>=c) {
				System.out.println(b+" ");
				System.out.println(c);
			}else{
			System.out.println(c+" ");
			System.out.println(b);
			}
		}
		if(b>=a && b>=c) {
			System.out.println("\n"+b+" ");
			if(a>=c) {
				System.out.println(a+" ");
				System.out.println(c);
			}else {
			System.out.println(c+" ");
			System.out.println(a);
			}
		}
		if(c>=a && c>=b) {
			System.out.println("\n"+c+" ");
			if(a>=b) {
				System.out.println(a+" ");
				System.out.println(b);
			}else {
			System.out.println(b+" ");
			System.out.println(a);
			}
		}
	}

}
