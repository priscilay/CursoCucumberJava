package services;

import java.util.Calendar;

import entidades.Filme;
import entidades.NotaDeAluguel;

public class AluguelService {

	public NotaDeAluguel alugar(Filme filme) {
		NotaDeAluguel nota = new NotaDeAluguel();
		nota.setPreco(filme.getAluguel());
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		
		return nota;

	}

}
