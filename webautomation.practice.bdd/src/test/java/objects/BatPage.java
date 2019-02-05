package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BatPage extends ApplicationPageBase {

    @FindBy(xpath = "//span[text()='Baseball & Softball Bats']")
    private WebElement softBallBat;

    @FindBy(xpath = "//span[text()='Baseball Bats']")
    private WebElement baseBallBat;

    @FindBy(xpath = "//span[text()='Hunting & Tactical Knives & Tools']")
    private WebElement huntingTool;

    @FindBy(xpath = "//span[text()='Hunting Knives']")
    private WebElement huntingKnives;

    @FindBy(xpath = "//span[text()='Baseball & Softball Starter Equipment']")
    private WebElement baseBallStarterEquipment;

    @FindBy(xpath = "//span[text()='TV']")
    private WebElement tv;

    @FindBy(xpath = "//span[text()='Prime Video']")
    private WebElement primeVideo;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[2]/span/a/span")
    private WebElement kidsBaseballBat;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[4]/span/a/span")
    private WebElement kidsSport;

    @FindBy(xpath = "//span[text()='Stuffed Animals & Plush Toys']")
    private WebElement stuffedAnimal;




    public String softBallText(){
        String getText = getText(softBallBat,"SoftBall Bat");
        return getText;
    }


    public String baseBallText(){
        String getText = getText(baseBallBat,"Baseball Bat");
        return getText;
    }


    public String huntingToolText(){
        String getText = getText(huntingTool,"Hunting Tool");
        return getText;
    }


    public String huntingKnivesText(){
        String getText = getText(huntingKnives,"Hunting Knives");
        return getText;
    }



    public String baseBallStarterEquipmentText(){
        String getText = getText(baseBallStarterEquipment,"Baseball Starter Equipment");
        return getText;
    }


    public String tvText(){
        String getText = getText(tv,"Tv");
        return getText;
    }


    public String primeVideoText(){
        String getText = getText(stuffedAnimal,"Prime Video");
        return getText;
    }

    public String kidsBaseBallBatText(){
        String getText = getText(kidsBaseballBat,"Kids Baseball Bat");
        return getText;
    }

    public String kidsSportText(){
        String getText = getText(kidsSport,"Kids Sport");
        return getText;
    }

    public String stuffedAnimalText(){
        String getText = getText(stuffedAnimal,"Stuffed Animal");
        return getText;
    }

}
