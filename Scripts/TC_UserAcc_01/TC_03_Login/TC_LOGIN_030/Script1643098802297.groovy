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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.profitfarmers.com/account/login')

WebUI.setText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_password'), 'Lisette123!')

WebUI.sendKeys(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_password'), Keys.chord(
        Keys.TAB))

WebUI.verifyElementNotPresent(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/Login Error messages/div_Password must meet the following requirements'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/Login Error messages/div_password requirement checklist'), 
    0)

WebUI.closeBrowser()

