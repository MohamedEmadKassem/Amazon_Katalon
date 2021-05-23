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

WebUI.navigateToUrl('https://www.amazon.com.tr/')

WebUI.click(findTestObject('GoToMobileApp/home/cookies'))

WebUI.scrollToElement(findTestObject('GoToMobileApp/home/a_Amazon Mobil Uygulamas'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('GoToMobileApp/home/a_Amazon Mobil Uygulamas'))

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/gp/browse.html?node=14258932031&ref_=footer_mobapp'])

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('GoToMobileApp/Page_Amazon.com.tr Amazon Mobil Uygulamas/AppStore'))

WebUI.switchToWindowUrl('https://apps.apple.com/tr/app/amazon-shopping-made-easy/id297606951?ign-itsct=apps_box&ign-itscg=30200')

WebUI.verifyLinksAccessible(['https://apps.apple.com/tr/app/amazon-shopping-made-easy/id297606951?ign-itsct=apps_box&ign-itscg=30200'])

