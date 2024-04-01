#Author: susanabergamo@outlook.com

@regressivos
Feature: Preencher formulário de registro de estudantes do site DemoQA
	Como usuario do distema
	Quero informar daodos de preenchimento do formulario 
	Para enviar minha inscricao de estudante
	
	Background: Acessar tela de formulario 
		Given que o usuario esteja na tela do formulario de registro de estudantes
	
	@positivo
	Scenario: Enviar formulario valido
		When todos os campos sao preenchidos corretamente
		And enviar foto de perfil
		And enviar dados de endereco
		And selecionar estado
		And selecionar cidade
		When o usuario clica no botao Submit
		Then o sistema deve exibir modal
		
		@branco
		Scenario: Enviar formulario com dados em branco
		But campos nao sao preenchidos 
		When o usuario clica no botão Submit
		Then formulario nao enviado 
		
		@mobile
		Scenario: Enviar formulario sem informar contato
		But nao informar mobile no preenchimento de dados
		And enviar foto de perfil
		And enviar dados de endereco 
		And selecionar estado
		And selecionar cidade
		When o usuario clica no botao Submit
		Then formulario nao enviado com erro no mobile
		
		@email
		Scenario: Enviar formulario sem informar email
		But nao informar email no preenchimento de dados 
		And enviar foto de perfil
		And enviar dados de endereco
		And selecionar estado
		And selecionar cidade
		When o usuário clica no botao Submit
		Then formulario nao enviado com erro no email
