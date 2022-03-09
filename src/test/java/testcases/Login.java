package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class Login extends PageObject{
	@Managed(driver = "chrome")
	WebDriver driver;
	
	//@FindBy(name="q")
	//WebElement googleSearch;
	
	@Title("Executing Login Test")
	@Test
	public void Logintest() {
		
		open();
		System.out.println(getTitle());
			

		WebElementFacade textBox = find(By.name("q"));
		textBox.shouldBePresent();
		textBox.typeAndEnter("serenity.dev");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}


}
