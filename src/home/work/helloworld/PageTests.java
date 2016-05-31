package home.work.helloworld;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testp.Page;

/**
 * Created by Lena on 24.05.2016.
 */
public class PageTests {
    Page page2 =new Page();
    @BeforeMethod
    public void testBeforePage(){
        //Page page =new Page();
        page2.setURL("HELL");
        System.out.println("Precondition");
    }
    @Test(priority = 2, description = "pam pam pam", enabled = true )
    public void testPage(){
        Boolean a = true;
        Boolean b = true;
        Integer intA = 2;
        Integer intB = 2;
        Page page1 =new Page();
        String url = page1.getUrl();
        /*System.out.println("url is "+url);
        Assert.assertEquals(4, intA+intB, "2+2!=4");
        Assert.assertEquals(a, b, "true not false");
        Assert.assertEquals(url, "", "Object Page has wrong url -"+url);*/
        Calculator result = new Calculator();
        //result.Calculator(7,"/", 0);

        Assert.assertEquals(result.Calculator(7,"/", 0), null, "true not false");


    }
    @Test  (priority = 3)
    public void testPage2(){

        String actualURL = page2.getUrl();
        System.out.println("url is "+actualURL);
        Assert.assertEquals(actualURL, "HELL", "Object Page has wrong url -"+actualURL);
        Calculator result = new Calculator();
        //result.Calculator(7,"/", 0);

        Assert.assertEquals(result.Calculator(7,"*", 0), 0.0, "true not false");
    }
    @Test (priority = 1)
    public void testPage3(){
        Calculator result = new Calculator();
        //result.Calculator(7,"/", 0);

        Assert.assertEquals(result.Calculator(7,"**", 0), null, "true not false");
    }
}
