package week2day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args){
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			// driver.get("https://wf6.myhcl.com/ESS/esshome.aspx");
			 
			 driver.manage().window().maximize();
			 
			 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 
			 //now creating a new user under Leads tab
			 driver.findElement(By.linkText("Create Lead")).click();
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Technologies Ltd");
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("GOUTHAM");
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RADHAKRISHNAN");
			 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("GOUTHAM R");
			 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation-Selenium");
			 driver.findElement(By.id("createLeadForm_description")).sendKeys("MAR 19 - SELENIUM Training - TestLeaf");
			 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("trickytot@gmail.com");
			 WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dd = new Select(eleSource);
				dd.selectByVisibleText("Employee");
				WebElement stateprov = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select gg = new Select(stateprov);
				gg.selectByVisibleText("New York");
			 driver.findElement(By.name("submitButton")).click();
			 
			 System.out.println("The title is: "+ driver.getTitle());
		     if(driver.getTitle().contains("TestLeaf")) {
		    	 System.out.println("I confirm the title has TESTLEAF.........");
		     }
		     else {
		    	 System.out.println("The titile does not have the word TESTLEAF..........");
		     }
			 
			 
			// String text = driver.findElement(By.id("viewlead_firstname_sp")).getText();
			// System.out.println(text);
			 //String title =driver.getTitle();
			// System.out.println(title);
			// Thread.sleep(5000);
			 
			 driver.close();
	}

}