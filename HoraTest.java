package examen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HoraTest {

	Hora h = new Hora();
	
	@Test
	public void CP1() {
		assertFalse(h.validarHora(0, 0, -1));
	}
	
	@Test
	public void CP2() {
		assertFalse(h.validarHora(0, -30, 2));
	}
	
	@Test
	public void CP3() {
		assertFalse(h.validarHora(-50, 30, 2));
	}
	
	@Test
	public void CP4() {
		assertTrue(h.validarHora(20, 30, 2));
	}

}
