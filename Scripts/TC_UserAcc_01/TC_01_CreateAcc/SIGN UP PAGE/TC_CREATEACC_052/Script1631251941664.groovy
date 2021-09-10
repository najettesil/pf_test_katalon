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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.profitfarmers.com/signup/')

WebElement clickEye = WebUiCommonHelper.findWebElement(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/i_enterPass_fas fa-eye'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(clickEye))

WebElement clickEye2 = WebUiCommonHelper.findWebElement(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/i_re-enterPass_fas fa-eye'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(clickEye2))

WebUI.setEncryptedText(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/input_Get set up in minutes_password'), 
    'dgQCD+SCZeOBmBJBofgBNA==')

WebUI.setEncryptedText(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/input_Get set up in minutes_confirmPassword'), 
    'dgQCD+SCZeOBmBJBofgBNA==')

WebUI.verifyElementAttributeValue(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/input_Get set up in minutes_password'), 
    'type', 'text', 0)

WebUI.verifyElementAttributeValue(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/input_Get set up in minutes_confirmPassword'), 
    'type', 'text', 0)

WebUI.closeBrowser()

