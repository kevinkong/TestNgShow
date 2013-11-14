package org.chenkan.testngshow;

import org.testng.annotations.*;

public class TestBanana extends BaseTest {

    @BeforeClass
    public void doBeforeClassA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- Before Class A --");
    }

    @BeforeClass
    public void doBeforeClassB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- Before Class B --");
    }

    @BeforeMethod
    public void doBeforeMethodA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- Before Method A --");
    }

    @BeforeMethod
    public void doBeforeMethodB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- Before Method B --");
    }

    @Test
    public void doTestA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- Test A --");
    }

    @Test
    public void doTestB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- Test B --");
    }

    @AfterMethod
    public void doAfterMethod() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- After Method --");
    }

    @AfterClass
    public void doAfterClass() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestBanana.java -- After Class --");
    }
}
