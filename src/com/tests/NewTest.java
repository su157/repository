package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Selenium1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Selenium2");
  }

  @AfterMethod
  public void afterMethod() { 
	  System.out.println("Selenium3");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Selenium4");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Selenium5");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Selenium6");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Selenium7");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Selenium8");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Selenium9");
  }

}
