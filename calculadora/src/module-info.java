/*module calculadora {
}*/

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
			Integer a;
			Integer b;
			Integer opcion;
			Integer resultado;
			do{
			System.out.println("Ingrese su operaci�n /n 1 para sumar /n 2 para "
					+ "restar /n 3 para multiplicar /n 4 para dividir");
			opcion = teclado.next();
			}while(opcion < 1 && opcion > 4)
				
				
			System.out.println("Ingrese el primer numero");
			a = teclado.next();
			
			System.out.println("Ingrese el segundo numero");
			a = teclado.next();
			
			/*if(opcion.equals(1)){
				resultado = a + b;
			}else if(opcion.equals(2)){
				resultado = a - b;
			}else if(opcion.equals(3)){
				resultado = a * b;
			}else{
				resultado = a / b;
			}*/
			
			switch(opcion) {
			case opcion.equals(1): 	resultado =a+b;
									break;
			case opcion.equals(2): 	resultado = a - b;
									break;
			case opcion.equals(3):	resultado = a * b;
									break;
			case opcion.equals(4): 	resultado = a / b;
									break;
			default: 				break;
			}
			
 System.out.println("El resultado es " + resultado.toString());
 }
}
