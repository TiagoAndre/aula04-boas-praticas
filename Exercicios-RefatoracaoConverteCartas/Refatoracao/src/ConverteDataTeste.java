import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverteDataTeste {

	@Test
	void test() {
		ConverteCarta vCarta = new ConverteCarta();
		
		assertNotEquals(-1, vCarta.converteCartaParaInt("k"));
	}
	
	@Test
	void test2() {
		ConverteCarta vCarta = new ConverteCarta();
		
		assertNotEquals(-1, vCarta.converteCartaParaInt("15"));
	}
	
	@Test
	void test3() {
		ConverteCarta vCarta = new ConverteCarta();
		
		assertNotEquals(-1, vCarta.converteCartaParaInt("b"));
	}
	
	@Test
	void test4() {
		ConverteCarta vCarta = new ConverteCarta();
		
		assertNotEquals(-1, vCarta.converteCartaParaInt("A"));
	}
	
	@Test
	void test5() {
		ConverteCarta vCarta = new ConverteCarta();
		
		assertNotEquals(-1, vCarta.converteCartaParaInt("a"));
	}

}
