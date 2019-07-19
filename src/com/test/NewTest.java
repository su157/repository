package com.test;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void testgoogle() 
  {
	  System.out.println("in test google");
  }
  @Test(priority=2)
  public void testTwitter()
  {
	  System.out.println("in test twitter");
  }
  @Test(priority=3,enabled=false)
  public void testfacebook()
  {
	  System.out.println("in test facebook");
  }
  
}
