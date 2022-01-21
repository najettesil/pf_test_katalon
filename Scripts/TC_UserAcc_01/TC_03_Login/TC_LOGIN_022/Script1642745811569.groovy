import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

System.setProperty('webdriver.chrome.driver', 'C:\\Katalon_Studio_Windows_64-8.2.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

WebDriver chrome = new ChromeDriver()

DriverFactory.changeWebDriver(chrome)

WebUI.navigateToUrl('https://app.profitfarmers.com/account/login')

WebUI.setText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_username'), 'matthew@advallu.com')

WebUI.setEncryptedText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_password'), 
    'rDU4owkjm04=')

WebUI.click(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/button_Log In'))

WebUI.verifyElementPresent(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Dashboard/h2_Signals'), 0, FailureHandling.STOP_ON_FAILURE)

System.setProperty('webdriver.gecko.driver', 'C:\\Katalon_Studio_Windows_64-8.2.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe')

WebDriver ff = new FirefoxDriver()

DriverFactory.changeWebDriver(ff)

WebUI.navigateToUrl('https://app.profitfarmers.com/account/login')

WebUI.setText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_username'), 'shunn.val@gmail.com')

WebUI.setEncryptedText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_password'), 
    'TSPxb4Jk+GUCZxpysgq+vg==')

WebUI.click(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/button_Log In'))

WebUI.verifyElementPresent(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Dashboard/h2_Signals'), 0, FailureHandling.STOP_ON_FAILURE)

