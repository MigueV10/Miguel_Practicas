package com.coderhouse;

public class Clase01 {
	public static void main(String[] args) {
		//System.out.println("Hola coders");
		
		//Declaracion de variables 
		
		byte variableA = 100;
		double variableConDecimales = -1222222.50d;//la "d" es para hacer referencia al double
		char miPrimerChart = 'N';//para guardar un solo caracter 
		
		String miSegundoChart = "MI primer string ";//aqui si lo declaramos como un string klo arregla
		
		boolean verdadero = true;//nombre variable/asignacion
		long numeroLargo = 233333335;
		String nombre123="Nombres";
		String nombre = "HOLAA";
		
		String saludoInicial = "Hola coders. desde un STring !!";
		//System.out.println(saludoInicial);
		//System.out.println(nombre123);// concatenamos
		//System.out.println(saludoInicial + ' ' +miSegundoChart);//con el signo mas hacemos que se concatenen
		
		//puedo concatenar un string con un numero?
		//System.out.println(saludoInicial + ' ' +miSegundoChart);
		//System.out.println(miSegundoChart + ' ' +numeroLargo);
		
		//MODULO:Devuelve el resto cuando el primer operando es divido por el segundo.
		int numeroUno=12;
		int numeroDos=5;
		
		int  resultado = numeroUno%numeroDos;
		System.out.println(resultado);
	    
		
		//INCREMENTO: Quees? hay dos formas preincre, postincre
		int contador = 0;//inicializamos y definimos la variable(asignandole un valor)
//		System.out.println(contador);
//		contador=1;//REASIGNANCION A OTRO VALOR 
//		System.out.println(contador);
//		contador=contador;
//		System.out.println(contador);//se resigna a si mismo, vale lo que valia
//		contador=contador +1;
//		System.out.println(contador);
//		contador=contador +1;
//		System.out.println(contador);
//		contador=contador +1;
//		System.out.println(contador);
//		contador++;//postincremento
//		
//		System.out.println(contador);
//		contador=contador -1;
//		System.out.println(contador);
//		contador--;//postincremento
//		System.out.println(contador);
//		++contador;//preincremento
//		System.out.println(contador);
//		--contador;//preincremento
		
		//Operadores relacionales: para que sirve el =?asignar 
		//operadores de comparaciones 
		
//		int numeroA = 10;//DETERMINA SI LOS NUMEROS DECLARADOS SON IGUALES
//		int numeroB = 10;//A TRAVES DE UN TRUE O FALSE 
//		
//		System.out.println(numeroA == numeroB);
		
		int numeroA = 10;//DETERMINA SI LOS NUMEROS DECLARADOS SON IGUALES
	    int numeroB = 10;//A TRAVES DE UN TRUE O FALSE 
	    
	    System.out.println(numeroA == numeroB);	
	    System.out.println(numeroA != numeroB);
	    //MAYOR 
	    System.out.println(numeroA > numeroB);//el primer es mayor que el segundo?
	    System.out.println(numeroA < numeroB);//el primer es menor que el segundo?
	    
	    System.out.println(numeroA >=numeroB);//el primer es mayor o igual que el segundo?
	    System.out.println(numeroA <=numeroB);//el primer es menor o igual que el segundo?
		
		
		
		
		
		
		
		
		
		
	}
}