import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, //mapeamento para verificar estrutura sem executar o teste
		strict = false //rigoroso falha se tiver faltando passo
		)
public class Runner {

}
