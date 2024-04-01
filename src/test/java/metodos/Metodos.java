package metodos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void scroll(int size) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0," + size + ")", "");
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Erro no scroll " + e.getCause());
		}
	}
	
	public void scrollUp(int tamanho) { 
	    try {
	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        Thread.sleep(3000);
	         jse.executeScript("window.scrollBy(0," + -tamanho + ")", "");
	        Thread.sleep(3000);
	    } catch (Exception e) {
	        System.out.println("Erro no scroll " + e.getCause());
	    }
	}

	public void selecionarGenero(String genero, String passo) {
		try {
			driver.findElement(By.xpath("//label[text()='" + genero + "']")).click();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void preencherDataDeNascimento(int diaNasc, String mesNasc, String anoNasc, String passo) {
		try {
			WebElement btnNasc = driver.findElement(By.id("dateOfBirthInput"));
			btnNasc.click();

			WebElement selectMes = driver.findElement(By.xpath("//*[@class='react-datepicker__month-select']"));
			Select selecionarMes = new Select(selectMes);
			selecionarMes.selectByVisibleText(mesNasc);

			WebElement selectAno = driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
			Select selecionarAno = new Select(selectAno);
			selecionarAno.selectByVisibleText(anoNasc);

			driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0" + diaNasc
					+ "'][text()='" + diaNasc + "']")).click();

		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void assunto(By elemento, String texto, String passo) throws AWTException {
		Robot robot = new Robot();
		try {
			driver.findElement(elemento).sendKeys(texto);
			robot.keyPress(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void enviarFoto(String[] localFoto, By selecArquivo, String passo) {
		try {
			for (String caminho : localFoto) {
				WebElement inputElement = driver.findElement(selecArquivo);
				inputElement.sendKeys(caminho);
			}
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void enter(By elemento, String passo) {
		try {
			WebElement inputElement = driver.findElement(elemento);
			inputElement.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void submit(By elemento, String passo) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	
	public void prtscn(String historia, String nomeDoArquivo) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./evidencias/" + historia + "/" + nomeDoArquivo + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}