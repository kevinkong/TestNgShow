package org.chenkan.testngshow;

import org.testng.annotations.*;

public class TestApple {

    @BeforeClass
    public void doBeforeClassA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- Before Class A --");
    }

    @BeforeClass
    public void doBeforeClassB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- Before Class B --");
    }

    @BeforeMethod
    public void doBeforeMethodA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- Before Method A --");
    }

    @BeforeMethod
    public void doBeforeMethodB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- Before Method B --");
    }

    @Test
    public void doTestA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- Test A --");
    }

    @Test
    public void doTestB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- Test B --");
    }

    @AfterMethod
    public void doAfterMethod() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- After Method --");
    }

    @AfterClass
    public void doAfterClass() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- TestApple.java -- After Class --");
    }
}
