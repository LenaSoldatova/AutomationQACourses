package lesson4;

import home.work.helloworld.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;




/**
 * Created by nsokh on 5/31/16.
 */

public class DataProviderTest {

  /*  @DataProvider(name = "Addition", parallel = true)

    public static Object[][] credentials() {

        return new Object[][] { {2, "*", 2 ,4},{3, "+",2 ,5}, {10, "/",2 ,5}, {3, "-",3 ,0}, {3, "",4 ,7}, {2, "",2 ,4}, {2, "",2 ,4}, {2, "",2 ,4},
                {0, "*",0 ,0},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},
                {2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},
                {2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},
                {2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4},{2, "+",2 ,4}};

    }*/
    @DataProvider(name = "exeption", parallel = true)
    public Object[][] Authentication() throws Exception{

        Object[][] testObjArray = ExcelUtils.getTableArray("C:/TestData1.xlsx","Лист1");
        System.out.println(testObjArray.length);

        return (testObjArray);

    }

    /*public static Object[][] exeptionCred() {

        return new Object[][] { {0, "/", 2},{3, "/",0},{3, "*",0}};

    }*/

  /*  @Test(dataProvider = "Addition" )

    public void test(double a, String action, double b, double c) throws InterruptedException {

        Calculator actualResult=  new Calculator();
        //actualResult.Calculator(a, action, b);
        double expectedResult = c;
        Assert.assertEquals(actualResult.Calculator(a, action, b), expectedResult, "Addition method failed");
        Thread.sleep(1000);
        }
*/
    @Test(dataProvider = "exeption" )

    public void test2(double a, String action, double b) throws InterruptedException {
        System.out.println(a);
        System.out.println(action);
        Calculator actualResult=  new Calculator();
        //actualResult.Calculator(a, action, b);
        //int expectedResult = Integer.parseInt(null);
        System.out.println(a);
        System.out.println(action);
        Assert.assertEquals(actualResult.Calculator(a, action, b), null, "Addition method failed");
        Thread.sleep(1000);
    }
}