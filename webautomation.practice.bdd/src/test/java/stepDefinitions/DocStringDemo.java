package stepDefinitions;

import cucumber.api.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;

public class DocStringDemo {
    @Given("^a blog post named \"([^\"]*)\" with Markdown body$")
    public void a_blog_post_named_with_Markdown_body(String arg1, String arg2) throws Throwable {

      //  System.out.println("Argument1: " + arg1);
        arg1 = "Say what you are doing";
        System.out.println("Argument2: " + arg2);



        Assert.assertEquals(arg2, "Hello");


    }

}
