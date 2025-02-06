package EDDtests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;


class PalabrasTest {

	@Test
	void testContarPalabras() {
		assertEquals(1, EED.Palabras.contarPalabras("Hola".trim()));
		assertEquals(2, EED.Palabras.contarPalabras(" Hola Isma".trim()));

}

	@Test
	void testContarLetrasDiferentes() {
		assertEquals(4, EED.Palabras.contarLetrasDiferentes("Hola".trim()));
		assertEquals(3, EED.Palabras.contarLetrasDiferentes("Bolo".trim()));

	}

	 @Test
	    void testContarFrecuenciaPalabras() {
	        Map<String, Integer> frecuenciaPalabra1 = new HashMap<>();
	        frecuenciaPalabra1.put("hola", 2);

	        assertEquals(frecuenciaPalabra1, EED.Palabras.contarFrecuenciaPalabras(" Hola Hola".trim()));	   
	        
	        Map<String, Integer> frecuenciaPalabra2 = new HashMap<>();
	        frecuenciaPalabra2.put("hola", 1);
	        frecuenciaPalabra2.put("adios", 1);


	        assertEquals(frecuenciaPalabra2, EED.Palabras.contarFrecuenciaPalabras("Hola Adios".trim()));	   
	        
	 }

	    @Test
	    void testContarFrecuenciaLetras() {
	        Map<Character, Integer> frecuenciaLetra1 = new HashMap<>();
	        frecuenciaLetra1.put('h', 1);
	        frecuenciaLetra1.put('o', 1);
	        frecuenciaLetra1.put('l', 1);
	        frecuenciaLetra1.put('a', 1);

	        assertEquals(frecuenciaLetra1, EED.Palabras.contarFrecuenciaLetras("Hola".trim()));	  
	        
	        Map<Character, Integer> frecuenciaLetra2 = new HashMap<>();
	        frecuenciaLetra2.put('m', 1);
	        frecuenciaLetra2.put('u', 1);
	        frecuenciaLetra2.put('n', 1);
	        frecuenciaLetra2.put('d', 1);
	        frecuenciaLetra2.put('o', 1);

	        assertEquals(frecuenciaLetra2, EED.Palabras.contarFrecuenciaLetras("Mundo".trim()));	   
	        
	    }

	@Test
	void testEsPalindroma() {
		assertEquals(true, EED.Palabras.esPalindroma("oso".trim()));
		assertEquals(false, EED.Palabras.esPalindroma("caracol".trim()));

	}

}
