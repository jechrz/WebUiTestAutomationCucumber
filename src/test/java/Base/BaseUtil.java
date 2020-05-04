package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseUtil {

    private WebDriver driver;

    private UserInfo userInfo;

    private Actions actionsBuilder;

    public WebDriver getDriver() {return driver;}

    public void setDriver(WebDriver driver) {this.driver = driver;}

    public UserInfo getUserInfo() {return userInfo;}

    public void setUserInfo(UserInfo userInfo) {this.userInfo = userInfo;}

    public Actions getActionsBuilder(){return actionsBuilder;}

    public void setActionsBuilder(Actions actionsBuilder){this.actionsBuilder = actionsBuilder;}


}
