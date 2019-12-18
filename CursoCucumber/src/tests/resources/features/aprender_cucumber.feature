#language: pt

Funcionalidade: Aprender Cucumber
 Como um aluno
 Eu quero aprender utilizar Cucumber
 Para que eu possa automatizar critérios de aceitação

@tipo1
Cenario: Deve executar especificação
	Dado que criei o arquivo corretamente
	Quando executa-lo
	Então a especificacao deve finalizar com sucesso

@tipo2
Cenario: Deve incrementar contador
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Então o contador sera 18

@tipo1 @tipo2	
Cenario: Deve incrementar contador
	Dado que o valor do contador é 20
	Quando eu incrementar em 32
	Então o contador sera 52
	
Cenario: Deve calcular atraso na entrega da china
	Dado que a entrega é dia 05/04/2018
	Quando a entrega atrasar em 2 meses
	Entao a entrega sera efetuada em 05/06/2018
	
Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Fulano da Silva"
    Dado que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar	
  
Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    E que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1120,23
    Dado que o nome do passageiro é "Cicrano de Oliveira"
    Dado que o telefone do passageiro é 9888-8888
    
@essenao 
Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
    Dado que o ticket é CD123
    Dado que o ticket é AG1234
    Dado que o valor da passagem é R$ 1.1345,56
    Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
    Dado que o telefone do passageiro é 1234-5678
    Dado que o telefone do passageiro é 999-2223

    
	
	
	
		