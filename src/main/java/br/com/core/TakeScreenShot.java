package br.com.core;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {


    public static byte[] getImageBytes(WebDriver driver){
        return ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
    }
}
