package com.example.calculadora;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.example.calculadora.tests.CalculadoraBaseTest;

public class CalculadoraSuma  extends CalculadoraBaseTest{
	
	public static int sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Test CPM00040 - Validar el funcionamiento de la Suma
	 */
	@Test
	public void testFuncionamientoDeLaSuma(){
		//Ingresamos los numeros para la operación
		int num1 = 2;
		int num2 = 2;
		//Declaramos el resultado de la operación
		int resultado = 4;
		//Llamamos al método a testear
		int suma = CalculadoraResta.sumar(num1, num2);
		//Verificamos que el resultado es correcto.
		AssertJUnit.assertEquals(suma, resultado);
	}
	
	
	/**
	 * Test CPM00050 - Validar el funcionamiento de la Suma ingresando valores negativos 
	 */
	@Test
	public void testSumaValoresNegativos (){
		//Ingresamos los numeros para la operación
		int num1 = -2;
		int num2 = 2;
		//Declaramos el resultado de la operación
		int resultado = 0;
		//Llamamos al método a testear
		int suma = CalculadoraResta.sumar(num2, num1);
		//Verificamos que el resultado es correcto.
		AssertJUnit.assertEquals(suma, resultado);
	}

	/**
	 * Test CPM00060 - Validar el funcionamiento de la Suma ingresando valores en cero
	 */
	@Test
	public void testValoresEnCero(){
		//Ingresamos los numeros para la operación
		int num1 = 1345;
		int num2 = 0;
		//Declaramos el resultado de la operación
		int resultado = 1345;
		//Llamamos al método a testear
		int suma = CalculadoraResta.sumar(num2, num1);
		//Verificamos que el resultado es correcto.
		AssertJUnit.assertEquals(suma, resultado);
	
	}
	
}