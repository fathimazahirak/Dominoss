package org.Runnerdom;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Domfeature\\Dominoss.feature",glue="org.DomStepdefn")

public class Runnerdominos {
 public static WebDriver driver ;
     
     @BeforeClass
     public static void Start() {
		 driver = new ChromeDriver();

	}
     
     
     
     
     
     
     
     

}
