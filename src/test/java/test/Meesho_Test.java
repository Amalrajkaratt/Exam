package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Meesho_Page;

public class Meesho_Test {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.meesho.com/");
	}

	@Test
	public void test()
	{
		Meesho_Page ob=new Meesho_Page(driver);
		
		ob.search();
//		ob.men();n
		ob.verify_title();
		ob.scroll();
	}
}
