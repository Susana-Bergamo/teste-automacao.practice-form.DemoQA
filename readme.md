<p align="center">
  <img width="250" height="250" src="https://github.com/Susana-Bergamo/teste-automacao.practice-form.DemoQA/blob/main/automacao.png">
  </p>

# Automação de Testes - Preenchimento de Formulário 👩🏼‍💻

Este projeto visa automatizar os testes para um formulário de registro de estudantes no site DemoQA, utilizando as tecnologias Java, Cucumber, Selenium WebDriver.
O projeto segue os princípios da Programação Orientada a Objetos (POO) e implementa o padrão de design Page Object Model (POM) para melhor organização e reuso de código.

## Funcionalidades Testadas

O projeto abrange testes para diversas funcionalidades do formulário de registro:

* Preenchimento e Envio de Dados:
  - Validação do preenchimento correto de todos os campos do formulário.
  - Upload de foto de perfil.
  - Preenchimento e validação de dados de endereço.
  - Seleção de estado e cidade.
  - Submissão do formulário e validação da mensagem de sucesso.

* Validação de Erros:
  - Validação de campos em branco.
  - Validação do campo de contato com telefone inválido.
  - Validação do campo de email com endereço inválido.

 * Demonstração de Conceitos de POO e POM:
     - O projeto demonstra a implementação do padrão de design Page Object Model (POM), separando a lógica da página da lógica de teste.
     - As classes de página encapsulam elementos da web e ações específicas para cada página.
     - O código segue princípios de POO como herança, encapsulamento e reuso de código.

* Captura de Evidências:
   - Uma pasta na raiz do projeto armazena prints dos testes, capturando informações visuais da execução dos testes.
   - As imagens facilitam a análise visual dos resultados dos testes e a identificação de falhas.
  

## Tecnologias Empregadas
* Linguagem de Programação: Java.
* Estrutura BDD: Cucumber.
* Ferramenta de Automação de Testes Web: Selenium WebDriver.

## Exemplos e Detalhes Adicionais
* Exemplo de Cenário de Teste: Validar a submissão do formulário com todos os campos preenchidos corretamente.
* Detalhes sobre a Implementação do POM: Cada página do formulário possui uma classe dedicada que encapsula seus elementos e ações.
* Benefícios do Uso de POO e POM: Maior legibilidade, modularidade e manutenabilidade do código.

## Observações
Este resumo serve como um guia geral do projeto.
Para informações mais detalhadas, consulte o código-fonte e a documentação.
O projeto está em constante desenvolvimento e pode ser adaptado para atender às suas necessidades específicas.

## Considerações Finais:
O presente projeto demonstra a automação de testes para um formulário de registro de estudantes, utilizando as melhores práticas de desenvolvimento com Java, Cucumber, Selenium WebDriver e POO. 
O projeto oferece um ponto de partida para automatizar testes de interfaces web de forma eficiente e modular.
Este projeto partiu de um desafio da [E2E Coders](https://ead.e2etreinamentos.com.br/), no qual foi um oportunidade para demonstrar minhas habilidades.
