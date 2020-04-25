package com.jechrz.defs;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println ("Opening Browser: MOCK");

        base.setDriver(new ChromeDriver());

        base.getDriver().manage().timeouts().implicitlyWait(1250, TimeUnit.MILLISECONDS);

    }

    @After
    public void TearDownTest(){
        System.out.println ("Closing Browser: MOCK");
        base.getDriver().close();
    }

}
