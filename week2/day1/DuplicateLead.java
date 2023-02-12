package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ChDriver=new ChromeDriver();
		
		ChDriver.get("http://leaftaps.com/opentaps/control/main");
		
		ChDriver.manage().window().maximize();
		
		ChDriver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		ChDriver.findElement(By.id("password")).sendKeys("crmsfa");
		ChDriver.findElement(By.className("decorativeSubmit")).click();
		
		
		ChDriver.findElement(By.linkText("CRM/SFA")).click();
		ChDriver.findElement(By.linkText("Leads")).click();
		ChDriver.findElement(By.linkText("Create Lead")).click();
		ChDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		ChDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthuvel");
		ChDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("Velusamy");
		ChDriver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Muthu");
		ChDriver.findElement(By.name("departmentName")).sendKeys("Quality Assurance");
		ChDriver.findElement(By.name("description")).sendKeys("Automation Test Using Selenium Script");
		ChDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthu@testleaf.com");
		
		WebElement stateElement = ChDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select listelement=new Select(stateElement);
		//listelement.selectByValue("New York");
		listelement.selectByVisibleText("New York");
		
		ChDriver.findElement(By.name("submitButton")).click();
				
		ChDriver.findElement(By.linkText("Duplicate Lead")).click();
		ChDriver.findElement(By.id("createLeadForm_companyName")).clear();
		ChDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tech Mahindra");
		ChDriver.findElement(By.id("createLeadForm_firstName")).clear();
		ChDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("MuthuVelan");
		ChDriver.findElement(By.name("submitButton")).click();
		
		String Ptitle = ChDriver.getTitle();
		System.out.println(Ptitle);
			
		
		
	}

}
