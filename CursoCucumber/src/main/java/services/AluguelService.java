package services;

import entidades.Filme;
import entidades.NotaDeAluguel;
import utils.DateUtils;

public class AluguelService {

	public NotaDeAluguel alugar(Filme filme, String tipo) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque!");

		NotaDeAluguel nota = new NotaDeAluguel();
		if("extendido".equals(tipo)){
			nota.setPreco(filme.getAluguel()*2);
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
			nota.setPontuacao(2);
		} else{
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
		}
		//nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
		return nota;
	}

}
