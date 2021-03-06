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

WebUI.setText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_username'), 'matthew@advallu.com')

WebUI.setEncryptedText(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/input_Welcome back friend_password'), 
    'rDU4owkjm04=')

WebUI.click(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Login Page/button_Log In'))

WebUI.waitForElementPresent(findTestObject('ProfitFarmers_OR/Page_ProfitFarmers/Dashboard/h2_Signals'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.profitfarmers.com/signup/')

WebUI.verifyElementNotPresent(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Sign Up/h2_Sign UpGet set up in minutes'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

