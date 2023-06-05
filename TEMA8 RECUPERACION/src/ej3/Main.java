package ej3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion=1;
		Scanner sc=new Scanner(System.in);
		//coleccion de producto
		TreeSet<Producto> productos = new TreeSet<Producto>();
		String nombre = "";
		double precio = 0;
		int caducar=0;
		String tipo="";
		Producto producto=null;
		
		String tipoProd="";
		
		while(opcion!=0) {
			

			System.out.println("introduce la opcion: ");
			
			opcion=sc.nextInt();
			
			switch (opcion) {
			//
			case 1:{
				System.out.println("introduce el nombre: ");
				nombre=sc.next();
				sc.nextLine();
				
				System.out.println("introduce el precio: ");
				precio=sc.nextDouble();
				sc.nextLine();
				
				System.out.println("introduce el tipo: ");
				tipoProd=sc.nextLine();
				//
				
				//si el producto es perecedero
				if(tipoProd.equals("Perecedero")) {

					System.out.println("introduce dias caducar: ");
					//como es perecedero y tiene el elemento caducar de más
					caducar=sc.nextInt();
					sc.nextLine();
					//
					producto=new Perecedero(nombre,precio,caducar);
					
				}
	
				//si el producto no es perecedero
				else if(tipoProd.equals("No perecedero")) {

					System.out.println("introduce tipo: ");
					tipo=sc.next();
					sc.nextLine();
					
					//
					producto=new NoPerecedero(nombre,precio,tipo);
					
					
				}
				else {
					System.out.println("Tipo no valido");
					break;
				}
				
				
				
				
				
				//añade el producto
				productos.add(producto);
				
				break;
			}//c1
			
			case 2:{
				System.out.println(productos);
				
				break;
			}//c2
			
			case 3:{
				System.out.println("introduce el nombre: ");
				nombre=sc.next();
				sc.nextLine();
				
				producto=new Producto(nombre);
				
				productos.remove(producto);
				
				break;
			}//c3
	
			//salir
			case 0:{
				
				break;
			}//c0
			
				
			}//swotch
			
		}
		
		
		
		
	}//main method
	
}//class
