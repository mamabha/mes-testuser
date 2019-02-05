package com.mes.lib.ui;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("WhieBoxWithLogoTable"))));
	}
	public WebElement getUserNameTextBox()
	{
		WebElement element=driver.findElement(By.id("username"));
		return element;
	}
	public WebElement getPasswordNameTextBox()
	{
		return driver.findElement(By.name("pwd"));
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(By.id("loginButton"));					
	}
	public WebElement getLoginError()
	{
		return driver.findElement(By.xpath("//span[text()='Usern']"));					
	}

}
