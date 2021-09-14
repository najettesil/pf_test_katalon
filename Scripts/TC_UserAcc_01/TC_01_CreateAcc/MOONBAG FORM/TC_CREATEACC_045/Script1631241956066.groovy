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

WebUI.navigateToUrl('https://www.profitfarmers.com/free-moonbag-kit/')

WebUI.setText(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Moon Bag Free Trading signals/input_TAKE YOUR FREEMOON BAG_name'), 
    'Lorem Ipsum')

WebUI.setText(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Moon Bag Free Trading signals/input_TAKE YOUR FREEMOON BAG_email'), 
    findTestData('CreateAcc Test Data').getValue(4, 3))

WebUI.click(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Moon Bag Free Trading signals/input_TAKE YOUR FREEMOON BAG_hasAgreedToAgreement'))

WebUI.click(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Moon Bag Free Trading signals/button_GET INSTANT ACCESS'))

WebUI.verifyElementPresent(findTestObject('ProfitFarmers_OR/UserAcc_01/Page_Moon Bag Free Trading signals/div_Get Signals Now'), 
    0)

WebUI.closeBrowser()

