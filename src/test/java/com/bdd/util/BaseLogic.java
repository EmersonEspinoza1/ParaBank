package com.bdd.util;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BaseLogic extends PageObject {
    public WebElement getElemento(String cssSelector){
        String documentQuerySelector = "return document.querySelector(\"";
        String query = documentQuerySelector + cssSelector + "\")";
        JavascriptExecutor ex = (JavascriptExecutor) getDriver();
        WebElement elemento = (WebElement) ex.executeScript(query,new Object[0]);

        if(elemento == null)
        {
            System.out.println("No encontro elemento");
        }else{
            System.out.println("Encontro elemento");
        }

        return elemento;
    }

    public WebElement getElementoXpath(String xpath){
        WebElement element = getDriver().findElement(By.xpath(xpath));

        if(element == null)
        {
            System.out.println("No encontro elemento");
        }else{
            System.out.println("Encontro elemento");
        }

        return element;
    }

    public void sleep(long time){
        try{
            Thread.sleep(time);
        }catch (Exception e){}
    }

    public void scroll(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollMiddle(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
    }
}
