package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends ApplicationPageBase {

    ApplicationPageBase objOfApplictionPageBase;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    private WebElement logoDisplayed;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-orders\"]/span[2]")
    private WebElement orders;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[3]")
    private WebElement giftCards;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[7]")
    private WebElement help;

    @FindBy(how = How.ID, using = "nav-hamburger-menu")
    private WebElement menu;

    @FindBy(how = How.ID, using = "nav-your-amazon")
    private WebElement amazon;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[2]")
    private WebElement accountAndList;

    @FindBy(how = How.ID, using = "a-autoid-0-announce")
    private WebElement signIn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    private WebElement searchButton;

    public void searchBox () {
        searchBox.sendKeys("Iphone xs max case", Keys.ENTER);
        searchBox.click();
    }
    public boolean amazonLogoDisplay(){
        logoDisplayed.isDisplayed();
        return true;
    }

    public void orders (){

        objOfApplictionPageBase.click(orders,"Orders");
    }

    public void clickGiftCards() {
        objOfApplictionPageBase.click(giftCards,"gift card"); ;
    }
    public String giftCards() {
        String giftText = objOfApplictionPageBase.getText(giftCards,"gift Card");
        return giftText;

    }
    public void bat(){
        sendKeys(searchBox,"search","bat");
        click(searchButton,"search Button");
    }
    public String contactUs() {

        String getText = amazon.getText();

        return getText;

    }
    public void accountList() {

        Actions act = new Actions(driver);
        act.moveToElement(accountAndList).perform();


    }
    public String amazon() {

        String getText = amazon.getText();

        return getText;
    }
    public void getHelp(){
        objOfApplictionPageBase.click(help, "Help");

    }
    public void clickMenu(){
        objOfApplictionPageBase.click(menu, "Menu");
    }

    public String menu(){
        String getText = objOfApplictionPageBase.getText(menu, "Menu");
        return getText;

    }
    public HomePageDemo automatedSearch(String item){

        sendKeys(searchBox,"search",item);
        click(searchButton,"Search Button");
        return new HomePageDemo();
    }

    public void clickSearchButton(){

        click(searchButton,"Search Button");
    }
    public void clickSignIn(){
        objOfApplictionPageBase.click(signIn, "Sign in securely");
    }
    public String signIn(){
        String getText = objOfApplictionPageBase.getText(signIn, "Sign in securely");
        return getText;
    }
    public void searchIphone(){
        sendKeys(searchBox,"search","Iphone XS Max");
        click(searchButton,"Search Button");

    }















}
