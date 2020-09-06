package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LoginPageElements extends BaseClass {

	@FindBy(id = "txtUsername")
	public WebElement userNametextBox;

	@FindBy(xpath = "//input[@id = 'txtPassword']")
	public WebElement passwordTextBox;

	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;

	@FindBy(id = "divLogo")
	public WebElement syntaxLogo;

	@FindBy(id = "spanMessage")
	public WebElement spanMessage;

	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}

}
