package tema2;

import java.util.Scanner;

public class Main {
	/**
	 * 
	 * @param esta clase te permite escribir un numero y una serie de caracteres
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //introduce valores
		
		System.out.println("Escribe: ");
		int num=sc.nextInt();
		
		if (num>0) {
			System.out.println("El numero es mayor que 0");
		}
		else if(num==0){
			System.out.println("El numero es 0");
		}
		else {
			System.out.println("El numero es menor que 0");
		}
		
		switch(num){
		case 1: {
			System.out.println("el numero es 1");
			break;
		}
		case 2:{
			System.out.println("el numero es 2");
			break;
		}
		case 3:{
			System.out.println("el numero es 3");
			break;
		}
			
		case 4:{
			System.out.println("el numero es 4");
			break;
		}
		default:{
			System.out.println("nada");
			break;
		}
		}
		
	}

}
