package org.Basedominos;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
public static WebDriver driver;
	
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void toClick(WebElement e) {
		e.click();
	}
	public static void toSendValue(WebElement c, String v) {
		c.sendKeys(v);
	}
	public static void toAlert(WebDriver driver) {
		Alert alrt= driver.switchTo().alert();
		alrt.accept();
	}
	public static void toDismiss(WebDriver driver) {
		Alert alrt1= driver.switchTo().alert();
		alrt1.dismiss();
	}
	public static void actionClass(WebDriver driver, WebElement f) {
		Actions a = new Actions(driver);
		driver.findElement((By) f);
		a.moveToElement(f).perform();
	}
	public static void doubleClick(WebDriver driver, WebElement d) {
		Actions a = new Actions(driver);
		driver.findElement((By) d);
		a.doubleClick(d).perform();
	}
	public static void contextClick(WebDriver driver, WebElement c) {
		Actions a = new Actions(driver);
		driver.findElement((By) c);
		a.contextClick(c).perform();
	}
	public static void TakingScreenshot(WebDriver driver, String k) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File des = new File(k);
		FileUtils.copyFile(source, des);
	}
	public static void toScroll(WebDriver driver, WebElement g) {
		WebElement scroll = driver.findElement((By) g);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("argumets[0].scrollIntoView",scroll );
	}
	public static void robotClass(int v) throws AWTException {
		Robot r = new Robot();
		r.keyPress(v);
		r.keyRelease(v);
	}
	public static void toSelect(WebElement p, int c) {
		Select drop = new Select(p);
		drop.selectByIndex(c);
		
	}
	public static void toSelect( WebElement p, String v) {
		Select drop = new Select(p);
		drop.selectByVisibleText(v);
		
	}
	
	public static void checkout(WebElement ck) {
		ck.click();

	}

}

	
	

