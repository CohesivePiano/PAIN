package com.example.allpointments;

import android.os.Build;

import androidx.annotation.RequiresApi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetGmail {


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void run(String recipient, String subject, String message) {
        WebDriver driver = new FirefoxDriver();
        String gmail = "allpointments@gmail.com";
        String password = "Password!@#";
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        WebElement emailFill = driver.findElement(By.tagName("Input"));
        emailFill.sendKeys(gmail + Keys.ENTER);

        WebElement Next = driver.findElement(By.className("VfPpkd-vQzf8d"));
        Next.click();

        WebElement passWordFill = driver.findElement(By.tagName("Input"));
        passWordFill.sendKeys(password + Keys.ENTER);

        WebElement next2 = driver.findElement(By.className("VfPpkd-RLmnJb"));
        next2.click();
        WebElement compose = driver.findElement(By.className("T-I T-I-KE L3"));
        compose.click();

        WebElement toWhom = driver.findElement(By.className("vO"));
        toWhom.sendKeys(recipient);

        WebElement subjectLine = driver.findElement(By.className("aoT"));
        subjectLine.sendKeys(subject);

        WebElement messageLine = driver.findElement(By.id(":xu"));
        messageLine.sendKeys(message);

        WebElement sendButton = driver.findElement(By.className("T-I J-J5-Ji aoO v7 T-I-atl L3"));
        sendButton.click();
    }

}
