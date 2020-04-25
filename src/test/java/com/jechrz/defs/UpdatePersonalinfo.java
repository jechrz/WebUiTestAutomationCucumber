package com.jechrz.defs;

import Base.BaseUtil;
import Base.UserInfo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Map;


public class UpdatePersonalinfo extends BaseUtil {

    private BaseUtil base;

    private UserInfo userInfo;

    public UpdatePersonalinfo(BaseUtil base) {
        this.base = base;
    }

    private String userName, pw;

    @Given("User clicks personal information icon")
    public void user_clicks_personal_information_icon() {

        base.getDriver()
                .findElement(By.className (("icon-user")))
                    .click ();
    }

    @Then("User is on personal information page")
    public void user_is_on_personal_information_page() {

        String check1 = base.getDriver()
                .findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/h1"))
                    .getText ();
        check1.toLowerCase()
                .equals("your personal information");
    }

    @Given("Social title radio buttons are visible to user")
    public void social_title_radio_buttons_are_visible_to_user() {


        base.getDriver()
                .findElement(By.xpath ("//*[@id=\'id_gender1\']"));
        base.getDriver()
                .findElement(By.xpath ("//*[@id=\'id_gender2\']"));
    }

    @When("User clicks on non-selected title")
    public void user_clicks_on_non_selected_title() {


        Boolean selected = base.getDriver()
                .findElement(By.xpath ("//*[@id=\'id_gender1\']")).isSelected();

        if (selected){
            base.getDriver()
                    .findElement(By.xpath ("//*[@id='id_gender2']")).click ();
        }else {
            base.getDriver()
                    .findElement (By.xpath ("//*[@id='id_gender1']")).click();
        }
    }

    @When("User enters current password")
    public void user_inputs_current_password() {

        base.getDriver()
                .findElement(By.xpath("//*[@id=\'old_passwd\']"))
                    .sendKeys ("G3thyphy!?!");
    }

    @When("User clicks on Save")
    public void user_clicks_on_Save() {

        base.getDriver()
                .findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/fieldset/div[11]/button/span"))
                    .click();
    }

    @Then("User's personal information is updated")
    public void user_s_personal_information_is_updated() {

        Assert.assertEquals(base.getDriver()
                .findElement(By.xpath("//*[@id=\"center_column\"]/div/p"))
                    .getText().toLowerCase(), "your personal information has been successfully updated.");
    }

    @When("User enters the following for his\\/her updated first name, last name and email")
    public void user_enters_the_following_for_his_her_updated_first_name_last_name_and_email(DataTable tableX) {

        List<Map<String, String>> userData = tableX.asMaps(String.class, String.class);

        userInfo = new UserInfo();

        for (int i=0; i< userData.size(); i++){
            userInfo.setFirstName(userData.get(i).get("First Name"));
            userInfo.setLastName(userData.get(i).get("Last Name"));
            userInfo.setEmail(userData.get(i).get("Email Address"));
        }

        base.getDriver()
                .findElement(By.xpath("//*[@id=\'firstname\']"))
                    .clear();
        base.getDriver()
                .findElement(By.xpath("//*[@id=\'lastname\']"))
                    .clear();
        base.getDriver()
                .findElement(By.xpath("//*[@id=\'email\']"))
                    .clear();

        base.getDriver()
                .findElement(By.xpath("//*[@id=\'firstname\']"))
                    .sendKeys(userInfo.getFirstName());
        base.getDriver()
                .findElement(By.xpath("//*[@id=\'lastname\']"))
                    .sendKeys(userInfo.getLastName());
        base.getDriver()
                .findElement(By.xpath("//*[@id=\'email\']"))
                    .sendKeys(userInfo.getEmail());

    }

}
