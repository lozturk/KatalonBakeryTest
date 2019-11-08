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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bakery.demo.vaadin.com/login.html')

WebUI.setText(findTestObject('02_Second UI/Page_Bakery/input_Email_username'), 'barista@vaadin.com')

WebUI.setEncryptedText(findTestObject('02_Second UI/Page_Bakery/input_Password_password'), 'aAAOQOuXuiQ=')

WebUI.click(findTestObject('02_Second UI/Page_Bakery/button_Sign in'))

WebUI.click(findTestObject('02_Second UI/Page_Bakery/div_Storefront'))

// Verify StoreFront link working/ Storefront Page opened
// wait for 2 seconds
WebUI.delay(2)
WebUI.verifyMatch(WebUI.getUrl(), 'https://bakery.demo.vaadin.com/#!storefront', false)

// Verify Dashboard link working/ Dashboard Page opened
WebUI.click(findTestObject('02_Second UI/Page_Bakery/div_Dashboard'))
// wait for 2 seconds
WebUI.delay(2)
WebUI.verifyMatch(WebUI.getUrl(), 'https://bakery.demo.vaadin.com/#!dashboard', false)

//Verify Logout button working
WebUI.click(findTestObject('02_Second UI/Page_Bakery/div_Log out'))
// wait for 2 seconds
WebUI.delay(2)
WebUI.verifyMatch(WebUI.getUrl(), 'https://bakery.demo.vaadin.com/login.html#!dashboard', false)

WebUI.closeBrowser()


