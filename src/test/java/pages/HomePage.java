package pages;

import java.awt.AWTException;

import elementos.Elementos;
import metodos.Metodos;
import utils.MassaDeDados;

public class HomePage {

	Metodos metodo = new Metodos();
	MassaDeDados massa = new MassaDeDados();
	Elementos el = new Elementos();

	public void enviarDados() throws AWTException {
		metodo.escrever(el.nome, massa.nome, "Preenchendo campos do nome");
		metodo.escrever(el.sobrenome, massa.sobrenome, "Preenchendo campos do sobrenome");
		metodo.escrever(el.email, massa.email, "Preenchendo campos do e-mail.");
		metodo.selecionarGenero("Female", "Selecionando genero feminino");
		metodo.escrever(el.contato, massa.contato, "Preenchendo campos de contato");
		metodo.scroll(300);
		metodo.clicar(el.btnNasc, "Clicando no calendário");
		metodo.preencherDataDeNascimento(27, "November", "1986", "Preenchendo dia mê e ano de nascimento");
		metodo.assunto(el.btnAssunto, massa.assunto, "Informando assunto");
		metodo.clicar(el.musica, "Selecionando hobbie");
		metodo.scroll(300);
	}
	
	public void branco() {
		metodo.scroll(700);

	}
	
	public void enviarSemMobile() throws AWTException {
		metodo.escrever(el.nome, massa.nome, "Preenchendo campos do nome");
		metodo.escrever(el.sobrenome, massa.sobrenome, "Preenchendo campos do sobrenome");
		metodo.escrever(el.email, massa.email, "Preenchendo campos do e-mail.");
		metodo.selecionarGenero("Female", "Selecionando genero feminino");
		metodo.scroll(300);
		metodo.clicar(el.btnNasc, "Clicando no calendário");
		metodo.preencherDataDeNascimento(27, "November", "1986", "Preenchendo dia mê e ano de nascimento");
		metodo.assunto(el.btnAssunto, massa.assunto, "Informando assunto");
		metodo.clicar(el.musica, "Selecionando hobbie");
		metodo.scroll(300);
	}
	
	public void enviarSemEmail() throws AWTException {
		metodo.escrever(el.nome, massa.nome, "Preenchendo campos do nome");
		metodo.escrever(el.sobrenome, massa.sobrenome, "Preenchendo campos do sobrenome");
		metodo.selecionarGenero("Female", "Selecionando genero feminino");
		metodo.scroll(300);
		metodo.clicar(el.btnNasc, "Clicando no calendário");
		metodo.preencherDataDeNascimento(27, "November", "1986", "Preenchendo dia mê e ano de nascimento");
		metodo.assunto(el.btnAssunto, massa.assunto, "Informando assunto");
		metodo.clicar(el.musica, "Selecionando hobbie");
		metodo.scroll(300);
	}

	public void enviarFoto() {
		metodo.clicar(el.selecArquivo, "Clicando no botão selecionar foto");
		metodo.enviarFoto(new String[] { massa.localArquivo }, el.selecArquivo, "Enviando imagem");
	}

	public void enviarEndereco() {
		metodo.escrever(el.endereco, massa.endereco, "Preenchendo campos de endereço.");
		metodo.scroll(500);
	}

	public void enviarEstado() {
		metodo.escrever(el.estado, massa.estado, "Selecionando cidade.");
		metodo.enter(el.estado, "Confirmando com tecla enter.");
	}

	public void enviarCidade() {
		metodo.escrever(el.cidade, massa.cidade, "Selecionando cidade.");
		metodo.enter(el.cidade, "Confirmando com tecla enter.");
	}

	public void enviarForm() {
		metodo.submit(el.submit, "Clicando no botão submit");
	}

	public void evidenciaDadosEnviado() {
		metodo.prtscn("positivo", "formulario.enviado");
	}

	public void confirmaEnvio() {
		metodo.clicar(el.btnCloseAlert, "Fechando envio");
	}
	
	public void evidenciaDadosBranco() {
		metodo.scrollUp(500);
		metodo.prtscn("negativo", "formulario.branco");
	}
	
	public void evidenciaEmail() {
		metodo.scrollUp(500);
		metodo.prtscn("negativo", "formulario.email");
	}
	public void evidenciaMobile() {
		metodo.scrollUp(500);
		metodo.prtscn("negativo", "formulario.contato");
	}
}
