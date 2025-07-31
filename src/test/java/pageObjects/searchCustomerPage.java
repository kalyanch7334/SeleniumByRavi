package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.waitHelper;

import java.util.List;

public class searchCustomerPage {

    public WebDriver ldriver;
    waitHelper helper;


    public searchCustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
        helper=new waitHelper(ldriver);

    }

    //locate elements

    @FindBy(xpath=("//input[@id='SearchEmail']"))
    @CacheLookup
    WebElement txt_email;

    @FindBy(xpath=("//button[@id='search-customers']"))
    @CacheLookup
    WebElement txt_serach;

    @FindBy(xpath=("//table[@id='customers-grid']"))
    @CacheLookup
    WebElement txt_table;

    @FindBy(xpath=("//table[@id='customers-grid']//tr"))
    @CacheLookup
    List<WebElement> txt_tableRows;


    //Action methods

    public void setEmail(String email)
    {
        helper.waitForElement(txt_email,5);
        txt_email.clear();
        txt_email.sendKeys(email);

    }

    public void setClickSearch()
    {
        helper.waitForElement(txt_serach,5);
       txt_serach.click();

    }

    public int getNoOfRows()
    {
        return txt_tableRows.size();
    }

   public boolean setSearchCustomerByEmail(String email)
    {
        boolean flag=false;

           for(int i=1;i<=getNoOfRows();i++)
           {
               String emailid=txt_table.findElement(By.xpath("//table[@id='customers-grid']//tr["+i+"]//td[2]")).getText();
               if(emailid.equals("steve_gates@nopCommerce.com"))
               {
                   return true;
               }

           }
           return flag;

    }







}
