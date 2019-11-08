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

WebUI.navigateToUrl('https://bakery-flow.demo.vaadin.com/login')

WebUI.setText(findTestObject('01_First_UI/Page_bakery/input_Explore the code and customize the st_69d70a'), 'admin@vaadin.com')

WebUI.setEncryptedText(findTestObject('01_First_UI/Page_bakery/input_Explore the code and customize the st_b9b14a'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('01_First_UI/Page_bakery/vaadin-button_Sign in'))

// click on Users tab
WebUI.click(findTestObject('01_First_UI/Page_Storefront/a_Users'))

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

// wait for 2 seconds
WebUI.delay(2)

//Verify Users page opened
verifyWindowTitle('Users')

//Verify admin role recorded
WebUI.verifyElementText(findTestObject('01_First_UI/Page_Users/vaadin-grid-cell-content_admin'), 'admin')

// log off
WebUI.click(findTestObject('01_First_UI/Page_Users/a_Logout'))

//close browser
WebUI.closeBrowser()


void verifyWindowTitle(String title) {
    String titleWindow = WebUI.getWindowTitle()

    WebUI.verifyMatch(titleWindow, title, true)
}

