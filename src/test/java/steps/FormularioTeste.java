package steps;

import java.awt.AWTException;

import drivers.DriversFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.HomePage;
import runner.Executa;

public class FormularioTeste extends DriversFactory {

	HomePage page = new HomePage();

	@Given("que o usuario esteja na tela do formulario de registro de estudantes")
	public void queOUsuarioEstejaNaTelaDoFormularioDeRegistroDeEstudantes() {
		Executa.openBrowse();
	}

	@When("todos os campos sao preenchidos corretamente")
	public void todosOsCamposSaoPreenchidosCorretamente() throws AWTException {
		page.enviarDados();
	}

	@When("enviar foto de perfil")
	public void enviarFotoDePerfil() {
		page.enviarFoto();
	}

	@When("enviar dados de endereco")
	public void enviarDadosDeEndereco() {
		page.enviarEndereco();
	}

	@When("selecionar estado")
	public void selecionarEstado() {
		page.enviarEstado();
	}

	@When("selecionar cidade")
	public void selecionarCidade() {
		page.enviarCidade();
	}

	@When("o usuario clica no botao Submit")
	public void oUsuarioClicaNoBotaoSubmit() {
		page.enviarForm();
	}

	@Then("o sistema deve exibir modal")
	public void oSistemaDeveExibirModal() {
		page.evidenciaDadosEnviado();
		page.confirmaEnvio();
		Executa.closeBrowser();
	}

	@When("campos nao sao preenchidos")
	public void camposNaoSaoPreenchidos() {
		page.branco();
	}

	@When("o usuario clica no botão Submit")
	public void oUsuarioClicaNoBotãoSubmit() {
		page.enviarForm();
	}

	@Then("formulario nao enviado")
	public void formularioNaoEnviado() {
		page.evidenciaDadosBranco();
		Executa.closeBrowser();

	}

	@When("nao informar mobile no preenchimento de dados")
	public void naoInformarMobileNoPreenchimentoDeDados() throws AWTException {
		page.enviarSemMobile();
	}

	@Then("formulario nao enviado com erro no mobile")
	public void formularioNaoEnviadoComErroNoMobile() {
		page.evidenciaMobile();
		Executa.closeBrowser();

	}

	@When("nao informar email no preenchimento de dados")
	public void naoInformarEmailNoPreenchimentoDeDados() throws AWTException {
		page.enviarSemEmail();
	}

	@When("o usuário clica no botao Submit")
	public void oUsuárioClicaNoBotaoSubmit() {
		page.enviarForm();
	}

	@Then("formulario nao enviado com erro no email")
	public void formularioNaoEnviadoComErroNoEmail() {
		page.evidenciaEmail();
		Executa.closeBrowser();

	}

}
