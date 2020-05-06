package com.jechrz.defs;

import Base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginStepDefs extends BaseUtil {


    private BaseUtil base;

    public LoginStepDefs(BaseUtil base){
        this.base = base;
    }

    @Given("^User navigate to the login page$")
    public void i_navigate_to_the_login_page() {

        base.getDriver().get ("http://automationpractice.com/index.php");

        base.getDriver().findElement(By.xpath ("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click ();
    }

    @And("User enter the username as {string} and password as {string}")
    public void userEnterTheUsernameAsAndPasswordAs(String userName,String pw) {

        base.getDriver().findElement(By.xpath("//*[@id=\'email\']")).sendKeys (userName);

        base.getDriver().findElement(By.xpath("//*[@id=\'passwd\']")).sendKeys (pw);
    }

    @And("^User clicks login button$")
    public void i_click_login_button() {

        base.getDriver().findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
    }

    @Then("^User is on my account page$")
    public void i_should_see_the_userform_page(){

        Assert.assertEquals("my account",
                base.getDriver()
                    .findElement(By.xpath("//*[@id=\'columns\']/div[1]/span[2]"))
                        .getText().toLowerCase());
    }


}



