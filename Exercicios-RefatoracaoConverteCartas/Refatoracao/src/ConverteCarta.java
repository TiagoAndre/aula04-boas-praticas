import java.util.Iterator;

public class ConverteCarta {
	
	public int converteCartaParaInt(String carta) {
		int valorCarta = -1;
		
		String[] cartas = {"a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"};


		for (int i = 0; i < cartas.length; i++) {
			if (cartas[i].equalsIgnoreCase(carta)) {
				valorCarta = i + 1;
			}
		}
		
		return valorCarta;
		

	}
	
}
