package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public  class ApplicationPageBase {
    /*
    * @author Jahidul Islam
    * All commonly used helper methods should be created here
    *
    * */
    String pageUrl;

     public static WebDriver driver = null;

    //return status of link if it is enabled
    public static boolean isEnableStatus(WebDriver driver, WebElement web) {
        boolean en = web.isEnabled();
        return en;
    }
    public static void sendKeys(WebElement webElement, String webElementName, String keys){
        webElement.clear();
      //  TestLogger.log("Sending " + keys + " to " + webElementName);
        webElement.sendKeys(keys);
      //  TestLogger.log("Keys Sent to " + webElementName);
    }

    public static String getText(WebElement webElement, String webElementName){

       // TestLogger.log("Getting Text from " + webElementName);
      String actualText =  webElement.getText();
     // TestLogger.log("Actual text: " + actualText);

      return actualText;

    }
    public static void click(WebElement webElement, String webElementName){
       // TestLogger.log("Click " + webElementName );
        webElement.click();
        //TestLogger.log("Clicked " + webElementName);
    }
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        File filepath = new File(System.getProperty("user.dir") +  "/src/test/resources/secret.properties");
        InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
        prop.load(ism);
        ism.close();
        return prop;
    }
    public static void homePage(){
        driver.get("https://www.amazon.com");

    }
    public static void searchProduct(WebElement webElementName, String productName){

        webElementName.sendKeys(productName);
    }

    public static void clickButton(WebElement webElementName, String nameOfEleement){
        beforeClickLog(nameOfEleement);
        webElementName.click();
        afterClicking(nameOfEleement);
    }
    public static void beforeClickLog(String nameOfElement){

    }

    public static void afterClicking(String nameOfElement){

    }



    public static void testPassed(String nameOfElement){
        System.out.println("Confirming Passed :"+ nameOfElement);
    }
    public static String getDepartmentName(WebElement webElement){

        String departmentName = webElement.getText();

        return departmentName;
    }

}
