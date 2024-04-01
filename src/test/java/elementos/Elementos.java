package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By nome = By.id("firstName");
	public By sobrenome = By.id("lastName");
	public By email = By.id("userEmail");
	public By contato = By.id("userNumber");
	
	public By btnNasc = By.xpath("//input[@id='dateOfBirthInput']");
	
	public By masculino = By.xpath("//label[normalize-space()=\"Male\"]");
	public By feminino = By.xpath("//label[normalize-space()=\"Famale\"]");
	public By outros = By.xpath("//label[normalize-space()=\"Other\"]");
	
	public By btnAssunto = By.id("subjectsInput");
	
	public By esporte = By.xpath("//label[normalize-space()=\"Sports\"]");
	public By leitura = By.xpath("//label[normalize-space()=\"Reading\"]");
	public By musica = By.xpath("//label[normalize-space()=\"Music\"]");
		
	public By selecArquivo = By.id("uploadPicture");
	
	public By endereco = By.xpath("//textarea[@id='currentAddress']");
	public By estado = By.xpath("//input[@id='react-select-3-input']");
	public By cidade = By.xpath("//input[@id='react-select-4-input']");
	
	public By submit = By.xpath("//button[@id='submit']");
	public By btnCloseAlert = By.xpath("//button[@id='closeLargeModal']");
	
}
