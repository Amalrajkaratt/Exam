package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Meesho_Page {

	WebDriver driver;
	
	//Object repository
	By searchbox=By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input");
	By men=By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[5]");
	By jewellery=By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p");
	By hair_color=By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[15]/div[2]/div/span[3]/a");
	
	
	//Constructor
	public Meesho_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void search()
	{
		driver.findElement(searchbox).sendKeys("Saree");
	}
	
	public void men()
	{
		driver.findElement(men).click();
		driver.findElement(jewellery).click();
	}
	
	public void verify_title()
	{
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="meesho.com";
		Assert.assertEquals(act_title, exp_title);
	}
	
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(hair_color).click();
	}
	
}
