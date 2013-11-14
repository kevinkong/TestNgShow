package org.chenkan.testngshow;

import org.testng.annotations.*;

public class TestCookie extends BaseTest {

    @BeforeMethod
    public void doBeforeMethod() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestCookie.java -- Run @BeforeMethod --");
    }

    @AfterMethod
    public void doAfterMethod() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestCookie.java -- Run @AfterMethod --");
    }

    @Test(dataProvider = "data")
    public void doTest(String str, int num) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestCookie.java -- Run @Test with parameters -- " + str + num);
    }

    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {"No.",    1},
                {"Num",    2},
                {"  #",    3},
        };
    }

}
