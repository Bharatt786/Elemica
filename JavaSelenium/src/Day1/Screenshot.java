import java.text.SimpleDateFormat;

import org.openqa.selenium.TakesScreenshot;

public class ScreenshotDemo {
    @Test
    public void testScreenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com/");

        // 1. create the object reference of TakesScreenshot
        // assign current driver to it, typecast into TakesScreenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call getScreenshotAs() method using ts
        // store it into file object

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        // 3 . copy this file object into a real image file
        FileUtils.copyFile(scrFile,new File("D:\\screenshots\\"+fileName));


    }
}
