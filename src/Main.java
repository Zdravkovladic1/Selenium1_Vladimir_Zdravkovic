
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://bvtest.school.cubes.rs/login");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
        WebElement logInButton = driver.findElement(By.className("btn-primary"));
        logInButton.click();

        WebElement categoriesButton = driver.findElement(By.linkText("Categories"));
        categoriesButton.click();

        WebElement addCategoryButton = driver.findElement(By.className("pull-right"));
        addCategoryButton.click();

        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys("Testtttt");

        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();

        WebElement portalsButton = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTags = portalsButton.findElements(By.tagName("li"));
        liTags.get(4).click();
        System.out.println("Page title is: " + driver.getTitle() + "!");

        WebElement addPortalsButton = driver.findElement(By.className("pull-right"));
        addPortalsButton.click();

        WebElement portalTitleField = driver.findElement(By.id("title"));
        portalTitleField.sendKeys("Vladattestt");
        
        WebElement portalUrlField = driver.findElement(By.id("url"));
        portalUrlField.sendKeys("http://test.rs");
        
        WebElement portalSaveButton = driver.findElement(By.className("btn-success"));
        portalSaveButton.click();
        
//        driver.quit();

    }

}
