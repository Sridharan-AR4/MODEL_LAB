package com.example;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    WebDriver driver;
    
    @Test
    public void test1() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.ixigo.com/");
        Thread.sleep(5000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[1]/div[1]/div/button[2]"))).click();
        Thread.sleep(3000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/p[2]"))).click();
        Thread.sleep(3000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/input"))).sendKeys("IDP");
        Thread.sleep(3000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/li/div[2]/p[1]/span[1]"))).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div"))).click();
        Thread.sleep(3000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input"))).sendKeys("DEL");
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/li/div[2]/p[1]/span[1]"))).click();
        Thread.sleep(3000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/div/div/div/p[1]"))).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/button[2]"))).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/button[4]"))).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[5]/div/div[3]"))).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[2]/button"))).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/button"))).click();
        Thread.sleep(10000);
        driver.quit();
    }
    public  static void datepicker(WebElement e,String datexpath,String nextxpath,WebDriver driver){
        while(true){
            String str=e.getText();
            String [] strs=str.split(" ");
            String month=strs[0];
            String year=strs[1];
            if(month.equalsIgnoreCase("May") && year.equalsIgnoreCase("2024")){
               driver.findElement((By.xpath(datexpath))).click();
               break;
            }
            driver.findElement((By.xpath(nextxpath))).click();
        }
    }
}
