package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class Simpletest {
  @Test
  public void f() {
	  System.out.println("f function");
  }
  void show(){
	  System.out.println("Show method");
  }
 public static void main(String[] args) {
	System.out.println("MAin class");
}
}
