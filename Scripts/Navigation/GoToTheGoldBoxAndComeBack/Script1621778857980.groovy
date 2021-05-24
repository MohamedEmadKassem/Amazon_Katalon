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

WebUI.openBrowser('https://www.amazon.com.tr/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GoToGoldBoxAndComeBack/HomePage/Cookies'))

WebUI.scrollToElement(findTestObject('GoToGoldBoxAndComeBack/HomePage/PrimeContainer'), 0)

WebUI.waitForElementVisible(findTestObject('GoToGoldBoxAndComeBack/HomePage/a_30 gn boyunca cretsiz dene'), 0)

WebUI.focus(findTestObject('GoToGoldBoxAndComeBack/HomePage/a_30 gn boyunca cretsiz dene'))

WebUI.click(findTestObject('GoToGoldBoxAndComeBack/HomePage/a_30 gn boyunca cretsiz dene'))

WebUI.getUrl()

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/prime'])

WebUI.scrollToPosition(0, 500)

WebUI.scrollToElement(findTestObject('GoToGoldBoxAndComeBack/Page_Amazon.com.tr Amazon Prime/frsatlarContainer'), 0)

WebUI.waitForElementVisible(findTestObject('GoToGoldBoxAndComeBack/Page_Amazon.com.tr Amazon Prime/a_Frsatlar yakala'), 
    0)

WebUI.focus(findTestObject('GoToGoldBoxAndComeBack/Page_Amazon.com.tr Amazon Prime/a_Frsatlar yakala'))

WebUI.click(findTestObject('GoToGoldBoxAndComeBack/Page_Amazon.com.tr Amazon Prime/a_Frsatlar yakala'))

WebUI.getUrl()

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/gp/goldbox'])

