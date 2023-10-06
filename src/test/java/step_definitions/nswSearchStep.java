package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nswSearchStep {

    private WebDriver webDriver;
    public nswSearchStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^User Click Search Field and input Apply for a number plate$")
    public void userClickSearchFieldAndInputApplyForANumberPlate() throws InterruptedException {
        WebElement searchFieldAndInput = webDriver.findElement(By.xpath("//section[@class='personalised-content']/div[@class='region']/div[1]//input[@name='q']"));
        searchFieldAndInput.clear();
        searchFieldAndInput.sendKeys("Apply for a number plate");
        WebElement clickSearch = webDriver.findElement(By.xpath("//section[@class='personalised-content']/div[@class='region']/div[1]//button[@class='button button--primary']"));
        clickSearch.click();
        Thread.sleep(2000);
    }

    @Then("^User Click menu Find Locations$")
    public void userClickMenuFindLocations() throws InterruptedException{
        WebElement clickMenuLocation = webDriver.findElement(By.xpath("//ul[@class='MainNav__list-peZtddYtxn']/li[.='Find locations']"));
        clickMenuLocation.click();
        Thread.sleep(1000);
    }

    @Then("^User click and search \"([^\"]*)\" on Suburb Locations$")
    public void userClickAndSearchOnSuburbLocations(String locations) throws InterruptedException {
        WebElement clickAndSearchSuburbLoc = webDriver.findElement(By.xpath("//input[@id='locatorTextSearch']"));
        clickAndSearchSuburbLoc.clear();
        clickAndSearchSuburbLoc.sendKeys(locations);
        Thread.sleep(1000);
        WebElement clickButton = webDriver.findElement(By.cssSelector(".button--primary"));
        clickButton.click();
        Thread.sleep(1000);
    }
}
