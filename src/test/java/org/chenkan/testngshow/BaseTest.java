package org.chenkan.testngshow;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeSuite
    public void doBeforeSuiteA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- Before Suite A --");
    }

    @BeforeSuite
    public void doBeforeSuiteB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- Before Suite B --");
    }

    @AfterSuite
    public void doAfterSuiteA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- After Suite A --");
    }

    @AfterSuite
    public void doAfterSuiteB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- After Suite B --");
    }

    @BeforeTest
    public void doBeforeTestA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- Before Test A --");
    }

    @BeforeTest
    public void doBeforeTestB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- Before Test B --");
    }

    @AfterTest
    public void doAfterTestA() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- After Test A --");
    }

    @AfterTest
    public void doAfterTestB() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.echo("-- After Test B --");
    }

}
