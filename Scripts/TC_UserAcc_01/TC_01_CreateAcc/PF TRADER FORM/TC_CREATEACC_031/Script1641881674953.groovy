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

WebUI.navigateToUrl('https://www.profitfarmers.com/pf-trader/')

WebUI.setText(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Learn More - PF trader/input_GET STARTEDFOR FREE_name'), 
    'Lorem Ipsum')

WebUI.setText(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Learn More - PF trader/input_GET STARTEDFOR FREE_emailAddress'), 
    findTestData('CreateAcc Test Data').getValue(3, 1))

WebUI.click(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Learn More - PF trader/input_GET STARTEDFOR FREE_hasAgreedToAgreement'))

WebUI.sendKeys(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Learn More - PF trader/input_GET STARTEDFOR FREE_emailAddress'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Learn More - PF trader/Page_PF Trader Subscription Plans - ProfitFarmers/Quarterly Price_table'), 
    0)

