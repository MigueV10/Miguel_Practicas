package com.coderhouse;

public class Clase02 {
	public static void main(String[] args) {
//		int numeroA = 3;
//		int numeroB = 2;
//		
//		if (numeroA>numeroB) {//condicion) true o false, solo se ejecuta si el if es verdadero
//			System.out.println("el numero " + numeroA +"es mayor que "+ numeroB);
//		}else {
//			System.out.println("El numero" +numeroA+ "Es menor que" +numeroB);
//		}
//		System.out.println("si llegamos hasta aca es por que se ejecuto el if");
//		
		
		//CALCULADORA 
//		float numeroA = 1.5f;
//		float numeroB = 5.0f;
//		
//		float resultado =numeroA/numeroB;
//		
//		if(numeroB != 0) {
//			System.out.println("el resultado es: " +resultado);
//		}else {
//			System.out.println("error, no se puede dividir por cero!");
//		}
//		
		
//		int ingreseUnNumero = 0 ;
//		
//		if (ingreseUnNumero>0) {//si esto es verdadero
//			System.out.println("el numero ingresado es positivo");
//		}else if(ingreseUnNumero<0){//si NO, esto es verdadero ejecuto sino false
//			System.out.println("el numero ingresado es negativo");
//		}else if (ingreseUnNumero == 0){//como en las dos condiciones dio false,se va al ultimo, SI NO EJECUTA EL ULTIMO BLOQUE
//			System.out.println("el numero ingresado es cero");
//		}else {
//			System.err.println("el dato ingresado no es unn numero");
//		}
		
////		int dlS =19;
////		
////		if (dlS == 1) {
////			System.out.println("el dia actual es lunes");
////		}else if(dlS==2) {
////			System.out.println("el dia actual es martes");
////		}else if(dlS==3) {
////			System.out.println("el dia actual es miercoles");
////		}else if(dlS==4) {
////			System.out.println("el dia actual es jueves");
////		}else if(dlS==5) {
////			System.out.println("el dia actual es viernes");
////		}else if(dlS==6) {
////			System.out.println("el dia actual es sabado");
////		}else if (dlS==7){
////			System.out.println("el dia actual es domingo");
////		}else {
////			System.err.println("el dia es incorrecto");
//		}
////		
//		int isE = 18;
//		
//		if(isE >= 18 && isE <=100) {
//			System.out.println("usted puede ingresar.!!");
//		}else if (isE>0 && isE <18){
//			System.out.println("ud. es menor y no puede ingresar");
//		}else {
//			System.out.println("usted ingreso una edad incorrecta. o es muy viejo para tomar alchool");
//		}
//		 
		
	
		//SWITCH
		
//		int dsE = 12;
//		String DSE=null;
//		
//		switch(dsE) {
//		
//		case 1://el 1 es el comparativo de la isE
//			DSE = "lunes";
//			break;//salimos de la sentencia 
//		case 2://el 1 es el comparativo de la isE
//			DSE = "martes";
//			break;//salimos de la sentencia 
//		case 3://el 1 es el comparativo de la isE
//			DSE = "miercoles";
//			break;//salimos de la sentencia 
//		case 4://el 1 es el comparativo de la isE
//			DSE = "jueves";
//			break;//salimos de la sentencia 
//		case 5://el 1 es el comparativo de la isE
//			DSE = "viernes";
//			break;//salimos de la sentencia 
//		case 6://el 1 es el comparativo de la isE
//			DSE = "sabado";
//			break;//salimos de la sentencia 
//		case 7://el 1 es el comparativo de la isE
//			DSE = "domingo";
//			break;//salimos de la sentencia 
//			
//			default:
//				DSE="dia incorrecto";
//				break;
//		}
//		System.out.println("el dia de la semana correspondiente al numero "
//				+ dsE +" es el "+ DSE);
		
//		String dia= "Lunes";
//		
//		switch(dia.toLowerCase()) {//lo convierte en minisculas
//		case "lunes":
//			System.out.println("hoy es "+dia);
//			break;
//		case "martes":
//			System.out.println("hoy es "+dia);
//			break;
//		case "miercoles":
//			System.out.println("hoy es "+dia);
//			break;
//		case "jueves":
//			System.out.println("hoy es "+dia);
//			break;
//		case "viernes":
//			System.out.println("hoy es "+dia);
//			break;
//		case "sabado":
//			System.out.println("hoy es "+dia);
//			break;
//		case "domingo":
//			System.out.println("hoy es "+dia);
//			break;
//			
//			default:
//				System.err.println("el dia ingresado fue: "+ dia + "y es incorrecto");
//		}
//		System.out.println("fin");
		
		
		//OPERADOR TERNARIO. Analiza la condicion v o false
		
		int numeroA = 10;
		int numeroB =2;
		
		boolean condicion = numeroA> numeroB;//esto me va a devolver un true o false 
		
		String resultado=condicion
			? " el numero " + numeroA +" es mayor que "+ numeroB
			:" el numero " + numeroA +" es menor que "+ numeroB;//el valor de verdad de condicion es false
		System.out.println(resultado);    
		
	}
}
