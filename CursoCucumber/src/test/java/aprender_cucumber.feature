#language: pt

Funcionalidade: Aprender Cucumber
 Como um aluno
 Eu quero aprender utilizar Cucumber
 Para que eu possa automatizar critérios de aceitação

Cenario: Deve executar especificação
	Dado que criei o arquivo corretamente
	Quando executa-lo
	Então a especificacao deve finalizar com sucesso

Cenario: Deve incrementar contador
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Então o contador sera 18
	
Cenario: Deve incrementar contador
	Dado que o valor do contador é 20
	Quando eu incrementar em 32
	Então o contador sera 52
	
Cenario: Deve calcular atraso na entrega da china
	Dado que a entrega é dia 05/04/2018
	Quando a entrega atrasar em 2 meses
	Entao a entrega sera efetuada em 05/06/2018
	
	
	
		