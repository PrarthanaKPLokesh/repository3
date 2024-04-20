package com.ProjectAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BigBasket {

	@Test
	public void Test1() throws InterruptedException
	{
		System.out.println("I  am Test");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.bigbasket.com/");
	Thread.sleep(500);
	//d.findElement(By.xpath("//div[.='Capsicum - Green (Loose)']/../../../div[5]//div//button[.='Add']")).click();


	}
}