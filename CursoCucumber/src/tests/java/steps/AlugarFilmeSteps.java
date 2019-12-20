package steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import entidades.Filme;
import entidades.NotaDeAluguel;
import junit.framework.Assert;
import services.AluguelService;
import utils.DateUtils;

public class AlugarFilmeSteps {

	private Filme filme = new Filme();
	private AluguelService aluguel = new AluguelService();
	private NotaDeAluguel nota = new NotaDeAluguel();
	private String erro;
	private String tipoAluguel;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
	}

	@Dado("^que o preco do aluguel seja R\\$ (\\d+)$")
	public void queOPrecoDoAluguelSejaR$(int arg1) throws Throwable {
		filme.setAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		} catch (RuntimeException e) {
			erro = e.getMessage();
		}

	}

	@SuppressWarnings("deprecation")
	@Entao("^o preco do aluguel sera R\\$ (\\d+)$")
	public void oPrecoDoAluguelSeraR$(int arg1) throws Throwable {
		System.out.println(nota.getPreco());
		Assert.assertEquals(arg1, nota.getPreco());
	}

	@SuppressWarnings("deprecation")
	@Entao("^a data de entrega sera no dia seguinte$")
	public void aDataDeEntregaSeraNoDiaSeguinte() throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		
		Date dataRetorno = nota.getDataEntrega();
		Calendar calRetorno = Calendar.getInstance();
		calRetorno.setTime(dataRetorno);
		
		Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
		Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@SuppressWarnings("deprecation")
	@Entao("^o estoque do filme sera de (\\d+) unidades$")
	public void oEstoqueDoFilmeSeraDeUnidades(int arg1) throws Throwable {
		System.out.println(filme.getEstoque());
		Assert.assertEquals(arg1, filme.getEstoque());
	}
	
	@Entao("^nao sera possivel por falta de estoque$")
	public void naoSeraPossivelPorFaltaDeEstoque() throws Throwable {
		Assert.assertEquals("Filme sem estoque!", erro);
	}
	
	@Dado("^que o tipo de aluguel seja extendido$")
	public void queOTipoDeAluguelSejaExtendido() throws Throwable {
		tipoAluguel = "extendido";
	}

	@Entao("^a data de entrega sera em (\\d+) dias$")
	public void aDataDeEntregaSeraEmDias(int arg1) throws Throwable {
		Date dataEsperada = DateUtils.obterDataDiferencaDias(arg1);
		Date dataReal = nota.getDataEntrega();
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
	}

	@Entao("^a pontuacao recebida sera de (\\d+) pontos$")
	public void aPontuacaoRecebidaSeraDePontos(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPontuacao());

	}



}
