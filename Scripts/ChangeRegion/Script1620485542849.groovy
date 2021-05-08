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

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ABD'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com Online Shopping for Electro_1f0c68/input_EG_a-button-input'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com Online Shopping for Electro_1f0c68/span_United States'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com Online Shopping for Electro_1f0c68/span_United States'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com Online Shopping for Electro_1f0c68/span_United Kingdom'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.com Online Shopping for Electro_1f0c68/input_EG_a-button-input'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.co.uk Low Prices in Electronics_31b41f/input_Sorry, there was a problem saving you_dde164'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ChangeRegion/Page_Amazon.co.uk Low Prices in Electronics_31b41f/a_Brazil'))

WebUI.closeBrowser()

