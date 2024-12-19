package dragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		assertEquals("Droppable | jQuery UI", driver.getTitle());
		System.out.println("Title matched");
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(5000);
		System.out.println("DragandDropCompleted");
		driver.switchTo().defaultContent();
		driver.close();
	}
}
