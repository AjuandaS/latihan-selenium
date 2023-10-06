package step_definitions;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nswBasePageStepDef {
    private WebDriver webDriver;
    public nswBasePageStepDef() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given(value = "^User open NSW website$")
    public void userOpenNSWWebsite() throws InterruptedException {
        WebElement OpenWebsite = webDriver.findElement(By.xpath(".//a[.='NSW GovernmentService NSW']"));
        OpenWebsite.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
}
