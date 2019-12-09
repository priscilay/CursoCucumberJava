import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Exception {
	  System.out.println("qualquer coisa");
	}

	@Quando("^executa-lo$")
	public void executaLo() throws Exception {
	    
	}

	@Então("^a especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Exception {
	    
	}
	
	private int contador = 0;
	
	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Exception {
	   contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Exception {
	   contador = contador + arg1;
	}

	@Então("^o contador sera (\\d+)$")
	public void oContadorSera(int arg1) throws Exception {
//	    System.out.println(arg1);
//	    System.out.println(contador);
//	    System.out.println(arg1 == contador);
	    //Assert.assertTrue(arg1 == contador);
	    Assert.assertEquals(arg1, contador);
	}
}
