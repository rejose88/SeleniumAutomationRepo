package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void sampleTest() {
		System.out.println("This is a sample test method.");
	}
	
	@BeforeMethod
	public void sampleBeforeMethod()
	{
		System.out.println("This is a sample before method");
	}
	
	@AfterMethod
	public void sampleAfterMethod()
	{
		System.out.println("This is a sample after method");
	}
	
	@BeforeClass
	public void sampleBeforeClass()
	{
		System.out.println("Sample Before class");
	}
	
	@AfterClass
	public void sampleAfterClassMethod()
	{
		System.out.println("Sample After class ");
	}
	
	@BeforeTest
	public void sampleBeforeTest()
	{
		System.out.println("Sample Before Test");
	}
	
	@AfterTest
	public void sampleAfterTest()
	{
		System.out.println("Sample after Test");
	}
	@BeforeSuite
	public void sampleBeforeSuite()
	{
		System.out.println("Sample Before Test Suite");
	}
	@AfterSuite
	public void sampleAfterSuite()
	{
		System.out.println("Sample After Test suite");
	}

}
