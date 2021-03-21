package com.example.calculadora;

import org.junit.Assert;
import org.junit.Test;

import com.example.calculadora.tests.CalculadoraBaseTest;

public class CalculadoraResta extends CalculadoraBaseTest{
	
	
	/**
	 * Test CPM00070 - Validar el funcionamiento de la Resta
	 */
	@Test
	public void testValidarElFuncionamientoDeLaResta(){
		//Ingresamos los numeros para la operación
		int num1 = 2;
		int num2 = 2;
		//Declaramos el resultado de la operación 
		int resultado = 0;
		//Llamamos al método a testear
		int resta = CalculadoraResta.restar(num1, num2);
		//Verificamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
	
	
	private static int restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}


	/**
	 * Test CPM00080 - Validar el funcionamiento de la resta cuando su valor principal es menor al valor secundario (Caso Borde)
	 */
	@Test
	public void testPrincipalValorEsMenorAlValorSecundario(){
		//Ingresamos los numeros para la operación
		int num1 = 35;
		int num2 = 678;
		//Declaramos el resultado de la operación 
		int resultado = -1;
		//Llamamos al método a testear
		int resta = CalculadoraResta.restar(num1, num2);
		//Verificamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}

	/**
	 * Test CPM00090 - Validar el funcionamiento de la Suma ingresando valores en cero (Caso Borde)
	 */
	@Test
	public void testValidarRestaValoresEnCero(){
		//Ingresamos los numeros para la operación
		int num1 = 2;
		int num2 = 0;
		//Declaramos el resultado de la operación
		int resultado = 2;
		//Llamamos al método a testear
		int resta = CalculadoraResta.restar(num1, num2);
		//Verificamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
	
	/**
	 * Test CPM00100 - Validar el funcionamiento de la resta ingresando valores con signos negativos (Caso Borde)
	 */
	@Test
	public void testValoresConSignosNegativos(){
		//Ingresamos los numeros para la operación
		int num1 = -1345;
		int num2 = -136;
		//Declaramos el resultado de la operación
		int resultado = -1481;
		//Llamamos al método a testear
		int resta = CalculadoraResta.restar(num1, num2);
		//Verificamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}


	public static int sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	
	}
	
} 
